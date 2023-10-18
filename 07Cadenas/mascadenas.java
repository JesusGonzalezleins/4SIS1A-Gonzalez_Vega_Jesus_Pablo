import java.util.*;

public class mascadenas {
    Scanner entrada = new Scanner(System.in);

    public void masFuncionesCadena(){
        String s1 = new String("Hola habia una vez un patito");
        String s2 = "Harry Potter es magico";
        String s3 = "Feliz no cumpleaños";
        String s4 = "FELIZ NO CUMPLEAÑOS";
         

        //VAMOS A CONCATENAR LAS CADENAS    

        String salida  = "Cadenas a concatenar:"+ s1 + "\n"+s2 + "\n" + s3 +"\n";

        //vamos a comparar si dos cadenas son iguales
        //equalsIgnoreCase para ignorar si son mayusculas o minusculas la comparacion
        if(s3.equalsIgnoreCase(s4)){
            //si es verdad 
            salida += "si es igual a la cadena \n";
            System.out.println(salida);

        }else{
            salida += "no es igual a la cadena \n";
            System.out.println(salida);

        }
        //metodo compareTo
        //para comparar letra por letra
        // salida += "\n s3 compareTo s4" + s3.compareTo(s4);
        //System.out.println(salida);
        //String s5 ="patito patito color cafe";
        //int pos =1;
        //indexOf('t',pos+1) sirve para encontrar en que pocision encuentra una letra  
        
    }
}
