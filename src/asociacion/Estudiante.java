package asociacion;

abstract public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private Curso curso;

    public Estudiante() {
        id = 0;
        nombre = "SD";
        apellido = "SD";
        curso = null;
    }
    public Estudiante(int pid,String pnombre,String papellido,Curso pcurso){
        this.id=pid;
        this.nombre=pnombre;
        this.apellido=papellido;
        this.curso=pcurso;   
    }
    public int getId(){
        return id;
    }
    public void setId(int pid){
        this.id=pid;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String pnombre){
        this.nombre=pnombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String papellido){
        this.apellido=papellido;
    }
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso pcurso){
        this.curso=pcurso;
    }
    abstract public void imprimirDatos();
}
