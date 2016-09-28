package dasha.testproject;


import dasha.testproject.pojo.Buildings;
import retrofit2.Call;

import retrofit2.http.GET;

/**
 * Created by dasha on 28.09.16.
 */
public interface GitHubService {
    @GET("/v1/building/list")
    Call<Buildings> repoHouses();
}
