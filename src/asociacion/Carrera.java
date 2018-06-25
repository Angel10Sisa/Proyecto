package asociacion;

public class Carrera {

    protected int id;
    protected String descripcion;

    public Carrera() {
        id = 0;
        descripcion = "SD";
    }

    public Carrera(int pid, String pdescripcion) {
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
