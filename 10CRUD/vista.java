import java.util.*;

public class vista {

    //vamos a crear nuestro menu

    public void menu(){
        int opcion;
        Scanner entrada = new Scanner(System.in);

        //vamos a crear una instancia de Persona y del controlador
        AccionesPersona control = new AccionesPersona();

        System.out.println("Bienvenido al programa de alumnos de utc");
        System.out.println("Elija una opcion");
        System.out.println("1 mostrar a todos los alumnos");
        System.out.println("2 registrar a un nuevo alumno");
        System.out.println("3 editar a un alumno");
        System.out.println("4 borrar");
        System.out.println("5 salir");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                //mostrar todo el registro de la persona
                System.out.println("alumnos: ");
                //instancia de la lista de personas 
                ArrayList<Persona> listadepersonas = control.mostrarPersonas();

                //al tener la lista de personas hace falta recorrer los registros de dicha lista 
                for (Persona objeto : listadepersonas){
                    System.out.println("El id es : " + objeto.getId()+ "\n"
                                        +"El nombre es : " + objeto.getNombre()+ "\n"
                                        +"La edad es : " + objeto.getEdad()+ "\n"   );

                }
                menu();
                break;
            case 2 :
                //debemos registrar los datos de la persona
                //parseInt sirve para convertir algo a entero
                System.out.println("Ingrese el id del alumno");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre del alumno");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese la edad del alumno ");
                int edadpersona = Integer.parseInt(entrada.nextLine());

                //ahora debo realizar la instancia de la persona
                Persona personaAlumno = new Persona(idpersona, nombrepersona, edadpersona);
                
                control.agregarPersona(personaAlumno);
                menu();
                break;
            case 3:
                //buscar a la persona que quiero editar, por medio del id
                System.out.println("Ingresa el id del alumno a buscar");
                idpersona = Integer.parseInt(entrada.nextLine());

                //mando a llamar al metodo de busqueda
                Persona personabuscar = control.buscarPersona(idpersona);

                //veo la informacion 
                System.out.println("La informacion del alumno es: " + "\n" 
                                    +   "ID: " +personabuscar.getId() + "\n"
                                    +   "Nombre : " + personabuscar.getNombre() + "\n"
                                    +   "Edad : " + personabuscar.getEdad() + "\n");
                
                //cambio los datos que desee
                System.out.println("Ingrese el nuevo nombre del alumno: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingrese la nueva edad del alumno: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());

                //al tener los nuevos datos debo enviarlos

                personabuscar.setNombre(nuevonombre);
                personabuscar.setEdad(nuevaedad);

                //ahora si actualizo el registro
                control.actualizarPersona(personabuscar);
                menu();
                break;
            case 4:
                System.out.println("Ingresa el Id del alumno a borrar");
                idpersona = Integer.parseInt(entrada.nextLine());

                //creo la persona para eliminarla
                Persona personaeliminar = control.buscarPersona(idpersona);

                //lo elimino
                control.eliminarPersona(personaeliminar);
                System.out.println("alumno eliminado ");
                menu();
                break;

            default:
                System.out.println("opcion no valida");
                break;
        }

        
    }
    
}
