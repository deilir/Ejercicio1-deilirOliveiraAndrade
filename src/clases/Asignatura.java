package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deilir
 */
public class Asignatura {
    private String codigoAsignatura;
    private String nombreAsignatura;
    private int horasAnualesAsignatura;
    private Profesor profesor;
    private List<Alumno> alumnos;

    /**
     *Constructor que crea un objeto asignatura
     * @param codigoAsignatura
     * @param nombreAsignatura
     * @param horasAnualesAsignatura
     * @param profesor
     * @param alumnos
     */
    public Asignatura(String codigoAsignatura, String nombreAsignatura, int horasAnualesAsignatura, Profesor profesor, List<Alumno> alumnos) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.horasAnualesAsignatura = horasAnualesAsignatura;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    /**
     *
     * @param codigoAsignatura
     */
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    /**
     *
     * @return
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     *
     * @param nombreAsignatura
     */
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    /**
     *
     * @return
     */
    public int getHorasAnualesAsignatura() {
        return horasAnualesAsignatura;
    }

    /**
     *
     * @param horasAnualesAsignatura
     */
    public void setHorasAnualesAsignatura(int horasAnualesAsignatura) {
        this.horasAnualesAsignatura = horasAnualesAsignatura;
    }

    /**
     *
     * @return
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     *
     * @param profesor
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     *
     * @return
     */
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     *
     * @param alumnos
     */
    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
