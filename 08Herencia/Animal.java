
// Crear una tienda de mascotas de adopcion
//clase padre


public class Animal {

    //principio de encapsulamiento Es poder restrimgir el acceso a los datos, vamos a poder agrupar
    //en una clase el acceso a los diferentes atributos y metodos u objetos de la clase para que no puedan ser modificados 
    //desde otro lugar

    //definir las variables
    private String nombre, raza, tipoalimento;
    private int edad;

    //se debe de crear el constructor, el contructor sirve para poder declarar
    //la existencia de una clase, para poder inicializar las variables, 
    //para crear las instancias de una clase 

    public Animal(){
        //contructor por defecto
    }

    //cuando  existe una construccion del objeto, de acuerdo a las necesidades
    //por parte del usuario es necesario utilizar la sobrecarga de lso metodos
    //en este caso la sobre carga del contructor

    //parametros del registro
    public Animal (String nom,String raza,String tipoalimento,int edad){
        //pero como son privados los atributos, debemos tener una forma de  acceso
        //la palabra reservada this, nos sirve para poder acceder a los atributos privados

        this.nombre = nom;
        this.raza = raza;
        this.tipoalimento = tipoalimento;
        this.edad = edad;
    }

    //para poder modificar los valores  de la asignacion, es necesario poder utilizar los metodos:
    //getter and setter
    //get ----obtener ----recibir
    //set ----asignar ----enviar
    
    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nom){
        this.nombre = nom;
    }

    public String getraza(){
        return nombre;
    }

    public void setraza(String raza){
        this.raza = raza;
    }

    public String gettipoalimento(){
        return tipoalimento;
    }

    public void settipoalimento(String tipoalimento){
        this.tipoalimento = tipoalimento;
    }

    public int getedad(){
        return edad;
    }

    public void setedad(int edad){
        this.edad = edad;
    }


    
}
