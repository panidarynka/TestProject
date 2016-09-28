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
import android.widget.Toast;

import com.facebook.AccessToken;

import dasha.testproject.pojo.Buildings;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerAdapter mRecyclerAdapter;

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
        NetworkOperation networkOperation = new NetworkOperation();
        networkOperation.network();
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(MainActivity.this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(MainActivity.this, "on clicked "+position, Toast.LENGTH_SHORT).show();
                    }
                })
        );

    }


    private class NetworkOperation {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getString(R.string.URL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubService gitHubService = retrofit.create(GitHubService.class);

        private void network() {

            Call<Buildings> call = gitHubService.repoHouses();
            call.enqueue(new Callback<Buildings>() {
                @Override
                public void onResponse(Call<Buildings> call, Response<Buildings> response) {
                    mRecyclerAdapter = new RecyclerAdapter(response.body().getData().getBuildings(), MainActivity.this);
                    mRecyclerView.setAdapter(mRecyclerAdapter);

                }

                @Override
                public void onFailure(Call<Buildings> call, Throwable t) {
                    Log.e("response failed", t.getMessage());

                }
            });
        }
    }

}
