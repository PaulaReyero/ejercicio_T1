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
        
    }
    public static int[] crearLista(){
        int[] lista = new int[100];
        int cont = 0;
        do{
            System.out.println("Introduce numeros enteros: ");
            Scanner leer_num = new Scanner(System.in);
            lista[cont] = leer_num.nextInt();
        }while(lista[cont] != 0);
        return lista;
    }
    public static float mediaNum(int[] lista){
        float suma = 0;
        int cont = 0;
        for(int i = 0; i < lista.length; i++){
            suma += lista[i];
            cont++;
        }
        return suma/cont;
    }
    public static int calcularMin(int[] lista){
        int min = lista[0];
        for(int i =0; i < lista.length; i++){
            if(min > lista[i] && lista[i] != 0){
                min = lista[i];
            }
        }
        return min;
    }
    public static int calcularMax(int[] lista){
        int max = lista[0];
        for(int i =0; i < lista.length; i++){
            if(max < lista[i] && lista[i] != 0){
                max = lista[i];
            }
        }
        return max;
    }
}
