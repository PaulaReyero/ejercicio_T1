/*Escribe un programa que acepte una cadena de caracteres 
(que podrá contener cualquier carácter a excepción del 
retorno de carro) y que diga cuántas vocales contiene. 
Realice la entrada de teclado en una función (lectura de 
una string) y el cálculo de vocales de una string en otra 
función independiente que reciba una string y devuelva un 
entero.*/
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String text = leerString();
        System.out.println(contarVocales(text));
    }
    public static String leerString(){
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }
    public static int contarVocales (String text){
        int vocales = 0; 
        for (int n = 0; n <text.length(); n++){
            switch (text.charAt(n)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }
}
