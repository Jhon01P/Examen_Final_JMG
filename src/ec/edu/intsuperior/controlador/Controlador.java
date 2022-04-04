/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;


import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.CrearCurso;
import ec.edu.intsuperior.vista.CrearDocente;
import ec.edu.intsuperior.vista.CrearEstudiante;
import ec.edu.intsuperior.vista.CrearMateria;
import ec.edu.intsuperior.vista.Docente;
import ec.edu.intsuperior.vista.EditarCurso;
import ec.edu.intsuperior.vista.EditarDocente;
import ec.edu.intsuperior.vista.EditarEstudiante;
import ec.edu.intsuperior.vista.EditarMateria;
import ec.edu.intsuperior.vista.EliminarCurso;
import ec.edu.intsuperior.vista.EliminarDocente;
import ec.edu.intsuperior.vista.EliminarEstudiante;
import ec.edu.intsuperior.vista.EliminarMateria;
import ec.edu.intsuperior.vista.Estudiante;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.VerInformacion;

/**
 *
 * @author JhonP
 */
public class Controlador {
    
    Docente docente=new Docente(this);
    Estudiante estudiante=new Estudiante(this);
    Loggin loggin=new Loggin(this);
    Administrador administrador=new Administrador(this);
    CrearMateria crearMateria=new CrearMateria(this);
    EditarMateria editarMateria=new EditarMateria(this);
    EliminarMateria eliminarMateria=new EliminarMateria(this);
    CrearCurso crearCurso=new CrearCurso(this);
    EditarCurso editarCurso=new EditarCurso(this);
    EliminarCurso  eliminarCurso=new EliminarCurso(this);
    CrearDocente crearDocente=new CrearDocente(this);
    EditarDocente editarDocente=new EditarDocente(this);
    EliminarDocente eliminarDocente=new EliminarDocente(this);
    CrearEstudiante crearEstudiante=new CrearEstudiante(this);
    EditarEstudiante editarEstudiante=new EditarEstudiante(this);
    EliminarEstudiante eliminarEstudiante=new EliminarEstudiante(this);
    VerInformacion verInformacion=new VerInformacion(this);
            
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
   
    
    public void showDocente (){
        docente.setVisible(true);
    }
    
    public void showEstudiante(){
        estudiante.setVisible(true);
        
    }
    public void showAdministrador(){
        administrador.setVisible(true);
    }
     public void showCrearMateria (){
       
        crearMateria.setSize(550, 550);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(crearMateria);
        crearMateria.setVisible(true);
        administrador.Escritorio.revalidate();
        crearMateria.repaint();
    }
      public void showEditarMateria (){
       
        editarMateria.setSize(1500, 1500);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(editarMateria);
        editarMateria.setVisible(true);
        administrador.Escritorio.revalidate();
        editarMateria.repaint();
    }
    public void showEliminarMateria (){
        eliminarMateria.setSize(1500, 1500);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(eliminarMateria);
        eliminarMateria.setVisible(true);
        administrador.Escritorio.revalidate();
        eliminarMateria.repaint();     
    }
    public void showCrearCurso (){
       
        crearCurso.setSize(1000, 1000);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(crearCurso);
        crearCurso.setVisible(true);
        administrador.Escritorio.revalidate();
        crearCurso.repaint();
    }
      public void showEditarCurso (){
       
        editarCurso.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(editarCurso);
        editarCurso.setVisible(true);
        administrador.Escritorio.revalidate();
        editarCurso.repaint();
    }
    public void showEliminarCurso (){
        eliminarCurso.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(eliminarCurso);
        eliminarCurso.setVisible(true);
        administrador.Escritorio.revalidate();
        eliminarCurso.repaint();
    }    
     public void showCrearDocente (){
       
        crearDocente.setSize(1000, 1000);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(crearDocente);
        crearDocente.setVisible(true);
        administrador.Escritorio.revalidate();
        crearDocente.repaint();
    }
      public void showEditarDocente (){
       
        editarDocente.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(editarDocente);
        editarDocente.setVisible(true);
        administrador.Escritorio.revalidate();
        editarDocente.repaint();
    }
    public void showEliminarDocente (){
        eliminarDocente.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(eliminarDocente);
        eliminarDocente.setVisible(true);
        administrador.Escritorio.revalidate();
        eliminarDocente.repaint();    
    }    
     public void showCrearEstudiante (){
       
        crearEstudiante.setSize(1000, 1000);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(crearEstudiante);
        crearEstudiante.setVisible(true);
        administrador.Escritorio.revalidate();
        crearEstudiante.repaint();
    }
      public void showEditarEstudiante (){
       
        editarEstudiante.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(editarEstudiante);
        editarEstudiante.setVisible(true);
        administrador.Escritorio.revalidate();
        editarEstudiante.repaint();
    }
    public void showEliminarEstudiante (){
        eliminarEstudiante.setSize(450, 450);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(eliminarEstudiante);
        eliminarEstudiante.setVisible(true);
        administrador.Escritorio.revalidate();
        eliminarEstudiante.repaint();  
     }
    public void showVerInformacion (){
        verInformacion.setSize(1000, 1000);
        administrador.Escritorio.removeAll();
        administrador.Escritorio.add(verInformacion);
        verInformacion.setVisible(true);
        administrador.Escritorio.revalidate();
        verInformacion.repaint();  
}
    public void probarConexion (){
        Conexion.getConexion();
    }

   
}
