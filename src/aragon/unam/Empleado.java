package aragon.unam;

import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc2
 */
public class Empleado {
   private String nombreEmpleado;
   private int horas;
   private double tarifa;
   

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleados) {
        nombreEmpleado = nombreEmpleados;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int hora) {
        horas = hora;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifas) {
        tarifa = tarifas;
    }
    
}
