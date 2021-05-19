package com.example.retrofitsimplerequest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

    private Context mContext;
    private List<Post> postsList;

    public Adaptery(Context mContext, List<Post> postsList) {
        this.mContext = mContext;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v = layoutInflater.inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText("ID: " + String.valueOf(postsList.get(position).getId()));
        holder.userID.setText("UserID: " + String.valueOf(postsList.get(position).getUserId()));
        holder.title.setText("Title: " + postsList.get(position).getTitle());
        holder.body.setText("Detail: " + postsList.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    //Create Inner Class - ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title, id, userID, body;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textViewTitle);
            id = itemView.findViewById(R.id.textViewID);
            userID = itemView.findViewById(R.id.textViewUserID);
            body = itemView.findViewById(R.id.textViewBody);


        }
    }
}
