import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDAFilesystemImp_207114979_HernandezHernandez implements TDAFilesystem_207114979_HernandezHernandez, System_207114979_HernandezHernandez{
    private List<TDADrive_207114979_HernandezHernandez> unidades;
    private Date fechaCreacion;
    private String nombre;
    private List<String> usuariosRegistrados;
    private String usuarioLogeado;
    private boolean sesionActiva;
    private String unidadActual;

    public TDAFilesystemImp_207114979_HernandezHernandez(String name){
        this.nombre = nombre;
        unidades = new ArrayList<>();
        fechaCreacion = new Date();
        usuariosRegistrados = new ArrayList<>();
        usuarioLogeado = null;
        sesionActiva = false;
        unidadActual = null;
    }
    @Override
    public void crearSistemaArchivos(String nombre){
    }
    @Override
    public void operarSistemaArchivos(){
    }
    @Override
    public Date getFechaCreacion(){
        return fechaCreacion;
    }
    @Override
    public void agregarUnidad(String letter, String nombreUnidad, int capacidad){
        for(TDADrive_207114979_HernandezHernandez unidadExistente : unidades){
            if(unidadExistente.getLetter().equalsIgnoreCase(letter)){
                System.out.println("Error al agregar la unidad. La letra de la unidad debe ser única");
                return;
            }
        }
        TDADrive_207114979_HernandezHernandez nuevaUnidad = new TDADriveImp_207114979_HernandezHernandez(letter, nombreUnidad, capacidad);
        unidades.add(nuevaUnidad);
        System.out.println("Se ha agregado la unidad " + letter + " con nombre " + nombreUnidad + " y capacidad " + capacidad + " Gigabytes" );
    }
    @Override
    public void registroUsuario(String nombreUsuario){
        if(usuariosRegistrados.contains(nombreUsuario)){
            System.out.println("Error al registrar el usuario. Los nombres de usuarios deben ser únicos");
        }
        usuariosRegistrados.add(nombreUsuario);
        System.out.println("Se ha registrado el usuario " + nombreUsuario);
    }
    @Override
    public void iniciarSesion(String nombreUsuario){
        if(sesionActiva == true && usuarioLogeado.equals(nombreUsuario)){
            System.out.println("el usuario " + nombreUsuario + " ya inició sesión anteriormente");
            return;
        }
        if(sesionActiva == true){
            System.out.println("Ya hay un usuario logeado en el sistema");
            return;
        }
        if(usuariosRegistrados.contains(nombreUsuario)){
            usuarioLogeado = nombreUsuario;
            sesionActiva = true;
            System.out.println("El usuario " + nombreUsuario + " ha iniciado sesión");
        }
        else{ System.out.println("El usuario " + nombreUsuario + " no está registrado en el sistema");
        }
    }
    @Override
    public void cerrarSesion(){
        if(sesionActiva){
            System.out.println("Se ha cerrado la sesión del usuario " + usuarioLogeado);
            sesionActiva = false;
            usuarioLogeado = null;
        }
        else{
            System.out.println("No hay ningún usuario logeado");
        }
    }
    @Override
    public void unidadFijada(String letter){
        if(sesionActiva){
            boolean existeUnidad = false;
            for(TDADrive_207114979_HernandezHernandez unidad: unidades){
                if(unidad.getLetter().equalsIgnoreCase(letter)){
                    unidadActual = letter;
                    System.out.println("Se ha fijado la unidad " + letter);
                    existeUnidad = true;
                    break;
                }
            }
            if(!existeUnidad) {
                System.out.println("La unidad " + letter + " no existe en el sistema");
            }
        }
        else{
            System.out.println("No existe ningún usuario logeado. Para poder fijar una unidad, primero se debe iniciar sesión");
        }
    }
}


