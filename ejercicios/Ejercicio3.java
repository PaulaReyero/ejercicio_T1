/*Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. 
Calcular además cuantos hay (ver operaciones sobre arrays) y visualizar cada uno de ellos. 
Utilizar una función que reciba el número de múltiplos de 5 y devuelva un array conteniedo 
todos los múltiplos de 5 desde el valor del parámetro begin hasta el valor del parámetro end. 
Realizar otra función que dado un array como parámetro, lo recorra de inicio a fin y devuelva 
la suma de todos sus valores.*/

public class Ejercicio3 {
    public static void main(String[] args) {
        int div = 5;
        int begin = 1;
        int end = 100;
        int mults_total= 0;
        System.out.println("Multiplos de " + div + "son: ");
        for(int n = begin; n <= end; n++){
            if (n % div == 0){
           System.out.println(n);
            mults_total ++;
        }
    }
        int[] lista = listaMultiplos(begin, end, mults_total, div);
        int suma = sumaMults(lista);
        System.out.println("Suma de los multiplos:" + suma);
        }

    public static int[] listaMultiplos(int begin, int end, int mults_total, int div){
        int[] multiplos = new int[mults_total];
        int contador = 0;
        for (int i = begin; i<=end; i++){
            if(i % div == 0){
                multiplos[contador] = i;
                contador++;
            }
        }return multiplos;
    }

    public static int sumaMults(int[] lista){
        int suma = 0;
        for(int contador = 0; contador < lista.length; contador++){
            suma += lista[contador];
        }
        return suma;
    }
    }
    