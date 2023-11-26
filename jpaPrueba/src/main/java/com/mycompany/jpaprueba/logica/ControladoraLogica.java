/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author moss_
 */
public class ControladoraLogica{
    
    ControladoraPersistencia controlper = new ControladoraPersistencia();
    
    //--------------------- Métodos de Alumno ----------------------------------
    
    public void crearAlumno(Alumno alu){
        controlper.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlper.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlper.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        return controlper.traerAlumno(id);
    }

      public ArrayList<Alumno> traerListaAlumnos(){
        return controlper.traerListaAlumnos();
    }
//------------------------ Métodos de Carrera --------------------------------------------
       public void crearCarrera(Carrera carre){
        controlper.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
        controlper.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlper.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id){
        return controlper.traerCarrera(id);
    }

      public ArrayList<Carrera> traerListaCarreras(){
        return controlper.traerListaCarreras();
    }
 //---------------------- Métodos de Materia -----------------------------------
    public void crearMateria(Materia mate){
        controlper.crearMateria(mate);
    }
    
    public void eliminarMateria(int id){
        controlper.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate){
        controlper.editarMateria(mate);
    }
    
    public Materia traerMateria(int id){
        return controlper.traerMateria(id);
    }

      public LinkedList<Materia> traerListaMaterias(){
        return controlper.traerListaMaterias();
    }  
      
}
