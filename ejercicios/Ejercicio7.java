/*Escribe un programa que lea un número entero de teclado, 
lo guarde en una variable, lo envíe a una función que lo
descomponga en factores primos, y dicha función devuelva un
array que contenga los factores primos. Posteriormente 
imprima el array en el main. ; por ejemplo 40 = 2 * 2* 2 * 5. */

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        int[] fact = arrayFactores(num);
        System.out.print(num + "=");
        for (int i = 0; i < fact.length; i++){
            if(fact[i] != 0){
                System.out.println(fact[i] + "*");
            }
        }
        System.out.println("1");

    }
    public static int[] arrayFactores(int num){
        int[] factores = new int[num];
        int count = 0;
        for(int i = 2; i <= num; i++){
            if (num % i == 0){
                factores[count] = i;
                num = num / i;
                i--;
                count ++;
            }
        }
        return factores;
    }
}
