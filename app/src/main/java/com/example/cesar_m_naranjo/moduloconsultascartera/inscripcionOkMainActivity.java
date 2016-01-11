package com.example.cesar_m_naranjo.moduloconsultascartera;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class inscripcionOkMainActivity extends AppCompatActivity {

    TextView nombre, cedula, celular, cargo, correo, comentario, aceptoCondiciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_ok_main);
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
        nombre=(TextView)findViewById(R.id.textViewNombre);
        cedula=(TextView)findViewById(R.id.textViewCedula);
        celular=(TextView)findViewById(R.id.textViewCelular);
        cargo=(TextView)findViewById(R.id.textViewCargo);
        correo=(TextView)findViewById(R.id.textViewCorreo);
        comentario=(TextView)findViewById(R.id.textViewComentario);
        aceptoCondiciones=(TextView)findViewById(R.id.textViewAceptoCondiciones);

        Bundle bundle = this.getIntent().getExtras();

        nombre.setText("Nombre :"+bundle.get("Nom"));
        cedula.setText("Cedula :"+bundle.get("Cedula"));
        celular.setText("Celular :"+bundle.get("Celular"));
        cargo.setText("Cargo :"+bundle.get("Cargo"));
        correo.setText("Correo :"+bundle.get("Correo"));
        comentario.setText("Comentario :"+bundle.get("Comentario"));
        aceptoCondiciones.setText("Condiciones :"+bundle.get("AceptaCondiciones"));


    }

    public void botonsalir(View v){
        Intent intent = new Intent(this, presentacionMainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

}
