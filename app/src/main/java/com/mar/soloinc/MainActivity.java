package com.mar.soloinc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
    }

    public void clickHS(View view) {
        //gambar rumahsakit
        Intent a = new Intent(this,HS.class) ;
        startActivity(a);
    }

}