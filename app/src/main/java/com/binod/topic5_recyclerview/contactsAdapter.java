package com.binod.topic5_recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class contactsAdapter extends RecyclerView.Adapter<contactsAdapter.ContactsViewHolder> {

    Context context;//to get name of activities that java class get data from activity

    List<Contacts> contactsList;//to get list of contact in array

    public contactsAdapter(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
        //attach in design
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        //attach data in design by one by one
    }

    @Override
    public int getItemCount() {
        return 0;
        //count number of list or data shown
    }

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
