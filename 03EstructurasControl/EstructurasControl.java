
/*Vamos a crear un programa mediante el cual debamos tener un menu de seleccion para
elegir alguna de las 14 opciones siguientes.

1. Bono o descuento por edad
2. Convertir numeros decimales a binarios
3. Convertir temperaturas
4. Numero de positivos a negativos
5. Tiendita
6. Area y perimetro
7. Tabla
8. Factorial
9. Dibujos
10. Figura Hueca
11. Patron
12. Diamante
13. Calculadora
14. Salir
*/
//declarar las librerias que ocuparemos
//se debe de estructurar el tipo de dato acorde a su entrada
//si es entero obtenerlo como entero, si es char como caracter
import java.util.Scanner;

class EstructurasControl {
    //si declaramos fueradel metodo las variables son globales es decir para todo el programa

    //metodo principal
    public static void main(String[] args){
        //manejo de objetos, nos ayuda a poder instancear, (mando a llamar al objeto)
        //para crear una instancia, es necesario 1. identificar el tipo de objeto
        //2.nombrar al objeto
        //3. crear al objeto
        Scanner entrada = new Scanner(System.in);
        //crear una instanciadel objeto de la entrada por defecto de la computadora
        //vamos a identificar con Scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que va a poder identificar si es int,double,flot

        //es declarar las variables que se van a utilizar en el programa
        //las variables son de tipo globales y locales
        //si declaro dentro de un metodo es local

        int opcion, numbinario, total, cantidaddelproducto, num;
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra;
        double num1 = 0.00, num2 = 0.00, suma = 0.00, multi = 1.00, Division = 0.00 ;
        char operacion;

        do{
            //aqui va el programa
            System.out.println("Bienvenido al programa : ");
            System.out.println("Elige alguna opcion deseada: ");
            System.out.println("1. Bono o descuento por edad ");
            System.out.println("2. Convertir numeros decimales a binarios ");
            System.out.println("3. Convertir temperaturas ");
            System.out.println("4. Numero de positivos a negativos");
            System.out.println("5. Tiendita ");
            System.out.println("6. Area y perimetro");
            System.out.println("7. Tabla");
            System.out.println("8. Factorial");
            System.out.println("9. Dibujos");
            System.out.println("10. Figura Hueca");
            System.out.println("11. Patron");
            System.out.println("12. Diamante");
            System.out.println("13. Calculadora");
            System.out.println("14. Salir");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    break;
                case 2:
                    //decimal a binario
                    System.out.println("Ingrese un numero entero positivo que desee convertir en binario");
                    numbinario = entrada.nextInt();
                    //como saber si es positivo el numero?
                    if(numbinario > 0){
                        //se cuantas veces lo tengo que dividir entre 2?
                        while(numbinario > 0){
                            if(numbinario%2 ==0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0" + binario;
                    }else{
                        binario = "No se puede convertir un numero negativo solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario); 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bienvenido a la tienda");
                    System.out.println("Por favor ingrese el numero de productos que va a comprar ");
                    total = entrada.nextInt();

                    for(int i = 1; i<= total; i++){
                        System.out.println("Ingrese el nombre del producto ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidaddelproducto = entrada.nextInt();
                        // operacion 
                        resultado = precio * cantidaddelproducto;
                        compra = compra + resultado; 
                        // compra += resultado
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    break;
                case 7:
                    //vamos a imprimir una tabla
                    //un ciclo for 
                    for(int n = 1; n <=10; n++){
                        System.out.println(n + " " + (n*10) + " " + (n*100) + " " + (n*1000) + " ");
                    }
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Cuadrado magico");
                    System.out.println("ingrese el tamaño del cuadrado a pintar");

                    num = entrada.nextInt();

                    if(num >= 1 && num <=20){
                        //ciclo para las filas
                        for(int i = 1; i <= num;i++){
                            //imprimir colummnas
                            for(int j = 1; j <= num; j++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Ingresa solo numeros entre el numero 1 y el 20");
                    }
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:                   
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
                    break;
                case 14:
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
