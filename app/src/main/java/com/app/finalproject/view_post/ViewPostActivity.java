package com.app.finalproject.view_post;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.app.finalproject.R;
import com.app.finalproject.models.Post;

public class ViewPostActivity extends AppCompatActivity {

    TextView textTitle,textDescription,textName,textName2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("View Post");

        textDescription = findViewById(R.id.tv_view_description);
        textTitle = findViewById(R.id.tv_view_name);
        textName = findViewById(R.id.tv_view_name);
        textName2 = findViewById(R.id.tv_teachers_name);


        //get data from recycler view
        Post mPost = (Post) getIntent().getSerializableExtra("POST_OBJECT");



        setData(mPost);
    }

    private void setData(Post mPost) {
      textTitle.setText(mPost.getTitle());
      textDescription.setText(mPost.getDescription());
      textName.setText(mPost.getName());
      textName2.setText(mPost.getName());
    }
}
