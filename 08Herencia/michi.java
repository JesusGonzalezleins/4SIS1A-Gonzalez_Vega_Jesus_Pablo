//para poder aplicar las herencias de una clase, se utiliza la palabra reservada:
//extends

public class michi extends Animal {

    //como se puede heredar todas las caracteristicas de la clase padre 

    private int num_vidas;

 

    //se aplica la sobrecarga
    public michi(String nombre,String raza,String tipoalimento,int edad, int num_vidas){
    //y para poder acceder a la clase se utiliza la palabra reservada super
    super(nombre, raza, tipoalimento, edad);
    this.num_vidas = num_vidas;
    }


    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }

    public void mostrarmichi(){
        System.out.println("El nombre del michi es: "+ getnombre() + "\n"
        +"La raza del michi es: "+ getraza() + "\n"
        +"Se alimenta de: "+ gettipoalimento() + "\n"
        +"El michi tiene la edad de : "+ getedad() + "\n"
        +"Las vidas del michi son: "+ num_vidas+ "\n");

    }

    
}
