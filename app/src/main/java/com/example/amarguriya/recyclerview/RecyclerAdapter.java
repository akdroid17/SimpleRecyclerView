package com.example.amarguriya.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AmaRguRiyA on 27-11-2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {


    private ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();
    Context ctx;

    public RecyclerAdapter(ArrayList<DataProvider> arrayList,Context ctx)
    {
        this.arrayList=arrayList;
        this.ctx=ctx;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new RecyclerViewHolder(view,ctx,arrayList);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider dataProvider=arrayList.get(position);
        holder.img.setImageResource(dataProvider.getImg_res());
        holder.name.setText(dataProvider.getName());
        holder.education.setText(dataProvider.getEdu());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView img;
        TextView name,education;
        Context ctx;
        ArrayList<DataProvider> dataProviders;

        public RecyclerViewHolder(View view, Context ctx,ArrayList<DataProvider> dataProviders)
        {
            super(view);
            this.ctx=ctx;
            this.dataProviders=dataProviders;
            img= (ImageView) view.findViewById(R.id.img);
            name= (TextView) view.findViewById(R.id.name);
            education= (TextView) view.findViewById(R.id.education);
        }

        @Override
        public void onClick(View view) {

            int img_position=getAdapterPosition();
            DataProvider data=this.dataProviders.get(img_position);
            Intent intent=new Intent(this.ctx,Details.class);
            intent.putExtra("Image",data.getImg_res());
            intent.putExtra("Name",data.getName());
            intent.putExtra("Education",data.getEdu());
            this.ctx.startActivity(intent);

        }
    }
}
