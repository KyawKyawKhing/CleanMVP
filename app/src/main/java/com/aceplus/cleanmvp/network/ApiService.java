package com.aceplus.cleanmvp.network;

import com.aceplus.cleanmvp.data.vo.NetworkResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by kkk on 7/9/2018.
 */

public interface ApiService {

    @GET("bins/1bsqcn/")
    Observable<NetworkResponse> fetchDataFromNetwork();
}
