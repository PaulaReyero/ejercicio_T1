//Escribir un programa que muestre por consola los mayores números enteros 
//que se pueden representar mediante un char, short e int.

public class ejercicio2{
    public static void main(String[] args) {
        System.out.println("Maximo valor de int: " + Integer.MAX_VALUE);
        System.out.println("Maximo valor de short: " + Short.MAX_VALUE);
        System.out.println("Maximo valor de char: " + (int) Character.MAX_VALUE);
    }
}