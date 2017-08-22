package com.cvcompany.vo.chatfirebase.Module.Retrofit;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by vinh on 8/22/2017.
 */

public class ApiClient {
    private Context context;
    private static Retrofit retrofit=null;
    private static String url = "http://192.168.1.12/index/";
    public static Retrofit createRetrofet(){
        if(retrofit==null) {
            retrofit = new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
