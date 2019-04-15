package com.jc.retrofit.wiki.biz;

import com.jc.retrofit.wiki.annotation.JsonParam;
import com.jc.retrofit.wiki.bean.AuthorizationBean;
import com.jc.retrofit.wiki.bean.JsonQueryParametersBean;
import com.jc.retrofit.wiki.bean.Repo;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface GitHubService {
    @GET("users/{user}/repos")
    Call<ResponseBody> listResponseBodyRepos(@Path("user") String user,
                                             @Query("type") String type);

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user,
                               @Query("type") String type);

    @GET("users/{user}/repos")
    Observable<List<Repo>> listRxJava2Repos(@Path("user") String user,
                                            @Query("type") String type);

    @GET("users/{user}/repos")
    Observable<Repo> singleRxJava2Repos(@Path("user") String user,
                                        @Query("type") String type);

    @GET("users/{user}/repos")
    Flowable<List<Repo>> listRxJava2FlowableRepos(@Path("user") String user,
                                                  @Query("type") String type);

    @GET("authorizations")
    Observable<List<AuthorizationBean>> listAuthorizations();

    @GET("/filter")
    Observable<AuthorizationBean/*这里只是随便加的，反正不会有返回结果*/> exampleJsonParam(@JsonParam @Query("value") JsonQueryParametersBean value);


    /**
     * 这个只是测试这么写
     */
    @POST("robots.txt")
    @FormUrlEncoded
    retrofit2.Call<ResponseBody> robotsByEncode(@Field(value = "a", encoded = true) String a);
}