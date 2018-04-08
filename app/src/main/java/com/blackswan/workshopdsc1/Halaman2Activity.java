package com.blackswan.workshopdsc1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Halaman2Activity extends AppCompatActivity {

    @BindView(R.id.edtnama)
    EditText edtnama;
    @BindView(R.id.edtalamat)
    EditText edtalamat;
    @BindView(R.id.edtusia)
    EditText edtusia;
    @BindView(R.id.btnok)
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnok)
    public void onViewClicked() {
        String nama = edtnama.getText().toString();
        String alamat = edtalamat.getText().toString();
        String usia = edtusia.getText().toString();

        if (TextUtils.isEmpty(nama)){
            edtnama.setError(getString(R.string.namatidakkosong));
            edtnama.requestFocus();
        }else if(TextUtils.isEmpty(alamat)){
            edtalamat.setError(getString(R.string.alamattidakkosong));
            edtalamat.requestFocus();
        }else if(TextUtils.isEmpty(usia)){
            edtusia.setError(getString(R.string.usiatidakkosong));
            edtusia.requestFocus();
        }
        else{
            Intent kirimdata = new Intent(Halaman2Activity.this,Halaman3Activity.class);
            kirimdata.putExtra("nM",nama);
            kirimdata.putExtra("al",alamat);
            kirimdata.putExtra("US",usia);
            startActivity(kirimdata);
            finish();
        }
    }
}
