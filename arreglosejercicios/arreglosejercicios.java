import java.util.Scanner;

public class arreglosejercicios {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        int opcion;
        char letra;
        int alumnosAprobados = 0;
        int alumnosReprobados = 0;
        int sumaCalificaciones = 0;
        double promedio =0;
        int calificacionesPorEncimaDelPromedio =0;
     
        
        
        do{
            System.out.println("Bienvenido al programa : ");
            System.out.println("Elige alguna opcion deseada: ");
            System.out.println("1. 10 números enteros que muestre el promedio de los valores positivos y  de los negativos.  ");
            System.out.println("2. 10 números enteros que muestre el promedio de los números que estén en las posiciones pares ");
            System.out.println("3. calificaciones de una asignatura ");
            System.out.println("4. salir");

            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Ingrese el número " + (i + 1) + ": ");
                        numeros[i] = entrada.nextInt();
                        if (numeros[i] > 0) {
                        sumaPositivos += numeros[i];
                        cantidadPositivos++;
                        } else if (numeros[i] < 0) {
                         sumaNegativos += numeros[i];
                         cantidadNegativos++;
                        }
                     }

                        // Calcular promedio de valores positivos y negativos
                        double promedioPositivos = cantidadPositivos > 0 ? (double) sumaPositivos / cantidadPositivos : 0;
                        double promedioNegativos = cantidadNegativos > 0 ? (double) sumaNegativos / cantidadNegativos : 0;

                        // Mostrar resultados
                        System.out.println("Promedio de valores positivos: " + promedioPositivos);
                        System.out.println("Promedio de valores negativos: " + promedioNegativos);
                        promedioPositivos=0;
                        promedioNegativos=0;

                  
                    break;
                case 2:
                     for (int i = 0; i < 10; i++) {
                        System.out.print("Ingrese el número " + (i + 0) + ": ");
                        numeros[i] = entrada.nextInt();
                        
                     }

                        // Calcular promedio de los numeros de las posiciones pares
                        double promedioPares = (double) (numeros[0]+numeros[2]+numeros[4]+numeros[6]+numeros[8]) / 5 ;
                        // Mostrar resultado
                        System.out.println("Promedio de valores positivos: " + promedioPares);
                        promedioPares=0;
                  
                     break;
                case 3:
                      for (int i = 0; i < 10; i++) {
                        System.out.println("Ingrese la calificacion del alumno " + (i + 1) + ": ");
                        numeros[i] = entrada.nextInt();
                        if (numeros[i] >= 6) {     
                        alumnosAprobados++;
                        } else if (numeros[i] <= 5) {
                         alumnosReprobados++;
                        }
                        
                        sumaCalificaciones += numeros[i];
                        promedio = sumaCalificaciones * .10;
                        {
                            if (numeros[i] > promedio) {
                                calificacionesPorEncimaDelPromedio++;
                            }
                        } 
                        }
                     
                          System.out.println("la calificacion del alumno  " + numeros[0]);
                          System.out.println("la calificacion del alumno  " + numeros[1]);
                          System.out.println("la calificacion del alumno  " + numeros[2]);
                          System.out.println("la calificacion del alumno  " + numeros[3]);
                          System.out.println("la calificacion del alumno  " + numeros[4]);
                          System.out.println("la calificacion del alumno  " + numeros[5]);
                          System.out.println("la calificacion del alumno  " + numeros[6]);
                          System.out.println("la calificacion del alumno  " + numeros[7]);
                          System.out.println("la calificacion del alumno  " + numeros[8]);
                          System.out.println("la calificacion del alumno  " + numeros[9]);
                          System.out.println(" alumnos aprobados: " + alumnosAprobados);
                          System.out.println(" alumnos reprobados: " + alumnosReprobados);
                          System.out.println(" El promedio de los 10 alumnos es de : " + promedio);
                          System.out.println(" cantidad de alumnos que superan el promedio " + calificacionesPorEncimaDelPromedio);
                         alumnosAprobados = 0;
                         alumnosReprobados = 0;
                         calificacionesPorEncimaDelPromedio = 0;
                         promedio =0;
                         sumaCalificaciones=0;
                        
                         
                         
                     break;
                case 4:

                     System.out.println("Gracias por usar este programa");
                     System.exit(0);
                     break;

                default:

                    System.out.println("Elija una opcion valida");
                     break;
            

            }
        
            //aqui  adentro de preguntar
            System.out.println("¿Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0); 

        }while(letra == 's'|| letra == 'S');
    }
    
}       
       
       
