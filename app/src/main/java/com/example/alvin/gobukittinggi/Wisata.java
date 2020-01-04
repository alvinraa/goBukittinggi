package com.example.alvin.gobukittinggi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
    }

    public void wisata1(View view) {
        Intent intent = new Intent(Wisata.this, wisata1.class);
        startActivity(intent);
    }

    public void wisata2(View view) {
        Intent intent = new Intent(Wisata.this, wisata2.class);
        startActivity(intent);
    }

    public void wisata3(View view) {
        Intent intent = new Intent(Wisata.this, wisata3.class);
        startActivity(intent);
    }

    public void wisata4(View view) {
        Intent intent = new Intent(Wisata.this, wisata4.class);
        startActivity(intent);
    }

    public void wisata5(View view) {
        Intent intent = new Intent(Wisata.this, wisata5.class);
        startActivity(intent);
    }

    public void wisata6(View view) {
        Intent intent = new Intent(Wisata.this, wisata6.class);
        startActivity(intent);
    }

    public void wisata7(View view) {
        Intent intent = new Intent(Wisata.this, wisata7.class);
        startActivity(intent);
    }

    public void wisata8(View view) {
        Intent intent = new Intent(Wisata.this, wisata8.class);
        startActivity(intent);
    }

    public void wisata9(View view) {
        Intent intent = new Intent(Wisata.this, wisata9.class);
        startActivity(intent);
    }

    public void wisata10(View view) {
        Intent intent = new Intent(Wisata.this, wisata10.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
        finish();
    }
}
