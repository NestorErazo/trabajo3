package ControlDeFlujo;
import java.util.Scanner;
import  java.util.ArrayList;
import  java.util.List;
public class Main {
    public static void main(String[] args) {


//        for (int i = 0; i <5 ; i++) {
//            System.out.println(" Iteracion (for):" + i);
//        }
//
//        String[] miArreglo2={"como estas","hola"};
//        for (String datos: miArreglo2) {
//            System.out.println(datos);
//        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList<>();

        System.out.print("Ingrese la cantidad de datos: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            String dato = scanner.nextLine();
            datos.add(dato);
        }
        System.out.println("\nDatos ingresados y cantidad de caracteres:");
        for (int i = 0; i < n; i++) {
            String dato = datos.get(i);
            System.out.println("Dato " + (i + 1) + ": " + dato + " - Cantidad de caracteres: " + dato.length());
        }
        scanner.close();
    }

}
