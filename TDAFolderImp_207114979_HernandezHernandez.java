import java.util.Date;
//Clase implementada para la interfaz de las carpetas
public class TDAFolderImp_207114979_HernandezHernandez implements TDAFolder_207114979_HernandezHernandez{
    //Variables de Instancia
    private String nombreCarpeta;
    private String usuarioCreador;
    private String atributoSeguridad;
    private Date fechaCreacion;
    private Date ultimaModificacion;
    // Constructores
    public TDAFolderImp_207114979_HernandezHernandez(String nombreCarpeta, String usuarioCreador, String atributoSeguridad){
        this.nombreCarpeta = nombreCarpeta;
        this.usuarioCreador = usuarioCreador;
        this.atributoSeguridad = atributoSeguridad;
        this.fechaCreacion = new Date();
        this.ultimaModificacion = new Date();
    }
    @Override
    public String getNombreCarpeta(){
        return nombreCarpeta;
    }
    @Override
    public String getUsuarioCreador(){
        return usuarioCreador;
    }
    @Override
    public String getAtributoSeguridad(){
        return atributoSeguridad;
    }
    @Override
    public Date getFechaCreacion(){
        return fechaCreacion;
    }
    @Override
    public Date getUltimaModificacion(){
        return ultimaModificacion;
    }
}
