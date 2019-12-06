package com.binod.topic5_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class contactsAdapter {

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        //declaration
        ImageView imgRoman;
        TextView tvName, tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);

            //binding
            imgRoman = itemView.findViewById(R.id.imgRoman);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}
