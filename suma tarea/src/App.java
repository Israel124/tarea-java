//Israel de Jesús Espinoza Franco
//N° carnet 2024-1374U

import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    public static void main(String[] args) throws Exception {
        int suma;
        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }

        } while (num1 == num2 || num1 == num3 || num2 == num3);

        if (num2 >= num1 && num2 >= num3 && num3 >= num1) {

            suma = num1+num2;

        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
           
            suma = num2+num3;
            
        }else if (num1 == num2 || num1 == num3 || num2 == num3) {
           
            suma = num1+num3;
            
        } else{
            System.out.println("los valores no se pueden sumar porque son iguales ó no son enteros");
        }

        System.out.println("la suma de los numeros de menor valor es: " + suma);

    }
}