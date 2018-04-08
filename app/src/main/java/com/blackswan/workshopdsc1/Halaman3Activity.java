package com.blackswan.workshopdsc1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Halaman3Activity extends AppCompatActivity {

    @BindView(R.id.txtnama)
    TextView txtnama;
    @BindView(R.id.txtalamat)
    TextView txtalamat;
    @BindView(R.id.txtusia)
    TextView txtusia;
    @BindView(R.id.btnselesai)
    Button btnselesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
        ButterKnife.bind(this);
        Intent tangkapdata = getIntent();
        //isidata sesuai jenis view
        txtnama.setText(" nama anda :" + tangkapdata.getStringExtra("nM"));
        txtalamat.setText(" alamat anda :" + tangkapdata.getStringExtra("al"));
        txtusia.setText(" usia anda :" + tangkapdata.getStringExtra("US"));
    }

    @OnClick(R.id.btnselesai)
    public void onViewClicked() {
        startActivity(new Intent(Halaman3Activity.this,MainActivity.class));
    }
}
