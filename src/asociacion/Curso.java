
package asociacion;
public class Curso {
    protected int id;
    protected String descripcion;
    public Curso(){
        id=0;
        descripcion="SD";
    }
    public Curso(int pid,String pdescripcion){
        this.id=pid;
        this.descripcion=pdescripcion;
    }
    public int getId(){
        return id;
    }
    public void setId(int pid){
        this.id=pid;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String pdescripcion){
        this.descripcion=pdescripcion;
    }
    
}
