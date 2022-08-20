package com.example.recyclerview_using_linearlayout_vertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.image1, "Nguyen Hoang Anh"));
        list.add(new User(R.drawable.image2, "Nguyen Anh"));
        list.add(new User(R.drawable.image3, "An Pham"));
        list.add(new User(R.drawable.image4, "Pham An"));

        list.add(new User(R.drawable.image1, "Nguyen Hoang Anh"));
        list.add(new User(R.drawable.image2, "Nguyen Anh"));
        list.add(new User(R.drawable.image3, "An Pham"));
        list.add(new User(R.drawable.image4, "Pham An"));

        list.add(new User(R.drawable.image1, "Nguyen Hoang Anh"));
        list.add(new User(R.drawable.image2, "Nguyen Anh"));
        list.add(new User(R.drawable.image3, "An Pham"));
        list.add(new User(R.drawable.image4, "Pham An"));

        return list;
    }
}