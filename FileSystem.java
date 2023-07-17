import java.util.Date;


public class FileSystem{
    private String nombreSistema;
    private Date fechaSistema;

    public FileSystem(String nombre){
        this.nombreSistema = nombre;
        this.fechaSistema = new Date();
    }
    public String getNombre(){
        return nombreSistema;
    }
    public Date getFecha(){
        return fechaSistema;
    }
}



