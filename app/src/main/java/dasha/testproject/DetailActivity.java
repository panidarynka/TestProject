package dasha.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import dasha.testproject.pojo.DataDetail;
import dasha.testproject.pojo.DetailBuilding;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView title, address, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        Integer id = bundle.getInt("id");
        Log.d("id", id.toString());
        imageView = (ImageView) findViewById(R.id.icon);
        title = (TextView) findViewById(R.id.title);
        address = (TextView) findViewById(R.id.address);
        description = (TextView) findViewById(R.id.description);
        network(id);
    }

    public void network(Integer id) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://sunnyislere.aws4apps.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService gitHubService = retrofit.create(GitHubService.class);
        Call<DetailBuilding> call = gitHubService.repoDetails(id);
        call.enqueue(new Callback<DetailBuilding>() {
            @Override
            public void onResponse(Call<DetailBuilding> call, Response<DetailBuilding> response) {
                Log.d("response", String.valueOf(response.code() + " " + response.message()));
                DataDetail dataDetail = response.body().getData();
                Picasso.with(DetailActivity.this).load(DetailActivity.this
                        .getString(R.string.URL) + dataDetail.getImage()).into(imageView);
                title.setText(dataDetail.getTitle());
//                Log.d("title", response.body().getTitle());
                address.setText(dataDetail.getAddress());
                description.setText(dataDetail.getDescription());
            }

            @Override
            public void onFailure(Call<DetailBuilding> call, Throwable t) {
                Log.e("Detail Activity failed loading", t.getMessage());

            }
        });
    }
}
