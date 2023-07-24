public class TDADriveImp_207114979_HernandezHernandez implements TDADrive_207114979_HernandezHernandez {
    private String letter;
    private String nombre;
    private int capacidad;

    public TDADriveImp_207114979_HernandezHernandez(String letter, String nombre, int capacidad){
        this.letter = letter;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String getLetter(){
        return letter;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public int getCapacidad(){
        return capacidad;
    }


}
