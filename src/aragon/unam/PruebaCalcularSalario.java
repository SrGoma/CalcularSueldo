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
public class PruebaCalcularSalario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Empleado E1 = new Empleado();
        Empleado E2 = new Empleado();
        Empleado E3 = new Empleado();
        
        calcularSalario C1 = new calcularSalario();
        
        String nombre;
        int horas;
        double salarioHora;

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        E1.setNombreEmpleado(nombre);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = entrada.nextInt();
        E1.setHoras(horas);
        System.out.println("Ingrese el salario por hora: ");
        salarioHora = entrada.nextDouble();
        E1.setTarifa(salarioHora);
        entrada.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        E2.setNombreEmpleado(nombre);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = entrada.nextInt();
        E2.setHoras(horas);
        System.out.println("Ingrese el salario por hora: ");
        salarioHora = entrada.nextDouble();
        E2.setTarifa(salarioHora);
        entrada.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        E3.setNombreEmpleado(nombre);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = entrada.nextInt();
        E3.setHoras(horas);
        System.out.println("Ingrese el salario por hora: ");
        salarioHora = entrada.nextDouble();
        E3.setTarifa(salarioHora);
        entrada.nextLine();
        
        C1.setSalarioEmpleado(E1.getHoras(), E1.getTarifa());
        System.out.printf("Nombre del empleado: %s\n", E1.getNombreEmpleado());
        System.out.printf("Horas trabajadas: %dhrs\n", E1.getHoras());
        System.out.printf("Salario por hora: $%.2f\n", E1.getTarifa());
        System.out.printf("Salario total semanal: $%.2f\n", C1.getSalarioEmpleado());
        System.out.println("------------------------------------------------------");
        C1.setSalarioEmpleado(E2.getHoras(), E2.getTarifa());
        System.out.printf("Nombre del empleado: %s\n", E2.getNombreEmpleado());
        System.out.printf("Horas trabajadas: %dhrs\n", E2.getHoras());
        System.out.printf("Salario por hora: $%.2f\n", E2.getTarifa());
        System.out.printf("Salario total semanal: $%.2f\n", C1.getSalarioEmpleado());
        System.out.println("------------------------------------------------------");
        C1.setSalarioEmpleado(E3.getHoras(), E3.getTarifa());
        System.out.printf("Nombre del empleado: %s\n", E3.getNombreEmpleado());
        System.out.printf("Horas trabajadas: %dhrs\n", E3.getHoras());
        System.out.printf("Salario por hora: $%.2f\n", E3.getTarifa());
        System.out.printf("Salario total semanal: $%.2f\n", C1.getSalarioEmpleado());
    }
}
