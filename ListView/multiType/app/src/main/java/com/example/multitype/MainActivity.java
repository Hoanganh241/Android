package com.example.multitype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.multitype.Adapter.UserAdapter;
import com.example.multitype.Unity.User;

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
        userAdapter = new UserAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvUser.setLayoutManager(linearLayoutManager);

        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }
    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.image1, "User 1", true));
        list.add(new User(R.drawable.image2, "User 2", true));
        list.add(new User(R.drawable.image3, "User 3", true));
        list.add(new User(R.drawable.image4, "User 4", true));

        list.add(new User(R.drawable.image1, "User 1", false));
        list.add(new User(R.drawable.image2, "User 2", false));
        list.add(new User(R.drawable.image3, "User 3", false));
        list.add(new User(R.drawable.image4, "User 4", false));

        return list;
    }
}