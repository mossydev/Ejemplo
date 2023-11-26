/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moss_
 */
public class ControladoraPersistencia {
    AlumnoJpaController alupa = new AlumnoJpaController();
    CarreraJpaController carrepa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();
    
 //--------------------- ALUMNO --------------------------------------------   
    
    public void crearAlumno(Alumno alu) {
        alupa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alupa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alupa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alupa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
     List<Alumno> listita = alupa.findAlumnoEntities();
     ArrayList<Alumno>listaAlumnos = new ArrayList(listita);
     
     return listaAlumnos;
    } 
//-------------- CARRERA  ------------------------------------------------------
    public void crearCarrera(Carrera carre) {
        carrepa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carrepa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carrepa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carrepa.findCarrera(id);
    }
       
    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista2 = carrepa.findCarreraEntities();
        ArrayList<Carrera>listaCarreras=new ArrayList(lista2);
        
        return listaCarreras;
    }   
//----------------------------- MATERIA ----------------------------------------

    public void crearMateria(Materia mate) {
        mateJpa.create(mate);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        try {
            mateJpa.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }
    
     public LinkedList<Materia> traerListaMaterias() {
        List<Materia> lista3 = mateJpa.findMateriaEntities();
        LinkedList<Materia>listaMaterias=new LinkedList(lista3);
        return listaMaterias;
    }
}
