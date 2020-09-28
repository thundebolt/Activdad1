package com.merino.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_generar, btn_ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn_generar = findViewById(R.id.btn_generar);
    btn_ver = findViewById(R.id.btn_ver);

    btn_generar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intento1 = new Intent(MainActivity.this,Generar_registro.class);
            startActivity(intento1);
        }
    });
btn_ver.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intento2 = new Intent(MainActivity.this,Ver_registro.class);
        startActivity(intento2);
    }
});
    }
}