import java.util.Scanner;

public class ahorcado {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int oportunidades = 5;
        int aciertos=0;
        int fallos=0;
        int tamaño;
        int contador =0;
        String palabra;
        String opcion;
        String[] palabras = new String[11];
        palabras[0]="Computadora";
        palabras[1]="Teclado";
        palabras[2]="Monitor";
        palabras[3]="Mouse";
        palabras[4]="Hadware";
        palabras[5]="Software";
        palabras[6]="Cpu";
        palabras[7]="Ram";
        palabras[8]="Placa";
        palabras[9]="Gabinete";
        palabras[10]="Puertos";
        char[] respuesta;

        palabra = palabras[(int) (Math.random()*11)];

        tamaño = palabra.length();
        
        respuesta = new char [tamaño];

        int puntuaje = 0;
        int repetir = 1;

            for (int i = 0; i < tamaño; i++){
                respuesta[i]= '*';
            }
        
        while (repetir != 0){
            palabra = palabras[(int) (Math.random()*11)];
             oportunidades = 5;
             aciertos=0;
             puntuaje = 0;
             tamaño = palabra.length();
             respuesta = new char [tamaño];
              for (int i = 0; i < tamaño; i++){
                respuesta[i]= '*';
            }
            System.out.println("Juego del ahorcado ");
            System.out.println("Reglas");
            System.out.println("Se te otorgaran 5 oportunidades");
            System.out.println("si fallas las 5 oportunidades el juego terminara");
            System.out.println("En este juego encontraras palabras relacionadas a la computadora como sus partes asi como las que lo integran");
            System.out.println("Recuerda empezar con una mayuscula");
            System.out.println("De lo contrario te la marcara como error");

            while (aciertos != tamaño && oportunidades !=0){
                System.out.println("Juego del ahorcado oportunidades"+oportunidades+" Aciertos: "+ aciertos+" Puntuaje; "+puntuaje);
                
                System.out.print("");
                    for(int i=0; i< tamaño; i++){
                        System.out.print("_"+respuesta[i] +"_ ");

                    }
                    System.out.println("\nIngresa una letra: ");
                     opcion = entrada.next();
                         if(palabra.contains(opcion)){
                            for(int i =0; i<tamaño; i++){
                                if(palabra.charAt(i)==opcion.charAt(0)){
                                    respuesta[i]=opcion.charAt(0);
                                    contador++;
                                }
                            }
                            aciertos = aciertos + contador;
                            puntuaje = puntuaje + 100;
                         }else{
                            oportunidades--;
                            fallos++;

                            System.out.println("Numeros de oportunidades es "+fallos+" de "+"5");
                            puntuaje=puntuaje-5;
                            if(puntuaje<0){
                                puntuaje = 0;
                            }
                         }
                         contador=0;

            }
            if(oportunidades==0){
                
                System.out.println("tus puntuaje final es de "+puntuaje);
                System.out.println("Ingrese 1 para continuar");
                System.out.println("Ingrese 2 para finalizar");
                repetir= entrada.nextInt();
            }else{
                System.out.println("");
                for(int i=0; i<tamaño;i++){
                  System.out.print("_"+respuesta[i] +"_ ");
                }
                 System.out.println("Juego terminado");
                 System.out.println("tus puntuaje final es de "+puntuaje);
                 System.out.println("Ingrese 1 para continuar");
                 System.out.println("Ingrese 0 para finalizar");
                 repetir= entrada.nextInt();
            }


           
        }



    }
}
