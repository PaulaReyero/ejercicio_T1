/*Escribir un programa que multiplique dos matrices. 
Sus dimensiones y valores deben de solicitarse al usuario 
por teclado y tras realizar la multiplicación debe 
visualizarse en pantalla ambas matrices y el resultado de 
la multiplicación. Cree una nueva función similar al 
ejercicio 9 pero que recibirá vectores de varias 
dimensiones. Realice otra función multiplicar matrices 
que reciba dos arrays de dos dimensiones que representan 
2 vectores y devuelva otro array de dos dimensiones que 
contenga su multiplicación. En caso de no ser compatibles 
las dimensiones la función indicará que ha habido un error.*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz1 = crearMatriz();
        int[][] matriz2 = crearMatriz();
        for(int i = 0; i < multMatriz(matriz1, matriz2).length; i++){
            for(int j = 0; j < multMatriz(matriz1, matriz2)[0].length; j++){
                System.out.println(multMatriz(matriz1, matriz2)[i][j] + " ");
            }
            System.out.println();
        }
    }  
    public static int[] matrizDimension(){
        int[] dimension = new int[2];
        System.out.println("Diension: ");
        dimension[0] = leerNumero();
        dimension[1] =leerNumero();
        return dimension;
        }

    public static int leerNumero(){
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    public static int[][] crearMatriz(){
        int i = 0;
        int j = 0;
        int[]mat = matrizDimension();
        int[][] matriz = new int [mat[0]][mat[1]];
        System.out.println("Crear matriz" + "(" + matriz[0] + "x" + matriz[1] + ")" );
        for(i = 0; i < mat[0]; i++){
            for (j = 0; j <mat[1]; j++){
                System.out.println("Position " + "(" + (i+1) + " , " + (j+1) + ")");
                matriz[i][j] = leerNumero();
            }
        }
        return matriz;
    } 
    public static int[][] multMatriz(int[][] matriz1, int[][]matriz2){
        int[][] mult = new int [matriz1.length][matriz2[0].length];
        if(matriz1[0].length != matriz2.length){
            System.out.println("ERROR");
            return null;
        }
        else{
            int fila = 0;
            int col = 0;
            int k = 0;
            for(fila = 0; fila < matriz1.length; fila++){
                for(col = 0; col < matriz2[0].length; col++){
                    for(k = 0; k < matriz2.length; k++){
                        mult[fila][col] += (matriz1[fila][k]* matriz2[k][col]);
                    }
                }
            }
            return mult;
        }
    }
}