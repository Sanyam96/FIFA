package com.example.sanyam.fifa;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sanyam on 11-07-2016.
 */
public interface fifaAPIInterface {

    @GET("teams")
    Call<teamDataResponse> getTeams();
}
