package com.example.cuc.list_view;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculoCuadrado extends AppCompatActivity {
    private EditText cajaNumero;
    private Resources res;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_cuadrado);

        cajaNumero = (EditText)findViewById(R.id.txtNumero);

        res = this.getResources();

        i = new Intent(this, Cuadrado.class);

        b = new Bundle();

    }

    public void Calculo(View v){
        String operacion = res.getString(R.string.cuadrado), num="", aux ="",resu;
        int valor;
        int resultado;

        num = cajaNumero.getText().toString();
        valor = Integer.parseInt(num);
        resultado = valor*valor;
        resu = ""+resultado;

        aux = "Lado: "+num;
        Operacion op = new Operacion(operacion,aux, resu);
        op.guardar();
        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();

        b.putInt("Resultado", resultado);


        i.putExtras(b);

        startActivity(i);

        limpiar();
    }

    public void borrar(View v){
        limpiar();
    }

    public void limpiar(){
        cajaNumero.setText("");
        cajaNumero.requestFocus();
    }

}
