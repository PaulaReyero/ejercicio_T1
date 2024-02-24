/*Escribir un programa que solicite al usuario dos 
vectores de N elementos y que imprima su producto escalar. 
Utilice un array para representar el vector de N elementos.
Realice la entrada de usuario por teclado en una función 
que reciba las dimensiones del vector a la que se invoca
dos veces (una por vector) y otra función que calcule el
producto escalar recibiendo dos arrays que representan dos
vectores. */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Dimension de ambos vectores: ");
        int N = leerNumero();
        System.out.println("Vector 1");
        int[] vector1 = crearVector(N);
        System.out.println("Vector 2");
        int[] vector2 = crearVector(N);
        System.out.println("Producto escalar: " + prodEscalar(N, vector1, vector2));
    }
    public static int[] crearVector(int N){
        int[] vector = new int[N];
        for(int i = 0; i < N; i++){
            System.out.println("Posicion" + i+1 + ":");
            vector[i] = leerNumero();
        }
        return vector;
    }

    public static int leerNumero(){
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }
    public static int prodEscalar(int N, int vector1[], int vector2[]){
        int prod = 0;
        for(int i = 0; i < N; i++){
            prod += vector1[i]* vector2[i];
        }
        return prod;
    }
}
