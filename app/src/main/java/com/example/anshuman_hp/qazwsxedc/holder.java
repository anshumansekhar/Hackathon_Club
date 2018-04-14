package com.example.anshuman_hp.qazwsxedc;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.jivimberg.library.AutoResizeTextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class holder extends RecyclerView.ViewHolder {
    CircleImageView profimage;
    AutoResizeTextView profname;
    public holder(View itemView) {
        super(itemView);
        profimage=(CircleImageView)itemView.findViewById(R.id.prof_image);
        profname=(AutoResizeTextView)itemView.findViewById(R.id.profname);
    }
}
