import java.util.Scanner;
import java.util.Date;

//Clase Main
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        int subEleccion = 0;
        System_207114979_HernandezHernandez sistemaArchivos = null;
        String nombreSistema = null;


        do {
            mostrarMenu();
            eleccion = scanner.nextInt();
            //Iteracion dependiendo de la opcion que escoja el usuario
            if(eleccion == 1 && sistemaArchivos != null){
                System.out.println("Ya existe un sistema creado");
            }
            if(eleccion == 1 && sistemaArchivos == null){
                System.out.println("Ingrese el nombre que desea que tenga el sistema:");
                scanner.nextLine();
                sistemaArchivos = new TDAFilesystemImp_207114979_HernandezHernandez(nombreSistema);
                nombreSistema = scanner.nextLine();
                sistemaArchivos.crearSistemaArchivos(nombreSistema);
                sistemaArchivos.operarSistemaArchivos();
                Date fechaCreacion = sistemaArchivos.getFechaCreacion();
                System.out.println("Se ha creado el sistema " + nombreSistema + " con fecha de creación " + fechaCreacion);
            }
            else if(eleccion ==2 && sistemaArchivos == null){
                System.out.println("Primero debe tener un sistema creado");
            }
            else if(eleccion == 2 && sistemaArchivos != null){
                do {
                    mostrarSubMenu();
                    subEleccion = scanner.nextInt();
                    //Iteracion dependiendo de la opcion que escoja el usuario
                    switch(subEleccion){
                        case 1:
                            System.out.println("Ingrese la letra de la unidad, esta debe ser única:");
                            scanner.nextLine();
                            String letter = scanner.nextLine();
                            System.out.println("Ingrese el nombre de la unidad:");
                            String nombre = scanner.nextLine();
                            System.out.println("Ingrese la capacidad de almacenamiento de la unidad:");
                            int capacidad = scanner.nextInt();
                            sistemaArchivos.agregarUnidad(letter, nombre, capacidad);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del usuario a registrar:");
                            scanner.nextLine();
                            String nombreUsuario = scanner.nextLine();
                            sistemaArchivos.registroUsuario(nombreUsuario);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del usuario a logear:");
                            scanner.nextLine();
                            String usuarioALogear = scanner.nextLine();
                            sistemaArchivos.iniciarSesion(usuarioALogear);
                            break;
                        case 4:
                            sistemaArchivos.cerrarSesion();
                            break;
                        case 5:
                            System.out.println("Ingrese la letra de la unidad que se realizarán acciones:");
                            scanner.nextLine();
                            String letraUnidad = scanner.nextLine();
                            sistemaArchivos.unidadFijada(letraUnidad);
                            break;
                        case 6:
                            System.out.println("Ingrese el nombre de la carpeta");
                            scanner.nextLine();
                            String nombreCarpeta = scanner.nextLine();
                            sistemaArchivos.hacerDirectorio(nombreCarpeta);
                            break;
                        case 7:
                            System.out.println("Ingrese el directorio para realizar acciones");
                            scanner.nextLine();
                            String directorio = scanner.nextLine();
                            break;
                        case 8:
                            System.out.println("Ingrese el nombre del archivo");
                            scanner.nextLine();
                            String archivo = scanner.nextLine();
                            System.out.println("Ingrese el formato del archivo");
                            String formato = scanner.nextLine();
                            System.out.println("Ingrese el contenido del archivo");
                            String contenido = scanner.nextLine();
                            break;
                        case 9:
                            System.out.println("Ingrese el nombre del archivo o carpeta a eliminar");
                            scanner.nextLine();
                            String deletear = scanner.nextLine();
                            break;
                        case 10:
                            System.out.println("Ingrese el nombre del archivo o carpeta que desea copiar");
                            scanner.nextLine();
                            String copiado = scanner.nextLine();
                            System.out.println("Ingrese el directorio donde desee almacenar el archivo o carpeta");
                            String nuevoDirectorio = scanner.nextLine();
                            break;
                        case 11:
                            System.out.println("Ingrese el nombre del archivo o carpeta que desea mover");
                            scanner.nextLine();
                            String movido = scanner.nextLine();
                            System.out.println("Ingrese el directorio donde desee almacenar el archivo o carpeta");
                            String nuevoDirectorioMovido = scanner.nextLine();
                            break;
                        case 12:
                            System.out.println("Ingrese el nombre del archivo o carpeta que desea renombrar");
                            scanner.nextLine();
                            String renombrar = scanner.nextLine();
                            System.out.println("Ingrese su nuevo nombre");
                            String renombrado = scanner.nextLine();
                            break;
                        case 13:
                            System.out.println("Ingrese el contenido que desee listar");
                            scanner.nextLine();
                            String listado = scanner.nextLine();
                            break;
                        case 14:
                            System.out.println("Ingrese la letra del disco que desea formatear");
                            scanner.nextLine();
                            String formateo = scanner.nextLine();
                            System.out.println("Ingrese su nuevo nombre");
                            String nombreFormateo = scanner.nextLine();
                            break;
                        case 15:
                            System.out.println("Ingrese la clave para desencriptar el archivo o carpeta");
                            scanner.nextLine();
                            String encriptado = scanner.nextLine();
                            System.out.println("Ingrese el nombre del archivo o carpeta que desea encriptar");
                            String nombreEncriptado = scanner.nextLine();
                            break;
                        case 16:
                            System.out.println("Ingrese la clave para desencriptar el archivo o carpeta");
                            scanner.nextLine();
                            String desencriptado = scanner.nextLine();
                            System.out.println("Ingrese el nombre del archivo o carpeta que desea desencriptar");
                            String nombreDesencriptado = scanner.nextLine();
                            break;
                        case 17:
                            System.out.println("Ingrese el contenido a buscar");
                            scanner.nextLine();
                            String buscar = scanner.nextLine();
                            System.out.println("Ingrese el archivo o carpeta en la que deseas buscar");
                            String nombreBuscar = scanner.nextLine();
                            break;
                        case 18:
                            System.out.println("Este es el contenido de la papelera");
                            break;
                        case 19:
                            System.out.println("Ingrese el nombre de la carpeta o archivo que se desea recuperar");
                            scanner.nextLine();
                            String restaurar = scanner.nextLine();
                            break;
                        case 20:
                            break;
                        default:
                            System.out.println("Opción inválida. Vuelva a intentarlo");
                    }
                }
                while (subEleccion!=20);
            }
            else if(eleccion == 3 && sistemaArchivos != null){
                System.out.println("-------------------------");
                System.out.println("    Datos del sistema");
                System.out.println("Nombre del sistema: " + nombreSistema);
                sistemaArchivos.verSistemaCompleto();


            }
            opcionEscogida(eleccion);
        }
        while (eleccion != 4);
        scanner.close();
    }
    //Imprimir el menu por pantalla
    public static void mostrarMenu(){
        System.out.println("--------------------------");
        System.out.println("*****Menú Interactivo*****");
        System.out.println("Escoja una de las opciones:\n");
        System.out.println("1.Crear un Sistema de Archivos");
        System.out.println("2.Modificar un Sistema de Archivos");
        System.out.println("3.Visualizar Sistema de Archivos");
        System.out.println("4.Cerrar el programa");
        System.out.println("--------------------------");
    }
    //Imprimir el submenu por pantalla
    public static void mostrarSubMenu(){
        System.out.println("---------------------------");
        System.out.println("Escoja una de las opciones:\n");
        System.out.println("1.Añadir una unidad al sistema");
        System.out.println("2.Registrar un usuario en el sistema");
        System.out.println("3.Iniciar sesión con un usuario existente en el sistema");
        System.out.println("4.Cerrar sesión del usuario");
        System.out.println("5.Escoger unidad en la que se realizarán operaciones");
        System.out.println("6.Crear una carpeta");
        System.out.println("7.Cambiar directorio para realizar operaciones");
        System.out.println("8.Agrega un archivo");
        System.out.println("9.Elimina un archivo o carpeta");
        System.out.println("10.Copia un archivo");
        System.out.println("11.Mueve un archivo");
        System.out.println("12.Renombra un archivo");
        System.out.println("13.Lista contenido de un directorio o ruta");
        System.out.println("14.Formatea una unidad");
        System.out.println("15.Encripta un archivo o carpeta");
        System.out.println("16.Desencripta un archivo o carpeta");
        System.out.println("17.Buscar dentro de un archivo o de una ruta");
        System.out.println("18.Mostrar contenido de la papelera de reciclaje");
        System.out.println("19.Restaurar una carpeta o archivo de la papelera de reciclaje");
        System.out.println("20.Volver al menú principal");
        System.out.println("---------------------------");
    }

    //Permite que el primer menu tenga opciones
    public static void opcionEscogida(int eleccion){
        switch(eleccion){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Opción inválida. Vuelva a intentarlo");
        }
        System.out.println();
    }
}
