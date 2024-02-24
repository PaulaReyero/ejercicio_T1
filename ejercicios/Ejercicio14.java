/*Escribe un programa que lee una cadena de caracteres 
de teclado e indique si es o no palíndroma (se lee igual 
de izquierda a derecha que de derecha a izquierda, sin 
tener en cuenta los espacios en blanco y las mayúsculas). 
Por ejemplo: "dábale arroz a la zorra el abad". Reutilice 
la función del ejercicio 12 para la entrada de teclado y 
cree otra función que dada una cadena de caracteres 
devuelva un boolean indicando si es o no palíndroma.*/


public class Ejercicio14 extends Ejercicio12{
    public static void main(String[] args) {
        String text = leerString();
        System.out.println(verPal(text));
    }
    public static boolean verPal(String text){
        boolean check = true;
        String clean_text = "";
        String invertir = "";
        char new_char = ' ';
        text = text.replaceAll(" ", " ");
        for(int i = 0; i < text.length(); i++){
            switch(text.charAt(i)){    //elimino tildes
                case('a'):
                case('Á'): new_char = 'a'; break;
                case('é'):
                case('É'): new_char = 'e'; break;
                case('í'):
                case('Í'): new_char = 'i'; break;
                case('ó'):
                case('Ó'): new_char = 'o'; break;
                case('ú'):
                case('Ú'): new_char = 'u'; break;
                default: new_char = text.charAt(i);break ;
            }
            if ((text.charAt(i) >= 65) && (text.charAt(i) <=90)){  //Elimino mayusculas
                new_char =(char)(text.charAt(i) + 32);
            }
            clean_text += new_char;
        }
        for(int i = 0; i <clean_text.length(); i++);{
            if(clean_text.charAt(i) != (clean_text.charAt(clean_text.length() - (i+1)))){
                check = false;
            }
        }
        return check;
     }
 }
