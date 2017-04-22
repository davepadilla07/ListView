package com.example.cuc.list_view;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculoRectangulo extends AppCompatActivity {
    private EditText cajaBase;
    private EditText cajaAltura;
    private Resources res;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_rectangulo);

        cajaBase = (EditText)findViewById(R.id.txtBase);
        cajaAltura = (EditText)findViewById(R.id.txtAltura);

        res = this.getResources();

        i = new Intent(this, Cuadrado.class);

        b = new Bundle();

    }

    public void CalculoRec(View v){
        String operacion = res.getString(R.string.rectangulo), num1="", num2="", aux ="",resu;
        int valor1, valor2;
        int resultado;

        num1 = cajaBase.getText().toString();
        num2 = cajaAltura.getText().toString();
        valor1 = Integer.parseInt(num1);
        valor2 = Integer.parseInt(num2);
        resultado = valor1*valor2;
        resu = ""+resultado;

        aux = ""+res.getString(R.string.base)+": "+num1+"\n"+res.getString(R.string.altura)+": "+num2;
        Operacion op = new Operacion(operacion, aux, resu);
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
        cajaBase.setText("");
        cajaAltura.setText("");
        cajaBase.requestFocus();
    }

}
