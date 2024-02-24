/*Escribe un programa que acepte una cadena de caracteres 
(que podrá contener cualquier carácter a excepción del 
retorno de carro) y que la escriba al revés. Reutiliza 
la función del ejercicio para la entrada de teclado y otra 
función que invierta la cadena.
*/
public class Ejercicio13 extends Ejercicio12 {
    public static void main(String[] args) {
        String text = leerString();
        System.out.println(invertirString(text));
    }
    public static String invertirString (String text){
        String invert_text = "";
        for(int n = (text.length()-1); n>= 0; n--){
            invert_text += text.charAt(n);
        }
        return invert_text;
    }
}
