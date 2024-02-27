/*Escribir un programa que rellene una matriz cuadrada 
(las dimensiones de la matriz serán un parámetro que se
pida al usuario) con números aleatorios de tal modo que 
la matriz sea simétrica. Imprimir la matriz por pantalla. 
Realice todo en una única función a la que se llama desde 
el main.*/

import java.util.Scanner;
import java.util.Random;
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Introduce las dimensiones de la matriz");
        Scanner leerNum = new Scanner(System.in);
        int filas = leerNum.nextInt();
        int col = leerNum.nextInt();
        crearMatriz(filas, col);
    }

    public static void crearMatriz(int filas, int col){
        int[][] matriz = new int[filas][col];
       Random rand = new Random();
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < col; j++){
                matriz[i][j] = rand.nextInt(10);
                System.out.println(matriz[i][j]);
        }
    }













    /*public static void main(String[] args) {
        System.out.println("dimensiones: ");
        int i = leerNum();
        int j = leerNum();
        crearMatriz(i,j);
    }
    public static int leerNum(){
        Scanner leer = new Scanner (System.in);
        return leer. nextInt();
    }
    public static int RandomNum(){
        Random rand = new Random();
        return rand.nextInt(10);
    }
    public static void crearMatriz(int i, int j){
        int fila = 0;
        int col = 0;
        int[][] matriz = new int[i][j];
        for (fila =0 ; fila < i; fila ++){
            for (col = 0; col <j; col++){
                matriz[fila][col] = RandomNum();
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
     }*/
}
        