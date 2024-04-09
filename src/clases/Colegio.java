package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deilir
 */
public class Colegio {
    private List<Asignatura> asignaturas;
    private List<Persona> personas;

    /**
     *
     * @param asignaturas
     * @param personas
     */
    public Colegio(List<Asignatura> asignaturas, List<Persona> personas) {
        this.asignaturas = new ArrayList<>();
        this.personas = new ArrayList<>();
    }
    
    /**
     *Metodo que guarda todos los datos en un fichero
     * @param asignatura
     * @param profesor
     * @param alumno
     */
    public void guardarDatos(String asignatura, Profesor profesor, Alumno alumno) {
    }
    
    /**
     *Metodo que carga todos los datos desde fichero. No recibe ningun parametro
     */
    public void cargarDatos(){
    }
    
    /**
     *Metodo que lista solo los profesores. No recibe ningun parametro
     */
    public void listarProfesor(){
    }
    
    /**
     *Metodo que lista solo los alumnos. No recibe ningun parametro
     */
    public void listarAlumno(){
    }
    
    /**
     *Metodo que da de alta a los profesores.
     * @param departamento
     * @param dni
     * @param nombre
     */
    public void altaProfesor(String departamento, String dni, String nombre){
    }
    
    /**
     *Metodo que da de alta a los alumnos.
     * @param fechaMatriculacion
     * @param nacionalidad
     * @param dni
     * @param nombre
     */
    public void altaAlumno(String fechaMatriculacion, String nacionalidad, String dni, String nombre){
    }
    
    /**
     *Metodo que da de alta a las asignaturas.
     * @param codigo
     * @param nombre
     * @param numeroHoras
     * @param dni
     */
    public void altaAsignatura(String codigo, String nombre, int numeroHoras, String dni){
        
    }
    
    /**
     *Metodo que matricula a los alumnos.
     * @param codigo
     * @param dni
     */
    public void matricularAlumnos(String codigo, String dni){
    }
     
    /**
     *Metodo que devuelve la cantidad de asignaturas impartidas por un profesor
     * @param dni
     * @return
     */
    public int asignaturasProfesor(String dni){
        return 0;
    }
    
    /**
     *Metodo que obtiene la asignatura con mas alumnos matriculados. No recibe parametros
     * @return
     */
    public Asignatura asignaturaAlumnosMatriculados(){
        return null;
    }
    
     
}
