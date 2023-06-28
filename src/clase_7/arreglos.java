package clase_7;

import java.util.Arrays;
import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {

        // Inputs


        // Variables

        // Outputs
        int[] arrNumeros = devuelveNumeros();
        System.out.println("--------------------------");
        System.out.println("los números ingresados son:");
        System.out.println(Arrays.toString(arrNumeros));
        System.out.println();

        calculaNumMayorMenor(arrNumeros);

        int promedio =  calcularPromedio(arrNumeros);
        System.out.println("El promedio es: " + promedio);


    }

    public static int[] devuelveNumeros() {

        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese numero " + (i + 1));
            int num = sc.nextInt();
            numeros[i] = num;
        }

        return numeros;

    }

    public static void calculaNumMayorMenor(int[] numeros) {

        int mayor, menor;
        mayor = menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];

            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: : " + menor);
    }

    public static int calcularPromedio(int[] numeros){
        int promedio=0;
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            suma += numeros[i];
            promedio=suma/5;


        }
        return promedio;
    }


}


