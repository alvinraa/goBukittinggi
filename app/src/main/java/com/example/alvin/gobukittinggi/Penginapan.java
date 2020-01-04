package com.example.alvin.gobukittinggi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Penginapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penginapan);
    }

    public void penginapan1(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan1.class);
        startActivity(intent);
    }

    public void penginapan2(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan2.class);
        startActivity(intent);
    }

    public void penginapan3(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan3.class);
        startActivity(intent);
    }

    public void penginapan4(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan4.class);
        startActivity(intent);
    }

    public void penginapan5(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan5.class);
        startActivity(intent);
    }

    public void penginapan6(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan6.class);
        startActivity(intent);
    }

    public void penginapan7(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan7.class);
        startActivity(intent);
    }

    public void penginapan8(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan8.class);
        startActivity(intent);
    }

    public void penginapan9(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan9.class);
        startActivity(intent);
    }

    public void penginapan10(View view) {
        Intent intent = new Intent(Penginapan.this, penginapan10.class);
        startActivity(intent);
    }

    public void back(View view) {
        onBackPressed();
        finish();
    }
}
