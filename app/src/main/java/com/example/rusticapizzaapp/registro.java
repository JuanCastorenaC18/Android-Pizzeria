package com.example.rusticapizzaapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        EditText edit_name = findViewById(R.id.edit_name);
        EditText edit_lastname = findViewById(R.id.edit_lastname);
        EditText edit_email = findViewById(R.id.edit_email);
        EditText edit_pass = findViewById(R.id.edit_pass);
        EditText edit_confpass = findViewById(R.id.edit_confpass);

        findViewById(R.id.btn_registro).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_name.getText().toString().isEmpty() || edit_lastname.getText().toString().isEmpty() || edit_email.getText().toString().isEmpty() || edit_pass.getText().toString().isEmpty() || edit_confpass.getText().toString().isEmpty()) {
                    new AlertDialog.Builder(registro.this)
                            .setTitle("Rustica Pizza App")
                            .setMessage("Debes de llenar todos los campos")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).show();
                } else{
                    startActivity(new Intent(registro.this, MainHome.class));
                }
            }
        });
    }
}