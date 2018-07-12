package com.test.amaro.amarotest.data.remote;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by luiszacheu on 12/07/18.
 */
public class ApiClient {

    private static final String BASE_URL = "http://www.mocky.io/";

    private static Retrofit retrofit = null;

    private static int TIMEOUT = 30;

    public static Retrofit getRetrofitInstance() {

        OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        client.networkInterceptors().add(httpLoggingInterceptor);


        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build())
                    .build();
        }

        return retrofit;
    }
}
