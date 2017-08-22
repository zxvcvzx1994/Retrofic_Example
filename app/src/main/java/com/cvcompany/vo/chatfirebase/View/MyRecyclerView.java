package com.cvcompany.vo.chatfirebase.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cvcompany.vo.chatfirebase.Module.MyText;
import com.cvcompany.vo.chatfirebase.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by vinh on 8/22/2017.
 */

public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHolder>{

    private ArrayList<MyText> arrayList;
    private Context context;
    public MyRecyclerView(Context context, ArrayList<MyText> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyText text = arrayList.get(position);
        holder.txtId.setText(""+text.getId());
        holder.txtText.setText(""+text.getText());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txtId)
        TextView txtId;
        @BindView(R.id.txtText)
        TextView txtText;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
