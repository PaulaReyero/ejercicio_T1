/*Empleando un array, escribir un programa que pida al 
usuario números enteros hasta que se introduzca el número 0.
 A continuación, calcular la media, el mínimo y el máximo 
 de los datos introducidos. Utilice funciones 
 independientes para: 
 a) recibir N números enteros por teclado hasta que 
 el usuario introduzca un 0; 
 b) Calcule la media de los elementos de un array; 
 c) calcule el mínimo de los elementos de un array;
 d) Calcule el máximo de los elementos de un array. */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] lista_numeros = crearLista();
        System.out.println("La media de los numeros es: " + calcularMedia(lista_numeros));
        System.out.println("El maximo es: " + calcularMax(lista_numeros)); 
        System.out.println("El minimo es: " + calcularMin(lista_numeros));
    }
    public static int leerNumeros(){
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();        
    }
    public static int[] crearLista(){
        int[] lista = new int[100];
        int posic = 0;
        System.out.println("Introduce numeros enteros: ");
            lista[posic] = leerNumeros();
        while(lista[posic] != 0){
            posic ++;
            System.out.println("Introduce numeros enteros: ");
            lista[posic] = leerNumeros();
            
        }
        return lista;
    }
    public static float calcularMedia(int[] lista){
        int suma = 0;
        int cont = 0;
        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
            if(lista[i] != 0){
            cont ++;
            }
        }
        return suma/cont;
    }

    public static int calcularMin(int[] lista){
        int min = 0;
        min = lista[0];
        for (int i = 0; i < lista.length; i++){
            if(min > lista[i] && lista[i] != 0){
                min = lista[i];
            }
        }
        return min;
    }
    public static int calcularMax(int[]lista){
        int max = lista[0];
        for (int i = 0; i < lista.length; i++){
            if(max < lista[i] && lista[i] != 0){
                max = lista[i];
            }
        }
        return max;
    }
}
