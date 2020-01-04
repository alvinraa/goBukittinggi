package com.example.alvin.gobukittinggi;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Kuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
    }

    public void makanan1(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner1.class);
        startActivity(intent);
    }

    public void makanan2(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner2.class);
        startActivity(intent);
    }

    public void makanan3(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner3.class);
        startActivity(intent);
    }

    public void makanan4(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner4.class);
        startActivity(intent);
    }

    public void makanan5(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner5.class);
        startActivity(intent);
    }

    public void makanan6(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner6.class);
        startActivity(intent);
    }

    public void makanan7(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner7.class);
        startActivity(intent);
    }

    public void makanan8(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner8.class);
        startActivity(intent);
    }

    public void makanan9(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner9.class);
        startActivity(intent);
    }

    public void makanan10(View view) {
        Intent intent = new Intent(Kuliner.this, kuliner10.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
        finish();
    }
}
