import java.util.*;


public class arreglosMatrizB {


    public static void main(String[] args){
       
       
        Scanner entrada = new Scanner(System.in);
        float matriz[][] = new float [3][3];
        

        int valor;
        
        for (int i = 0; i < matriz.length; i++){
            System.out.println(i);
            for(int j = 0; j < matriz.length; j++){
                System.out.println(j);   
                System.out.println("Ingresa el valor de la fila: " + i + " Ingresa el valor de la comulumna: " + j);
                matriz[i][j] = entrada.nextInt();
            }
        }
     //vamos a sumar las filas promediar
        float sumarFilas = 0 ;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                 //sumo las filas
                sumarFilas += matriz[i][j];
                   //imprimir resultado con formato
                System.out.println(String.format("%d", matriz[i][j]));
            }
        }
      //existen diferentes tipos de formato
      // %d  es int   %s es string    %c es char    %f float
      System.out.println(String.format("\n La suma de las filas %f,  El promedio de la fila %.2f", sumarFilas,sumarFilas/matriz.length));
    }
}
