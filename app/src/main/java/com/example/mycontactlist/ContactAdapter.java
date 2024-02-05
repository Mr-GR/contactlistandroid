package com.example.mycontactlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private ArrayList<String> contactData;

    public ContactAdapter(ArrayList<String> arrayList) {
        this.contactData = arrayList;

    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item_view, parent, false);
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.getContactTextView().setText(contactData.get(position));
    }

    @Override
    public int getItemCount() {
        return contactData.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewContact;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewContact = itemView.findViewById(R.id.textViewName);
        }

        public TextView getContactTextView() {
            return textViewContact;
        }
    }
}