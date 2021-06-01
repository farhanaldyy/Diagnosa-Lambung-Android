package com.example.sistempakar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class PenyakitActivity extends AppCompatActivity {
    private RecyclerView rv_penyakit;
    private ArrayList<Penyakit> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        rv_penyakit = findViewById(R.id.rv_penyakit);
        rv_penyakit.setHasFixedSize(true);

        list.addAll(PenyakitData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rv_penyakit.setLayoutManager(new LinearLayoutManager(this));
        ListPenyakitAdapter listPenyakitAdapter = new ListPenyakitAdapter(list);
        rv_penyakit.setAdapter(listPenyakitAdapter);
    }

}