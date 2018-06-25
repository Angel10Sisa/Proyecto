package asociacion;
public class Programa {
    private int id;
    private String descripcion;
    public Programa() {
        id = 0;
        descripcion = "SD";
    }

    public Programa(int pid, String pdescripcion) {
        id = pid;
        descripcion = pdescripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int pid) {
        this.id = pid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String pdescripcion) {
        this.descripcion = pdescripcion;
    }
    
}
