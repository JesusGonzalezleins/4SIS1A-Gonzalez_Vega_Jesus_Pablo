import java.util.*;


public class arreglosMatriz {
    public static void main(String[] args){
        //vamos a realizar un arreglo unidimensional y correrlo para ver que hay en cada elemento
        
        //Como se define el arreglo
        int arreglo[] = new int [10];
        //se define un tamaño de 10

        int valor;
         
        Scanner entrada = new Scanner(System.in);

        //vamos a recorrerlo
        
        for (int i = 0; i < arreglo.length; i++){
        System.out.println("Ingresa el valor de la posicion del arreglo: ");
        arreglo[i] = entrada.nextInt();
        }

         for (int j = 0; j < arreglo.length; j++){
        System.out.println("El valor almacenado es : " + arreglo[j] + " valor ");
        
        }
    }
}
