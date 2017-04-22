package com.example.cuc.list_view;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {
    private TextView mostrar;
    private Bundle b;
    private String aux;
    private int  result;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        mostrar = (TextView)findViewById(R.id.txtMostrar);
        b = getIntent().getExtras();
        result = b.getInt("Resultado");
        res = this.getResources();

        aux = res.getString(R.string.resultados)+": "+result;

        mostrar.setText(aux);

    }
}
