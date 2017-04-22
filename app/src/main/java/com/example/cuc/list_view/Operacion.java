package com.example.cuc.list_view;

/**
 * Created by CUC on 22/04/2017.
 */
public class Operacion {

    private String nombreOperacion;
    private String valorLado;
    private String resultado;

    public Operacion(String nombreOperacion, String valorLado, String resultado) {
        this.nombreOperacion = nombreOperacion;
        this.valorLado = valorLado;
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getValorLado() {
        return valorLado;
    }

    public void setValorLado(String valorLado) {
        this.valorLado = valorLado;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public void guardar(){
        Datos.guardar(this);
    }

}
