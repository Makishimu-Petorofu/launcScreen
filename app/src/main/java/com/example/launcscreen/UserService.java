package com.example.launcscreen;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

 @POST("authenticate/")
 Call<LoginResponce> userLogin(@Body LoginRequest loginRequest);
}
