package ExamenGato2;


public class Usuario {
    
    private String nombre;
    
    private String edad;
    
    private String puntaje;

    //constructor
    public Usuario(String nombre, String edad, String puntaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

     
    
}
