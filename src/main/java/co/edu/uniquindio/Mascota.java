package co.edu.uniquindio;

public class Mascota {
    // Atributos Propios
    private String nombre;
    private String id;
    private int edad;
    private String especie;

    // Atributos de Relaciones
    private Propietario thePropietario;

    public Mascota(String nombre, String id, int edad, String especie) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Propietario getThePropietario() {
        return thePropietario;
    }

    public void setThePropietario(Propietario thePropietario) {
        this.thePropietario = thePropietario;
    }

}

