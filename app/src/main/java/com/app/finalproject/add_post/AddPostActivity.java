package com.app.finalproject.add_post;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.app.finalproject.R;

public class AddPostActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAddPost;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Add Post");


        btnAddPost = findViewById(R.id.button_add_post);
        btnAddPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_add_post:
                addPost();
                break;
            default:
                break;
        }
    }

    private void addPost() {
        finish();
    }
}
