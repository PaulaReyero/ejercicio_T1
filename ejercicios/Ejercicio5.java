/*Escribe un programa que visualice por pantalla la tabla de multiplicar de los 10 primeros números naturales. 
Utilizar una función que reciba un número N y devuelva un array de arrays con las tablas de multiplicar de 0 a 
9 de los N números. */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int N = 0;
        System.out.println("Introduce un numero: ");
        Scanner leer = new Scanner(System.in);
        N = leer.nextInt();
        int [][]table = crearArray(N);
        leerTabla(table);
    }
    public static int[][] crearArray(int N){
        int[][]tabla = new int[10][N];
        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[0].length; j++){
                tabla [i][j] = i*j;
            }
        }
        return tabla;
    }
    public static void leerTabla(int [][]table){
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[0].length; j++){
                System.out.print(table[i][j] + "  ");
         }
         System.out.println();
    }
}
}
