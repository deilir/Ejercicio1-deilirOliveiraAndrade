package clases;

/**
 *
 * @author deilir
 */
public class Profesor extends Persona{
    private String departamento;

    /**
     *Constructor que crea un objeto Profesor
     * @param departamento
     * @param dni
     * @param nombre
     */
    public Profesor(String departamento, String dni, String nombre) {
        super(dni, nombre);
        this.departamento = departamento;
    }

    /**
     *
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     *
     * @param departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
