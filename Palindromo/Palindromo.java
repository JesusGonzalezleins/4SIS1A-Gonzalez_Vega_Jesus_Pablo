import java.util.*; 

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        String cadena  = "";

            System.out.println("Ingresa la palabra u oracion para ver si es palindromo");
        
            cadena = entrada.nextLine();
        
            String invertida = "";

            for(int i = cadena.length()-1; i>= 0; i--){
            //obtener los caracteres de la cadena
            char car  = cadena.charAt(i);
            //concatenar 
            invertida += car;
            }

            String salida  = "Cadenas a concatenar:"+ cadena + "\n"+ invertida + "\n";
             if(cadena.equalsIgnoreCase(invertida)){
                //si es verdad 
                salida += "es palindromo la palabra u oracion \n";
                System.out.println(salida);

             }else{
                salida += "no es palindromo la palabra u oracion \n";
                System.out.println(salida);
            }
            }
        }
        

            

