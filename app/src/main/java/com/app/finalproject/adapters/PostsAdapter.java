package com.app.finalproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.app.finalproject.R;
import com.app.finalproject.models.Post;
import com.app.finalproject.view_post.ViewPostActivity;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {

    private Post[] postList;
    private Context context;

    public PostsAdapter(Post[] postList,Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_post, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.ViewHolder holder, int position) {
        final Post post = postList[position];

        holder.tvTitle.setText(post.getTitle());
        holder.tvDescription.setText(post.getDescription());
        holder.tvName.setText(post.getName());

        holder.cv_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ViewPostActivity.class);
                intent.putExtra("POST_OBJECT",post);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return postList.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle,tvDescription,tvName;
        public ConstraintLayout cv_container;

        public ViewHolder(View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvName = itemView.findViewById(R.id.tv_name);
            cv_container = itemView.findViewById(R.id.cv_container);

        }
    }
}
