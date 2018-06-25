package asociacion;
public class Estudiante_Posgrado extends Estudiante{
    private String titulo;
    private Programa programa;

    public Estudiante_Posgrado() {
    }

    public Estudiante_Posgrado(int pid, String pnombre, String papellido, Curso pcurso,String titulo, Programa programa) {
        super(pid, pnombre, papellido, pcurso);
        this.titulo = titulo;
        this.programa = programa;
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
    

    @Override
    public void imprimirDatos() {
        System.out.println("Codigo: "+this.getId());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Curso: "+this.getCurso().getDescripcion());
        System.out.println("Titulo: "+titulo);
        System.out.println("Programa: "+this.getPrograma().getDescripcion());
    }
    
}
