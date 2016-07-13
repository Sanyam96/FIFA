package com.example.sanyam.fifa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sanyam on 11-07-2016.
 */
public class TeamClient {
    private static fifaAPIInterface services;

    public static fifaAPIInterface getServices(){

        if(services == null ) {
            OkHttpClient client = new OkHttpClient.Builder().build();


            Retrofit r = new Retrofit.Builder().baseUrl("http://live.mobileapp.fifa.com/api/wc/").
                    addConverterFactory(GsonConverterFactory.create(
                            new GsonBuilder().create())).client(client).build();

            services = r.create(fifaAPIInterface.class);

        }

        return services;
    }
}
