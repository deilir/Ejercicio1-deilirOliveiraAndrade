package clases;

import java.time.LocalDate;

/**
 *
 * @author deilir
 */
public class Alumno extends Persona{
    private LocalDate fechaMatriculacion;
    private String nacionalidad;

    /**
     * Constructor que crea un objeto Alumno
     * @param fechaMatriculacion
     * @param nacionalidad
     * @param dni
     * @param nombre
     */
    public Alumno(LocalDate fechaMatriculacion, String nacionalidad, String dni, String nombre) {
        super(dni, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    /**
     *
     * @param fechaMatriculacion
     */
    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    /**
     *
     * @return
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     *
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
