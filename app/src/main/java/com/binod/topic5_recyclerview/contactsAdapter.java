package com.binod.topic5_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

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
        //attach in design or view holder
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_laypit, parent, false);
        return new ContactsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        //attach data or design  in viewholder by one by one
        Contacts contacts = contactsList.get(position);
        holder.imgRoman.setImageResource(contacts.getImage());
        holder.tvName.setText(contacts.getName());
        holder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
        //count number of list or data shown
        //how many times to show  data or how many data are
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {

        //declaration
        CircleImageView imgRoman;
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
