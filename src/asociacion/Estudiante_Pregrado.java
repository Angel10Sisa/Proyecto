package asociacion;
public class Estudiante_Pregrado extends Estudiante{
    private Carrera carrera;
    public Estudiante_Pregrado(){
        super();
        carrera=null;
    }
    public Estudiante_Pregrado(int pid,String pnombre,String papellido,Curso pcurso,Carrera pcarrera){
        super(pid,pnombre,papellido,pcurso);
        carrera=pcarrera;   
    }
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera pcarrera) {
        this.carrera = pcarrera;
    }
    @Override
    public void imprimirDatos() {
        System.out.println("Codigo: "+this.getId());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("Curso: "+this.getCurso().getDescripcion());
        System.out.println("Carrera: "+this.getCarrera().getDescripcion());
    }
}
