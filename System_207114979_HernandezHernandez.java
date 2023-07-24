import java.util.Date;

public interface System_207114979_HernandezHernandez {
    public void crearSistemaArchivos(String nombre);
    public void operarSistemaArchivos();
    public Date getFechaCreacion();
    public void agregarUnidad(String letter, String nombre, int capacidad);
    public void registroUsuario(String nombreUsuario);
    public void iniciarSesion(String nombreUsuario);
    public void cerrarSesion();
    public void unidadFijada(String letter);


}
