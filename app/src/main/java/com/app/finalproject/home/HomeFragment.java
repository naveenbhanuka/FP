package com.app.finalproject.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.finalproject.MainActivity;
import com.app.finalproject.R;
import com.app.finalproject.adapters.PostsAdapter;
import com.app.finalproject.add_post.AddPostActivity;
import com.app.finalproject.models.Post;
import com.app.finalproject.registration.RegistrationActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {
    ImageView addPost;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.fragment_home,container,false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_home);

        Post[] myPostData = new Post[] {
                new Post(1,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","John Doe"),
                new Post(2,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","Alex Hales"),
                new Post(3,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","Josh Buttler"),
                new Post(4,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","John Snow"),
                new Post(5,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","Peter Paker"),
                new Post(6,"Lorem Ipsum is simply dummy text…", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ","John Wick")
        };


        PostsAdapter adapter = new PostsAdapter(myPostData,requireContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));

        addPost = rootView.findViewById(R.id.iv_add_post);
        addPost.setOnClickListener(this);


        return rootView;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_add_post:
                openAddPostActivity();
                break;
            default:
                break;
        }
    }

    private void openAddPostActivity() {
        Intent intent = new Intent(requireActivity(), AddPostActivity.class);
        startActivity(intent);
    }
}
