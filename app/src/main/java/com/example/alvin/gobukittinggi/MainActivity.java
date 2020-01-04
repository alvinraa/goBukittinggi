package com.example.alvin.gobukittinggi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    RelativeLayout rlexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button keluar
       rlexit = findViewById(R.id.exitbtn);
       rlexit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showAlertDialog();
           }
       });
    }

    @Override
    public void onBackPressed(){
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Apakah anda ingin keluar dari aplikasi ini?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();


                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    //KODINGAN EXIT DI ATAS

    //KODINGAN BUAT PINDAH LAYER BAWAH
    public void penginapan(View view){
        Intent intent = new Intent(MainActivity.this, Penginapan.class);
        startActivity(intent);
    }

    public void kuliner(View view){
        Intent intent = new Intent(MainActivity.this, Kuliner.class);
        startActivity(intent);
    }

    public void wisata(View view){
        Intent intent = new Intent(MainActivity.this, Wisata.class);
        startActivity(intent);
    }

    public void about(View view){
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }
}
