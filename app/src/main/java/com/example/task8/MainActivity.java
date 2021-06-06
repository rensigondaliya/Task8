package com.example.task8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    int[] image = {R.drawable.adidas,R.drawable.bata,R.drawable.fashion,R.drawable.fila,R.drawable.nike};
    String[] name = {"this is adidas ", "this is bata ", "this is fashion", "this is fila ", "this is nike "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.lvname);

        Myadpter myadpter = new Myadpter(image,name,MainActivity.this);
        lv1.setAdapter(myadpter);

    }
}