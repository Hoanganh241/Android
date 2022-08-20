package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.CategoryAdapter;
import com.example.recyclerview.Entity.Book;
import com.example.recyclerview.Entity.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);

    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.image1, "Book 1"));
        listBook.add(new Book(R.drawable.image2, "Book 2"));
        listBook.add(new Book(R.drawable.image3, "Book 3"));
        listBook.add(new Book(R.drawable.image4, "Book 4"));

        listBook.add(new Book(R.drawable.image1, "Book 1"));
        listBook.add(new Book(R.drawable.image2, "Book 2"));
        listBook.add(new Book(R.drawable.image3, "Book 3"));
        listBook.add(new Book(R.drawable.image4, "Book 4"));

        listCategory.add(new Category("Category 1", listBook));
        listCategory.add(new Category("Category 2", listBook));
        listCategory.add(new Category("Category 3", listBook));
        listCategory.add(new Category("Category 4", listBook));

        return listCategory;
    }
}