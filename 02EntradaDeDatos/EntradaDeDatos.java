import java.io.*;

class EntradaDeDatos {
    //debe de existir un metodo principal
    public static void main(String[] args) throws IOException {
    //debemos crear una estructura basica
    //declaracion
    char nombre ;
    //mensaje para usuario
    System.out.println("Por favor ingrese su nombre: ");
    //ln es salto de linea
    
    //asignar nombre de la operacion o comportamiento que se le otorga a la variable

    nombre = (char)System.in.read();
    //system es la clase del sistema
    //console() es el metodo que puede obtener los datos de la consola
    //readLine() es el metodo que puede dar lectura a los datos introducidos
    System.out.println("Hola "+ nombre + " Bienvenido");
    }

}
