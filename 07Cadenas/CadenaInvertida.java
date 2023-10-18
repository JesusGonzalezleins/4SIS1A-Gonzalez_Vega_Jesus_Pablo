import java.util.Scanner;

public class CadenaInvertida {

    // Entrada de datos
    Scanner entrada = new Scanner(System.in);
    
    public void cadenaInvertidaPalabras() {
       
        String cadena  = "";

        System.out.println("Ingresa la oracion que deseas invertir: ");

        cadena = entrada.nextLine();

        // para invertir la cadena que ingrese el usuario

        String invertida = "";
        // habia una vez un patito
        //con ciclo for

        for(int i = cadena.length()-1; i>= 0; i--){
            //obtener los caracteres de la cadena
            char car  = cadena.charAt(i);
            //concatenar 
            invertida += car;


        }
        System.out.println("la cadena invertida es: "+invertida);
    }
}