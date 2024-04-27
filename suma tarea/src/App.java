//Israel de Jesús Espinoza Franco
//N° carnet 2024-1374U

import java.util.Scanner;

public class App {

    public static int num1;
    public static int num2;
    public static int num3;
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);

        do {

            try {
                System.out.println("Ingrese tres numeros enteros diferentes");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                num3 = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
                continue;

            }   if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Los numeros deben de ser difetentes");
                continue;
  
              }

            break;
        } while (true);



        int suma;

        if (num1 <= num2 && num1 <= num3) {

            suma = num1 + (num2 <= num3? num2 : num3);

        } else if (num2 <= num1 && num2 <= num3) {

            suma = num2 + (num1 <= num3? num1 : num3);

        } else {

            suma = num3 + (num1 <= num2? num1 : num2);
        }

        System.out.println("La suma de los números de menor valor es: " + suma);
    
        

    }
}