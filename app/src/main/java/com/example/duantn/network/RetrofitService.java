package com.example.duantn.network;


import com.example.duantn.api_map_direction.Example;
import com.example.duantn.morder.Feedback;
import com.example.duantn.morder.Tour;
import com.example.duantn.morder.TourInfor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("maps/api/directions/json")
    Call<Example> getMapDirection(@Query("origin") String origin,
                                  @Query("destination") String destination,
                                  @Query("waypoints") String waypoints,
                                  @Query("key") String key);

    @GET("get-tour-list")
    Call<List<Tour>> getTourList(@Query("language") String language);

    @GET("get-place-list")
    Call<List<TourInfor>> getTourInfor(@Query("language") String language,
                                       @Query("category") String category);

    @GET("get-all-report")
    Call<List<Feedback>> getReport(@Query("vehicle") String vehicle);


    @POST("add-report")
    @FormUrlEncoded
    Call<String> postReport(@Field("user") String user,
                                    @Field("vehicle") String vehicle,
                                    @Field("star") float star,
                                    @Field("report") String report,
                                    @Field("name") String name,
                                    @Field("avatar") String avatar,
                                    @Field("date") String date);

}
