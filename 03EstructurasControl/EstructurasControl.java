
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
    public static void main(Strin[] args){
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

        int opcion, numbinario, total, cantidaddelproducto, num1;
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra;

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




            //aqui  adentro de preguntar
            System.out.println("¿Deseas repetir el programa?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);

        }while(letra == 's'|| letra == 'S');
    }
    
}
