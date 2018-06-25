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
public class EstudiantePosgrado extends Estudiante{
    private String titulo;
    private Programa programa;

    public EstudiantePosgrado() {
    }

    public EstudiantePosgrado( int id, String nombres, String apellidos, Curso curso,String titulo, Programa programa) {
        super(id, nombres, apellidos, curso);
        this.titulo = titulo;
        this.programa = programa;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("-DATOS-");
        System.out.println("ID: "+this.getId());
        System.out.println("Nombres: "+this.getNombres());
        System.out.println("Apellidos: "+this.getApellidos());
        System.out.println("Curso: "+this.getCurso().getDescripcion());
        System.out.println("Tìtulo: "+this.getTitulo());
        System.out.println("Programa: "+this.getPrograma().getDescripcion());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    private String getNombres() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    
}
