package com.cvcompany.vo.chatfirebase.Module.Retrofit;

import android.telecom.Call;

import com.cvcompany.vo.chatfirebase.Module.MyText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.POST;

/**
 * Created by vinh on 8/22/2017.
 */

public interface ApiInterface {
    @POST("getdata.php")
    retrofit2.Call<ArrayList<MyText>> getText();
}
