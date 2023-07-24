//Clase implementada para la interfaz de los discos duros
public class TDADriveImp_207114979_HernandezHernandez implements TDADrive_207114979_HernandezHernandez {
    //Variables de Instancia
    private String letter;
    private String nombreUnidad;
    private int capacidad;

    // Constructores
    public TDADriveImp_207114979_HernandezHernandez(String letter, String nombreUnidad, int capacidad){
        this.letter = letter;
        this.nombreUnidad = nombreUnidad;
        this.capacidad = capacidad;
    }
    @Override
    public String getLetter(){
        return letter;
    }
    @Override
    public String getNombreUnidad(){
        return nombreUnidad;
    }
    @Override
    public int getCapacidad(){
        return capacidad;
    }
}
