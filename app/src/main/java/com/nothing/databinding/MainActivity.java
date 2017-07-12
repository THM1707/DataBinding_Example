package com.nothing.databinding;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserAdapter mUserAdapter;
    private RecyclerView mRecyclerUser;
    private List<User> mUserList;
    private final String DEFAULT_NAME = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserList = new ArrayList<>();
        mRecyclerUser = (RecyclerView) findViewById(R.id.recycler_user);
        for(int i= 1; i <= 5; i++){
            mUserList.add(new User(DEFAULT_NAME + " " + i, "123456"));
        }
        mUserList.add(new User(DEFAULT_NAME + "6" , "123456", Color.RED, R.mipmap
            .ic_launcher_round));
        mUserAdapter = new UserAdapter(mUserList);
        mRecyclerUser.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerUser.setAdapter(mUserAdapter);
    }
}
