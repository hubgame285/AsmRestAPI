package com.example.asm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    String DOMAIN = "http://10.82.0.103:3000/";

    @GET("/api/list")
    Call<List<CarModel>> getCars();


}
