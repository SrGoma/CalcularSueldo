/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aragon.unam;

import java.util.Scanner;

/**
 *
 * @author pc2
 */
public class calcularSalario {

    
    Scanner entrada = new Scanner(System.in);
    
    private double salarioTotal = 0;

    public void setSalarioEmpleado(int horasEmpleado, double salarioEmpleado) {
        int horas;
        int horasExtra;
        double salario;
        
        
        horas = horasEmpleado;
        salario = salarioEmpleado;
        
        if(horas <= 40){
            salarioTotal = salario * horas;
        }else if(horas > 40){
            horasExtra = horas - 40;
            salarioTotal = ((salario * 1.5) * horasExtra) + (salario * 40);
        }

        
    }
    
    public double getSalarioEmpleado(){
        return salarioTotal;
    }
}
