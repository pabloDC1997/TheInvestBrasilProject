package com.theinverstbrasil.theinvestbrasilserver.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

	public static Retrofit getClient(String url) {
		return new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create())
				.client(buildOkHttpClient())
				.baseUrl(url)
				.build();
	}
	
    private static OkHttpClient buildOkHttpClient() {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.addInterceptor(loggingInterceptor);
        return client.build();
    }
}
