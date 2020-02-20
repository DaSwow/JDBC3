package jdbc2;



public class Socio {
    
    private int id;
    
    private String nombre;

    private int dni;

    public Socio() {
    }

    public Socio(int id, String nombre, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
