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

public class adapter extends RecyclerView.Adapter<holder> {
    Context c;
    int[] images={R.drawable.avinash,R.drawable.kisan,R.drawable.ic_launcher,R.drawable.kisan};

    public adapter(Context c) {
        this.c = c;
    }

    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.member_card,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(holder holder, int position) {
        holder.profname.setText("Anshuman");
        Glide.with(c)
                .load(images[position])
                .into(holder.profimage);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
