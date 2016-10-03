package com.example.uber.tugas2praktikummopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by uber on 03/10/16.
 */
public class login extends AppCompatActivity {

    @BindView(R.id.etusern) EditText usern;
    @BindView(R.id.etpass) EditText pass;
    @BindView(R.id.btnlogin) Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_login);
        ButterKnife.bind(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usern.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),"Selamat Anda Berhasil Login",Toast.LENGTH_LONG).show();
                    Intent berhasil = new Intent(login.this, MainActivity.class);
                    startActivity(berhasil);
                    finish();

                    usern.setText("");
                    pass.setText("");

                }else
                {
                    Toast.makeText(getApplicationContext(),"Gagal!\nUsername dan Password tidak sesuai",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
