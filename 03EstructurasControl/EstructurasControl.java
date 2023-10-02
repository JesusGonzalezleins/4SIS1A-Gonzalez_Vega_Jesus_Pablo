
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
import java.lang.Math;

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

        int opcion, opc , numbinario, total, figura, cantidaddelproducto, num,n1=0,n2=0,n3=0,n4=0, n9,o, edad ;
        long factorial = 1;
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra;
        double lado, altura, base, area, perimetro, radio, volumen, ab;
        double Fahrenheit, Celsius, Kelvin, Rankine, num1 = 0.00, num2 = 0.00, suma = 0.00, multi = 1.00, Division = 0.00, total1 = 0.00, descuento = 0.00 ;
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
                System.out.println("Ingrese el total de su compra:");
                compra = entrada.nextFloat();
                System.out.println("El Total de su Compra es: " + compra);
                System.out.println("Se aplicara un descuento si es Mayor de Edad o Socio");
                System.out.println("Por favor ingrese la Edad: ");
                edad = entrada.nextInt();
                if( edad < 21 ){
                    System.out.println("Los Padres del Cliente son Socios ?");
                    System.out.println("(1) Si");
                    System.out.println("(2) No");
                        opc = entrada.nextInt();
                        switch(opc){
                            case 1:
                            System.out.println("Se le Aplica el Descuento del 45%");
                            descuento = compra * 0.45;
                            total1 = compra - descuento;
                               break;   
                            case 2:
                            System.out.println("Los Padres del Cliente no son Socios");
                            System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                            descuento = compra * 0.25;
                            total1 = compra - descuento; 
                                break;   
                        }
                } else if(edad > 65){
                            System.out.println("Al Cliente por ser mayor de edad se le aplicara un descuento del 40%");
                            descuento = (compra * 0.40);
                            total1 = compra - descuento;   
                        }  
                    System.out.println("Su descuento es: " + descuento + " El total con descuento es de: " + total1);
                    System.out.println("Gracias por su compra");
                            
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
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    Fahrenheit = entrada.nextInt();
                    System.out.println("Elija la conversión deseada:");
                    System.out.println("1. Fahrenheit a Celsius");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Fahrenheit a Rankine");
                    opc = entrada.nextInt();

                    switch (opc) {
                        case 1:
                            Celsius = (Fahrenheit - 32) * 5 / 9;
                            System.out.println("La temperatura en grados Celsius es: " + Celsius);
                            break;
                        case 2:
                            Kelvin = ((Fahrenheit - 32) * 5 / 9 + 273.15);
                            System.out.println("La temperatura en Kelvin es: " + Kelvin);
                            break;
                         case 3:
                            Rankine = Fahrenheit + 459.67;
                            System.out.println("La temperatura en Rankine es: " + Rankine);
                            break;
                        default:
                        System.out.println("Opción no válida.");
                            break;                          
                     }
                    System.out.println("Gracias por elegir este programa");
                    break;
                case 4:
                    System.out.println("Digite la Cantidad de Numeros que va a Ingresar");
                     num = entrada.nextInt();
                    if(num > 0){
                    for(int i = 1; i <= num; i++){
                     System.out.println(" Ingrese los Numeros a Leer");
                        n1 = entrada.nextInt();
                        if(n1 > 0){
                         
                         System.out.print(" Positivo "+n1);
                
                        }else if(n1 < 0){
                        
                        System.out.print(" Negativo "+n1);
                
                        }else if(n1 ==0){
                        
                        System.out.print(" Neutro "+n1);
                     }

                    }

               }else if(num <= 0){
               System.out.println("La Cantidad Ingresada es Incorrecta");
               System.out.println("Vuelva a Ingresar UNA Cantidad Correcta");
               }
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
                    System.out.println("Bienvenido al programa de calculos de areas y perimetros");
                    System.out.println("Elija una opcion deseada: ");
                    System.out.println("1.Rectangulo");
                    System.out.println("2.Triangulo");
                    System.out.println("3.Volumen de una esfera");
                    System.out.println("4.Volumen de un cilindro");

                    opc = entrada.nextInt();
                    switch(opc){
                        case 1 :
                            System.out.println("Ingresa la base del rectangulo");
                            base = entrada.nextDouble();
                            System.out.println("Ingresa la altura del rectangulo");
                            altura = entrada.nextDouble();
                                perimetro = ( base *2 )+( altura * 2 ) ;
                                area = base * altura;
                                System.out.println(" El perimetro es de: " + perimetro + " El area es de: " + area);
                            break;
                        case 2 :
                            System.out.println("Ingresa el lado del triangulo equilatero");
                            lado = entrada.nextDouble();
                            System.out.println("Ingresa la altura del triangulo equilatero");
                            altura = entrada.nextDouble();
                                perimetro = lado*3;
                                area = (lado * altura) /2;
                                System.out.println(" El perimetro es de: " + perimetro + " El area es de: " + area);
                            break;
                        case 3 :
                                System.out.println("Ingresa el radio de una esfera");
                                radio = entrada.nextDouble();
                                volumen = (4/3)*3.1416*(radio*radio*radio);
                                System.out.println(" El volumen de la esfera es " + volumen);
                            break;
                        case 4 :
                                System.out.println("Ingresa el radio del cilindro");
                                radio = entrada.nextDouble();
                                System.out.println("Ingresa la altura");
                                altura = entrada.nextDouble();
                                ab = 3.1416*(radio*radio);
                                volumen = ab*altura;
                                System.out.println(" El volumen del cilindro es: " + volumen);
                            break;
                    }
                            System.out.println("Gracias por elegir este programa");
                           
                    break;
                case 7:
                    //vamos a imprimir una tabla
                    //un ciclo for 
                    for(int n = 1; n <=10; n++){
                        System.out.println(n + " " + (n*10) + " " + (n*100) + " " + (n*1000) + " ");
                    }
                    break;
                case 8:
                    System.out.println("Bienvenido al programa para un factorial");
                    System.out.println("Introduzca el numero para el factorial");
                    num = entrada.nextInt();
                    for (int i = 1; i<= num; i++){
                    factorial *= i;
                    }
                    System.out.println("El factorial de " + num + " es: " + factorial);
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
                System.out.println("Ingrese el tamaño de la figura hueca:");
                figura =entrada.nextInt();

                if( figura>= 0 && figura<= 50);
                      for(int f=0; f<figura; f++){
                       System.out.print("*");

                      }
                      System.out.println();

                      for(int f =0; f<figura-2; f++){
                       System.out.print("*");
                       for(int g=0; g<figura-2; g++){
                         System.out.print (" ");
                       }
                       System.out.println("*");
                      }

                       for(int f=0; f<figura; f++){
                       System.out.print("*");
                       }
                    break;
                case 11:

                    break;
                case 12:
                System.out.println("Diamante :)");
                final int n = 5;

                 for ( o = 1; o <= n; o++)
                  {
                 for (int j = o; j < n; j++) {
                  System.out.print(' ');
                 }
                 for (int k = 1; k < 2*o; k++) {
                  System.out.print('*');
                    }
                  System.out.print(System.lineSeparator());
                 }
                 for ( o = n - 1; o >= 1; o--)
                 {
                 for (int j = n; j > o; j--) {
                   System.out.print(' ');
                 }
                 for (int k = 1; k < (o * 2); k++) {
                  System.out.print('*');
                 }
                  System.out.print(System.lineSeparator());
                 }
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
                    System.out.println("Gracias por usar este programa");
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
