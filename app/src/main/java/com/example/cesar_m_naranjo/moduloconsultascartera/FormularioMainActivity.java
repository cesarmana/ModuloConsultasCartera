package com.example.cesar_m_naranjo.moduloconsultascartera;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class FormularioMainActivity extends AppCompatActivity {
    EditText nombre, cedula, celular, cargo, correo, comentario;
    CheckBox aceptoCondiciones;
    String aceptoC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        nombre = (EditText)findViewById(R.id.editTextNombre);
        cedula = (EditText)findViewById(R.id.editTextCedula);
        celular = (EditText)findViewById(R.id.editTextCelular);
        cargo = (EditText)findViewById(R.id.editTextCargo);
        correo = (EditText)findViewById(R.id.editTextEmail);
        comentario = (EditText)findViewById(R.id.editTextComentario);
        aceptoCondiciones = (CheckBox)findViewById(R.id.checkBoxAceptoCondiciones);
        aceptoC="";
    }

    public void inscribirse(View v){
        Intent i2 = new Intent(this,inscripcionOkMainActivity.class);
        Bundle b = new Bundle();
        b.putString("Nom",nombre.getText().toString());
        b.putString("Cedula",cedula.getText().toString());
        b.putString("Celular",celular.getText().toString());
        b.putString("Cargo",cargo.getText().toString());
        b.putString("Correo",correo.getText().toString());
        b.putString("Comentario", comentario.getText().toString());
        if (aceptoCondiciones.isChecked()) {
            aceptoC="Acepta las condiciones de inscripcion";
        }
        b.putString("AceptaCondiciones",aceptoC);
        i2.putExtras(b);
        startActivity(i2);
    }
}
