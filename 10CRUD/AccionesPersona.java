import java.util.ArrayList;

public class AccionesPersona {
    /*
     * Acciones persona es una clase  de tipo controlador, elcontrolador es una clase que se encarga
     * de las acciones u operaciones que debe de tener el objeto que se ha creado, por lo regular siempre esta 
     * asociado a operaciones basicas como
     * consultar consult
     * registrar register
     * actualizar uodate
     * eliminar delate
     * 
     * CRUD
     * 
     * ahora cuando pensamos en las acciones de la persona, es necesario guardar todos los datos de forma dinamica
     * porque constantemente van a estar generando nuevos registros, para ello necesitamos
     * utilizar un tipo de objeto especial llamado
     * 
     * "ArrayList", es un arreglo dinamico de objetos,a comparacion de otros objetos un arreglo solo puede contener un tipo de dato
     * por ejemplo int[] char letras[] double precio[]
     * 
     * ArrayList al ser dinamico puede cambiar su tamaño, se puede adaptar a diferentes tipos de dato, por que lo que guarda objetos
     *  
     */
    // declaramos un objeto de persona tipo arraylist

    public ArrayList<Persona> listapersonas = new ArrayList<Persona>();

     //vamos a crear un metodo para guardar el registro de una persona
     public void agregarPersona(Persona p){
        //voy a ocupar a mi listapersona para agregarlo
        listapersonas.add(p);
     }

     //buscar a una persona por su id
     public Persona buscarPersona(int id){
        //necesito una persona para saber si la encontre y otra para buscarla 
    Persona encontrada = new Persona();

    //necesito recorrer  el arraylist de persona donde estan registradas 
    for(Persona p : listapersonas){
        if(id == p.getId()){
            encontrada = p ;
        }else{
            System.out.println("no existe registro de la persona");
        }
    }
    return encontrada;

     }
        //actualizar los datos de una persona
        public void actualizarPersona(Persona actualizada){
            //como se hace el proceso de actualizar
            //1 debo de buscar a la persona que quiero actualizr
            //2 ya que lo encontre debbo de cambiar los datos(borrar el anterior dato)
            //actualizar los datos de la nueva persona

            Persona actualizar = buscarPersona(actualizada.getId());

            //cambio las datos
            listapersonas.remove(actualizar);

            //actualizo
            listapersonas.add(actualizar);
        }

        //necesito eliminar el registro de una persona
        public void eliminarPersona(Persona eliminada){
            listapersonas.remove(eliminada);
        }

        //quiero mostrar la lista completa de personas

        public ArrayList<Persona> mostrarPersonas(){
            return listapersonas;
        }
}
