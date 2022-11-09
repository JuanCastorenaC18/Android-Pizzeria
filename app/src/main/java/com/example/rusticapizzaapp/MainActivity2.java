package com.example.rusticapizzaapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText edit_user = findViewById(R.id.edit_user);
        EditText edit_pass = findViewById(R.id.edit_pass);

        findViewById(R.id.Loginone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_pass.getText().toString().isEmpty() || edit_user.getText().toString().isEmpty()) {
                    new AlertDialog.Builder(MainActivity2.this)
                            .setTitle("Rustica Pizza App")
                            .setMessage("Debes de escribir el nombre de usuario y el password")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).show();
                } else{
                    startActivity(new Intent(MainActivity2.this, MainHome.class));
                }
            }
        });

        findViewById(R.id.btn_registrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, registro.class));
            }
        });

        findViewById(R.id.btn_redes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity2.this)
                        .setTitle("Rustica Pizza App")
                        .setMessage("Esta opcion sigue en proceso")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
            }
        });
    }
}