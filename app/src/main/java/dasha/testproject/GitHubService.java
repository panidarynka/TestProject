package dasha.testproject;


import dasha.testproject.pojo.Buildings;
import dasha.testproject.pojo.DetailBuilding;
import retrofit2.Call;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dasha on 28.09.16.
 */
public interface GitHubService {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://sunnyislere.aws4apps.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("/v1/building/list")
    Call<Buildings> repoHouses();

    @GET("/v1/building/detail")
    Call<DetailBuilding> repoDetails(@Query("id") Integer id);
}
