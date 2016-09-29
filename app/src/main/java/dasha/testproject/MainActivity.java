package dasha.testproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import dasha.testproject.pojo.Building;
import dasha.testproject.pojo.Buildings;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerAdapter mRecyclerAdapter;
    List<Building> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("user_name", null);
//        if (AccessToken.getCurrentAccessToken() == null) {
//            startActivity(new Intent(MainActivity.this, LoginActivity.class));
//        }
        if (name == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
        String email = sharedPreferences.getString("email", null);
        setContentView(R.layout.activity_main);
        TextView nameUser = (TextView) findViewById(R.id.profile_text_view);
        nameUser.setText(name + ", " + email);
        network();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(MainActivity.this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Toast.makeText(MainActivity.this, mList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
//                        Log.d("id", mList.get(position).getId().toString());
                        intent.putExtra("id", mList.get(position).getId());
                        startActivity(intent);
                    }
                })
        );
    }

    private void network() {

        GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);

        Call<Buildings> call = gitHubService.repoHouses();
        call.enqueue(new Callback<Buildings>() {
            @Override
            public void onResponse(Call<Buildings> call, Response<Buildings> response) {
                mList = response.body().getData().getBuildings();
                mRecyclerAdapter = new RecyclerAdapter(mList, MainActivity.this);
                mRecyclerView.setAdapter(mRecyclerAdapter);
            }

            @Override
            public void onFailure(Call<Buildings> call, Throwable t) {
                Log.e("response failed", t.getMessage());

            }
        });
    }
}

