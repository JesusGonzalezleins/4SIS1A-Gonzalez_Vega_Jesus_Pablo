//Esta Clase es la que se encarga de las operaciones de la calculadora y
//Tambien tendra opciones de convertir ubidades crear cuadritos magicos

import java.util.Scanner;

class Ejercicios{
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    //variables Globales
    char op,letra;

    //menu
    public void menu(){
        do{
        System.out.println("ejercicios que ahi le quedan de tarea");
        System.out.println("a. Calculadora");
        System.out.println("b. Convercion de unidades");
        System.out.println("c. Crear cuadro magico");
        System.out.println("d. desplazamiento de un cuadrito");
        System.out.println("Elija la opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
             //implementacion de metodos
             Ejercicio1();
            break;
            case 'b' :
             Ejercicio2();
            break;
            case 'c' :
             Ejercicio3();
            break;
            case 'd' :
             Ejercicio4();
            break;
            default:
             System.out.println("Gracias por jugar ");

        }
        System.out.println("Deseas repetir el programa digital S");
        letra = entrada.next().charAt(0);

    }while(letra == 'S' || letra == 's');
    }
    public void Ejercicio1(){
        //Se les llama  metodos vacios porque no  poseen argumentos  y no son metodos 
        //o funciones que necesiten  una entrada o salida  de algun tipo  de dato

        //Calculadora 
        double num1 = 0.00, num2 = 0.00, suma = 0.00, multi = 1.00, Division = 0.00 ;
        char operacion;
        
        System.out.println("Selecciona la operacion que deseas realizar: ");
        System.out.println("a. Suma y Resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");
        
        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a' :
            //Vamos a sumar o restar tantos numeros que desee el usuario
            //Cuando coloquemos 0 la operacion termina
                System.out.println("Escriba los numeros que desee sumar o restar: ");
            do{
                System.out.println("Para Detener la suma o resta, ingrese el 0");
                num1 = entrada.nextDouble();
                suma += num1;
                //suma = suma + num1
            }while(num1 != 0);
            System.out.println("El resultado de la operacion es:  " + suma);
            break;
            case 'b' :
                System.out.println("Escriba los numeros que desee multiplicar: ");
            do{
                System.out.println("Para Detener la multiplicacion, ingrese el 0");
                num1 = entrada.nextDouble();
                if(num1 != 0){
                    multi *= num1;
                    //multi = multi * num1;
                }

            }while(num1 != 0);
            System.out.println("El resultado de la operacion es:  " + multi);
            break;
            case 'c' :
                System.out.println("Escriba el numero que desee dividir: ");
                num1 = entrada.nextDouble();
                System.out.println("Escriba el numero que va a dividir al primero: ");
                num2 = entrada.nextDouble();
                Division = num1 / num2;
                System.out.println("El resultado de la operacion es:  " + Division);
            break;
            default:
             System.out.println("opcion no valida");

        }
    }
   public void Ejercicio2(){
    //Vamos a crear un programna que se encargue de convertir 
    //kg a libras
    //m/s a km/s
    // m a yardas y millas
    double metros = 0.00, kg = 0.00, velocidad = 0.00, cm = 100.00, pulgadas = 0.0254, gramos = 1000.00, libra = 0.453592, ms = 3600,kmh = 1000;
    double yardas = 1.09361, millas = 0.00062136931818182;
    double conversion1, conversion2;
        System.out.println("Selecciona la cantidad que deseas convertir acorde con las siguientes unidades");
        System.out.println("a. Metros a cm y pulgadas");
        System.out.println("b. Kg a libras y gramos");
        System.out.println("c. m/s a km/h");
        System.out.println("d. Metros a yardas y millas");
        
        op = entrada.next().charAt(0);

        switch(op){
            case 'a':
             System.out.println("Ingresa los metros que deseas transformar: ");
             metros = entrada.nextDouble();
             conversion1 = metros * cm;
             conversion2 = metros * pulgadas;
             System.out.println("La cantidad en metros es: " + metros + "metros a centimetros son: " + conversion1 + "de metros a pulgadas son: " + conversion2);
                break;
            case 'b':
            System.out.println("Ingresa los metros que deseas transformar: ");
             kg = entrada.nextDouble();
             conversion1 = kg * libra;
             conversion2 = kg * gramos;
             System.out.println("La cantidad en kilogramos es: " + kg + "Kg a libras es: " + conversion1 + "de Kg a gramos es: " + conversion2);
                break;
            case 'c':
            System.out.println("Ingresa los m/s para trasformarlo: ");
             velocidad = entrada.nextDouble();
             conversion1 = (velocidad * ms) / kmh;
             System.out.println("La velocidad es: " + velocidad + "m/s a km/h son: " + conversion1);
                break;
            case 'd':
            System.out.println("Ingresa los metros que deseas transformar: ");
             metros = entrada.nextDouble();
             conversion1 = metros * yardas;
             conversion2 = metros * millas;
             System.out.println("La cantidad en metros es: " + metros + "metros a yardas son: " + conversion1 + "de metros a millas son: " + conversion2);
                break;
        }
        
    }
    public void Ejercicio3(){
        
    }
    public void Ejercicio4(){
        
    }
}