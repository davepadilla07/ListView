package com.example.cuc.list_view;

import java.util.ArrayList;

/**
 * Created by CUC on 22/04/2017.
 */
public class Datos {

    private static ArrayList<Operacion> operaciones = new ArrayList();

    public static void guardar(Operacion p){
        operaciones.add(p);
    }

    public static ArrayList<Operacion> getDatos() {
        return operaciones;
    }

}
