/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion;

/**
 *
 * @author usuario
 */
public class EstudiantePregrado extends Estudiante{
    private Carrera carrera;

    public EstudiantePregrado() {
    }

    public EstudiantePregrado( int id, String nombres, String apellidos, Curso curso,Carrera carrera) {
        super(id, nombres, apellidos, curso);
        this.carrera = carrera;
    }
        

    @Override
    public void imprimirDatos() {
        System.out.println("-DATOS-");
        System.out.println("ID: "+this.getId());
        System.out.println("Nombres: "+this.getNombres());
        System.out.println("Apellidos: "+this.getApellidos());
        System.out.println("Curso: "+this.getCurso().getDescripcion());
        System.out.println("Carrera: "+this.getCarrera().getDescripcion());
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    private String getNombres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
