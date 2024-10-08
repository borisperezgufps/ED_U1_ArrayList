/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.arraylist.modelo;

import java.util.ArrayList;

/**
 *
 * @author Boris Perez
 */
public class Negocio {
    
    private ArrayList<Estudiante> estudiantes;
    
    public Negocio(){
        estudiantes = new ArrayList<Estudiante>();
    }
    
    public void agregarEstudiante(String nombre, String apellido, int edad, double promedio, String codigo){
        Estudiante e = new Estudiante();
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setEdad(edad);
        e.setCodigo(codigo);
        e.setPromedio(promedio);
        
        // TODO Incluir validacion de que no se repita el codigo
        
        // TODO Incluir validacion que solo los aprobados sean incluidos
        
        estudiantes.add(e);
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiante(String codigo) {
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getCodigo().equals(codigo))
                return estudiante;
        }
        return null;
    }
    
}
