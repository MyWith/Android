package com.example.locationpet;

import com.example.locationpet.dto.Recycler;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {
    String RECYCLER_URL = "http://112.153.247.72:8080/api/";

    @GET("post/new-post")
    Call<Recycler.Response> GetRequest(

    );
}
