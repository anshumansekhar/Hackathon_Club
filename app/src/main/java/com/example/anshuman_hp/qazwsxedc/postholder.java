package com.example.anshuman_hp.qazwsxedc;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jivimberg.library.AutoResizeTextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Anshuman-HP on 31-03-2017.
 */

public class postholder  extends RecyclerView.ViewHolder{
    CircleImageView profimage;
    TextView name;
    ImageView photo;
    AutoResizeTextView descp;


    public postholder(View itemView) {
        super(itemView);
        profimage=(CircleImageView)itemView.findViewById(R.id.profileimage);
        name=(TextView)itemView.findViewById(R.id.profilename);
        photo=(ImageView)itemView.findViewById(R.id.photo);
        descp=(AutoResizeTextView)itemView.findViewById(R.id.descp);
    }
}
