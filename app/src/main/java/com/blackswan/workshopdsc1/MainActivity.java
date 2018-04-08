package com.blackswan.workshopdsc1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //deklarasi variable scr global
    Button btnsatu, btntiga, btnempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "tampil OnCreate", Toast.LENGTH_LONG).show();
       Log.d("test","oncreate");
        //inisialisasi atau  link atau bind
        btnsatu = (Button) findViewById(R.id.btn4);
        Button btndua = (Button) findViewById(R.id.btn2);
        btntiga = (Button) findViewById(R.id.btn3);
        btnempat = (Button) findViewById(R.id.btn4);
        //aksi
        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,Halaman2Activity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "tampil OnStart", Toast.LENGTH_SHORT).show();
        Log.d("test","onstart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "tampil OnStop", Toast.LENGTH_SHORT).show();
        Log.d("test","onstop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "tampil onRestart", Toast.LENGTH_SHORT).show();
        Log.d("test","onrestart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "tampil OnResume", Toast.LENGTH_SHORT).show();
        Log.d("test","onresume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "tampil onPause", Toast.LENGTH_SHORT).show();
        Log.d("test","onpause");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "tampil OnDestroy", Toast.LENGTH_SHORT).show();
        Log.d("test","ondestroy");

    }

//method ketika tombol back ditekan
    @Override
    public void onBackPressed() {
        AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
        keluar.setTitle("informasi");
        keluar.setMessage("apakah anda yakin ingin keluar aplikasi ?");
        keluar.setIcon(R.mipmap.ic_buah);
        keluar.setPositiveButton("iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            System.exit(0);
            moveTaskToBack(true);
            }
        });
        keluar.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        keluar.show();

    }
}
