import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//Clase implementada para la interfaz del sistema de archivos
public class TDAFilesystemImp_207114979_HernandezHernandez implements TDAFilesystem_207114979_HernandezHernandez, System_207114979_HernandezHernandez{
    //Variables de Instancia
    private List<TDAFolder_207114979_HernandezHernandez> carpetasCreadas;
    private List<TDADrive_207114979_HernandezHernandez> unidades;
    private Date fechaCreacion;
    private String nombre;
    private List<String> usuariosRegistrados;
    private String usuarioLogeado;
    private boolean sesionActiva;
    private String unidadActual;
    private String directorioActual;
    private String atriSeguridad;
    // Constructores
    public TDAFilesystemImp_207114979_HernandezHernandez(String name){
        this.nombre = nombre;
        unidades = new ArrayList<>();
        fechaCreacion = new Date();
        usuariosRegistrados = new ArrayList<>();
        usuarioLogeado = null;
        sesionActiva = false;
        unidadActual = null;
        carpetasCreadas = new ArrayList<>();
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
    public String getUnidadActual(){
        return unidadActual;
    }
    public boolean isSesionActiva(){
        return sesionActiva;
    }
    // Métodos públicos
    @Override
    //Permite añadir una unidad con letra de unidad única
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
    //Permite registrar un nuevo usuario con nombre único
    public void registroUsuario(String nombreUsuario){
        if(usuariosRegistrados.contains(nombreUsuario)){
            System.out.println("Error al registrar el usuario. Los nombres de usuarios deben ser únicos");
        }
        else{
            usuariosRegistrados.add(nombreUsuario);
            System.out.println("Se ha registrado el usuario " + nombreUsuario);
        }
    }
    @Override
    //Permite iniciar sesión con un usuario que ya esté registrado
    public void iniciarSesion(String nombreUsuario){
        if(sesionActiva == true && usuarioLogeado.equals(nombreUsuario)){
            System.out.println("el usuario " + nombreUsuario + " ya inició sesión anteriormente");
            return;
        }
        else if(sesionActiva == true){
            System.out.println("Ya hay un usuario logeado en el sistema");
            return;
        }
        else if(usuariosRegistrados.contains(nombreUsuario)){
            usuarioLogeado = nombreUsuario;
            sesionActiva = true;
            System.out.println("El usuario " + nombreUsuario + " ha iniciado sesión");
        }
        else{ System.out.println("El usuario " + nombreUsuario + " no está registrado en el sistema");
        }
    }
    @Override
    //Permite cerrar sesión si hay un usuario logeado
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
    //Permite fijar la unidad en la que se realizarán acciones
    public void unidadFijada(String letter){
        if(sesionActiva){
            boolean existeUnidad = false;
            for(TDADrive_207114979_HernandezHernandez unidad: unidades){
                if(unidad.getLetter().equalsIgnoreCase(letter)){
                    unidadActual = letter;
                    System.out.println("Se ha fijado la unidad " + letter);
                    existeUnidad = true;
                    directorioActual = unidadActual;
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
    @Override
    //Permite crear una carpeta en el sistema
    public void hacerDirectorio(String nombreCarpeta){
        if(isSesionActiva() && getUnidadActual() != null){
            TDAFolder_207114979_HernandezHernandez carpeta = new TDAFolderImp_207114979_HernandezHernandez(nombreCarpeta, usuarioLogeado, "Lectura");
            carpetasCreadas.add(carpeta);
            System.out.println("Se ha creado la carpeta " + nombreCarpeta + " en el directorio " + directorioActual);
        }
        else if(isSesionActiva() == true && getUnidadActual() == null){
            System.out.println("No hay una unidad fijada para realizar acciones");
        }
        else if(isSesionActiva() == false && getUnidadActual() != null){
            System.out.println("No hay un usuario logeado en el sistema");
        }
        else{
            System.out.println("No hay unidad fijada y tampoco un usuario logeado en el sistema");
        }
    }
    public void verSistemaCompleto(){
        //Permite observar todos los elementos del sistema
        System.out.println("Unidades creadas: ");
        for(TDADrive_207114979_HernandezHernandez unidad : unidades){
            System.out.println("- Unidad: " + unidad.getLetter() + "\n Nombre: " + unidad.getNombreUnidad() + "\n Capacidad: " + unidad.getCapacidad() + " Gigabytes");
        }
        System.out.println("Usuarios registrados: ");
        for(String usuario : usuariosRegistrados){
            System.out.println("- " + usuario);
        }
        System.out.println("Estado del sistema: ");
        if(sesionActiva){
            System.out.println("- Está logeado el usuario: " + usuarioLogeado);
        }
        else{
            System.out.println("- No hay usuario logeado");
        }
        if(unidadActual != null){
            System.out.println("- Unidad donde se realizan acciones: " + unidadActual);
        }
        else{
            System.out.println("- No hay una unidad fijada");
        }
        System.out.println("Carpetas creadas: ");
        for(TDAFolder_207114979_HernandezHernandez carpeta : carpetasCreadas){
            System.out.println("Nombre de la carpeta: " + carpeta.getNombreCarpeta());
            System.out.println("Creador: " + carpeta.getUsuarioCreador());
            System.out.println("Ubicación: " + directorioActual);
            System.out.println("Fecha de creación: " + carpeta.getFechaCreacion());
            System.out.println("Fecha de última modificación: " + carpeta.getUltimaModificacion());
            System.out.println("Atributos de seguridad: " + carpeta.getAtributoSeguridad());
        }
    }
}


