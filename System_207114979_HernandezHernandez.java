import java.util.Date;

//Interfaz para el Sistema en general
public interface System_207114979_HernandezHernandez {
    // Constructores
    public void crearSistemaArchivos(String nombre);
    public void operarSistemaArchivos();
    public Date getFechaCreacion();
    public void agregarUnidad(String letter, String nombre, int capacidad);
    public void registroUsuario(String nombreUsuario);
    public void iniciarSesion(String nombreUsuario);
    public void cerrarSesion();
    public void unidadFijada(String letter);
    public void hacerDirectorio(String nombreCarpeta);
    public void verSistemaCompleto();


}
