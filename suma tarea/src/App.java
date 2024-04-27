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

             //a esta parte dentro del catch le agregue la condicion de que si los numero eran iguales diera un mensaje indicando que ellos tenian que ser diferentes

            }   if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Los numeros deben de ser difetentes");
                continue;
  
              }

            break;

        } while (true);

     //sumar los números con menor valor, para esto difiní una variable llamada suma como entero
     //y con un ifelse se se realizó la suma

        int suma;

        if (num1 <= num2 && num1 <= num3) {

            suma = num1 + (num2 <= num3? num2 : num3);

        } else if (num2 <= num1 && num2 <= num3) {

            suma = num2 + (num1 <= num3? num1 : num3);

        } else {

            suma = num3 + (num1 <= num2? num1 : num2);
        }

        System.out.println("La suma de los números con menor valor es: " + suma);
    
       //diferencia o resta de los numeros con mayor valor, para eso se definieron 3 variables como entero
       //la primera variable llamada"diferencia", la segunda "maximo1" y la tercera "maximo 2"
       //para realizar esta operacion hice uso de la clase Math.max esta me ayudo a localizar cuales de los valores ingresados era mayor
       //luego se realizo la operación donde lo que se queria obtener era la diferencia por lo cual, diferencia = maximo1 - maximo2

        int diferencia;

        int maximo1 = Math.max(num1, Math.max(num2, num3));
        int maximo2 = Math.min(Math.max(num1, num2), Math.max(num2, num3));

        diferencia = maximo1 - maximo2;

        System.out.println("La direfencia o resta de los números con mayor valor es: " + diferencia);

      //número con mayor valor, para esto declramos una variable como entero llamada "maximo" 
      // con la clase Math.max encontramos cual de los 3 numeros ingresados es el mayor

       int maximo = Math.max(Math.max(num1, num2), num3);

        System.out.println("El número con mayor valor es: " + maximo);
          
    }
}