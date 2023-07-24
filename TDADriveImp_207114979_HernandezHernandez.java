public class TDADriveImp_207114979_HernandezHernandez implements TDADrive_207114979_HernandezHernandez {
    private String letter;
    private String nombreUnidad;
    private int capacidad;

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
