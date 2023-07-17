import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean romper = false;

        while(!romper){
            System.out.println("Bienvenido al sistema");
            System.out.println("A continuacion se le mostrara una lista con las opciones a escoger:");
            System.out.println("1.Crear un Sistema de Archivos" );
            System.out.println("2.Crear una Unidad en el Sistema");
            System.out.println("3.Registrar un Usuario en el Sistema" );
            System.out.println("4.Iniciar Sesion en el Sistema");
            System.out.println("5.Cerrar Sesion");
            System.out.println("6.Fijar Unidad");
            System.out.println("7.Crear directorio");
            System.out.println("8.Cambiar de directorio");
            System.out.println("9.Añadir archivoo");
            System.out.println("11.Eliminar archivo");
            System.out.println("12.Copiar archivo");
            System.out.println("13.mover archivo");
            System.out.println("14.Renombrar archivo o carpeta");
            System.out.println("15.Listar contenido de directorio o ruta");
            System.out.println("16.Formatear unidad");
            System.out.println("17.Encriptar archivo");
            System.out.println("18.Desencriptar archivo");
            System.out.println("19.Buscar en archivo o ruta");
            System.out.println("20.Restaurar contenido");
            System.out.println("21.Cerrar programa");

            System.out.println("Ingrese el numero correspondiente a la opcion y pulse Enter para confirmar");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre que tendra el Sistema de Archivos:");
                String nombreSistema = scanner.nextLine();
                FileSystem fileSystem = new FileSystem(nombreSistema);
                System.out.println("Se ha creado el sistema " + fileSystem.getNombre());
                System.out.println("Fecha de creacion" + fileSystem.getFecha());
            }
            else if (opcion == 2){

            }
            else if (opcion == 3){

            }
            else if (opcion == 4){

            }
            else if (opcion == 5){

            }
            else if (opcion == 6){

            }
            else if (opcion == 7){

            }
            else if (opcion == 8){

            }
            else {
                System.out.println("Final de programa");
                romper = true;
            }
        }
    }
}
