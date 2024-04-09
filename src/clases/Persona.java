package clases;

/**
 *
 * @author deilir
 */
public abstract class Persona {

    /**
     *
     */
    protected String dni;

    /**
     *
     */
    protected String nombre;

    /**
     *
     * @param dni
     * @param nombre
     */
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDni() {
        return dni;
    }

    /**
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
