/*Escribe un programa que muestre por pantalla la lista de los N primeros números primos. 
Realiza una función que reciba N, devuelve un array conteniendo los N primeros números primos
y posteriormente imprima el array en el main.*/
public class Ejercicio6 {
    public static void main(String[] args) {
        int N = 10;
        int [] listaPrimos = numerosPrimos(N);
        for (int i = 0; i < listaPrimos.length; i ++){
            System.out.println(listaPrimos[i]);
        }
    }
    public static int[] numerosPrimos(int N){
        int[] primos = new int[N];
        boolean esPrimo = true;
        int cont = 0;
        for(int num = 2; cont < N; num ++){
            esPrimo = true;
            for(int div = 2; div < num; div++){
                if(num % div == 0){
                    esPrimo = false;
                }
            }
            if(esPrimo ==true){
                primos[cont] = num;
                cont++;
            }
        }
            return primos;
    }
}
