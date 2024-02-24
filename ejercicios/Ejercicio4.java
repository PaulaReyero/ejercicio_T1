/*Escribe un programa que calcule el mínimo y el máximo de una lista de números enteros positivos
introducidos por el usuario. La lista finalizará cuando se introduzca un número negativo. */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] lista_numeros = crearArray();
        System.out.println("Minimo: " + verMin(lista_numeros));
        System.out.println("Maximo: " + verMax(lista_numeros));
    
}
    public static int[] crearArray(){
        int[] lista = new int[100];
        int posicion_lista = 0;
        do{
            System.out.println("Introduce un numero:");
            Scanner numero_leido = new Scanner(System.in);
            lista[posicion_lista] = numero_leido.nextInt();
            posicion_lista ++;        
        }while(lista[posicion_lista - 1] > 0);

        return lista;  
    }
    public static int verMin(int[] lista_numeros){
        int min = lista_numeros[0];
        for(int i = 0; i < lista_numeros.length; i++){
            if(min > lista_numeros[i]){
                min = lista_numeros[i];

            }
            
        }
        return min;
    }
    public static int verMax(int[] lista_numeros){
        int max = lista_numeros[0];
        for(int i = 0; i < lista_numeros.length; i++){
            if(max < lista_numeros[i]){
                max = lista_numeros[i];
            }
        }
        return max;
    }
    
}
