package com.cvcompany.vo.chatfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cvcompany.vo.chatfirebase.Module.MyText;
import com.cvcompany.vo.chatfirebase.Module.Retrofit.ApiClient;
import com.cvcompany.vo.chatfirebase.Module.Retrofit.ApiInterface;
import com.cvcompany.vo.chatfirebase.View.MyRecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private ArrayList<MyText> arrayList;
    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        initArraylist();


        apiInterface = ApiClient.createRetrofet().create(ApiInterface.class);
        Call<ArrayList<MyText>> call = apiInterface.getText();
        call.enqueue(new Callback<ArrayList<MyText>>() {
            @Override
            public void onResponse(Call<ArrayList<MyText>> call, Response<ArrayList<MyText>> response) {
                arrayList  = response.body();
                 MyRecyclerView adapter = new MyRecyclerView(MainActivity.this,arrayList );
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<MyText>> call, Throwable t) {

            }
        });
    }

    private void initArraylist() {
        arrayList = new ArrayList<MyText>();

    }
}
