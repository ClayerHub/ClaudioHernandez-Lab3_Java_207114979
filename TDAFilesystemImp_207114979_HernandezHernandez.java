import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDAFilesystemImp_207114979_HernandezHernandez implements TDAFilesystem_207114979_HernandezHernandez, System_207114979_HernandezHernandez{
    private List<TDADrive_207114979_HernandezHernandez> unidades;
    private Date fechaCreacion;
    private String nombre;

    public TDAFilesystemImp_207114979_HernandezHernandez(String name){
        this.nombre = nombre;
        unidades = new ArrayList<>();
        fechaCreacion = new Date();
    }

    @Override
    public void crearSistemaArchivos(String nombre){
        System.out.println("Creando el sistema de archivos" + nombre);
    }

    @Override
    public void operarSistemaArchivos(){

    }

    @Override
    public Date getFechaCreacion(){
        return fechaCreacion;
    }

    @Override
    public void agregarUnidad(String letter, String nombre, int capacidad){
        for(TDADrive_207114979_HernandezHernandez unidad : unidades){
            if(unidad.getLetter().equalsIgnoreCase(letter)){
                System.out.println("Error al agregar la unidad. La letra de la unidad debe ser única");
                return;
            }
        }
        TDADrive_207114979_HernandezHernandez unidad = new TDADriveImp_207114979_HernandezHernandez(letter, nombre, capacidad);
        System.out.println("Se ha agregado la unidad " + letter + " con nombre " + nombre + " y capacidad " + capacidad + "Gb" );
    }

}


