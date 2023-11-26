/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
//import java.util.LinkedList;


/**
 *
 * @author moss_
 */
public class JpaPrueba {

    public static void main(String[] args) {
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        ControladoraLogica control = new ControladoraLogica();
        
        //Creación de materias
        Materia mate1 = new Materia(58,"Programación I","Cuatrimestral");
        Materia mate2 = new Materia(59,"Programación II","Cuatrimestral");
        Materia mate3 = new Materia(60,"Programación Avanzada","Anual");
        
        //Guardando materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Creamos lista de materias y las agregamos
        ArrayList<Materia>listaMaterias=new ArrayList<>();
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        //Creación carrera con lista de materias
        Carrera carre = new Carrera(25,"tecnicatura en Programación",listaMaterias);
        
        //Guardando carrera en BD
        control.crearCarrera(carre);
        
        //Creación Alumno con Carrera
        Alumno al=new Alumno(23,"Ibra","The Yorkie",new Date(),carre);
        
        //Guardamos el Alumno en la BD
        control.crearAlumno(al);
        
        //Alumno alu = new Alumno(30,"Luisina", "JPA",new Date());
        //control.crearAlumno(alu);
        //control.eliminarAlumno(15);
        //alu.setApellido("de Paula");
        //control.editarAlumno(alu);  
        /*Alumno alu = control.traerAlumno(30);
        System.out.println("-------------------BUSQUEDA INDIVIDUAL--------------------------------");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println("-------------------BUSQUEDA DE TODOS ---------------------------------");
        ArrayList<Alumno>listaAlumnos= control.traerListaAlumnos();
        for(Alumno al: listaAlumnos){
            System.out.println("El alumno es: "+al.toString());
        }
        System.out.println("-----------------------------------------------------------------------");*/
        
       // -------------------------Carrera-------------------------
       
       //Creación carrera
      // Carrera carre=new Carrera(25,"Tecnicatura en programación");
       
       //Guardando carrera en BD       
       //control.crearCarrera(carre);
       
       //Creación Alumno (con asociación a carrera)
       //Alumno al=new Alumno(23,"Ibra","The Yorkie",new Date(), carre);
       
       //Guardamos Alumno en la BD
      // control.crearAlumno(al);
       
       //vemos el resultado
       /*System.out.println("--------------------------------------------");
       System.out.println("--------------DATOS ALUMNO------------------");
       Alumno alu=control.traerAlumno(23);
       System.out.println("Alumno: "+ alu.getNombre() + " " + alu.getApellido());
       System.out.println("Cursa la carrera de: "+ alu.getCarre().getNombre());*/
    }
}
