package com.example.anshuman_hp.qazwsxedc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class postadapter extends RecyclerView.Adapter<postholder> {
    Context c;
    int[] images={R.drawable.avinash,R.drawable.kisan,R.drawable.ic_launcher,R.drawable.kisan};

    public postadapter(Context c) {
        this.c = c;
    }

    @Override
    public postholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.post,parent,false);
        return new postholder(view);
    }

    @Override
    public void onBindViewHolder(postholder holder, int position) {
        holder.descp.setText("SFHJDKGJSD0");
        Glide.with(c)
                .load(R.mipmap.ic_launcher)
                .into(holder.photo);
        holder.name.setText("Anshuman");
        Glide.with(c)
                .load(images[position])
                .into(holder.profimage);

    }
    @Override
    public int getItemCount() {
        return 4;
    }
}
