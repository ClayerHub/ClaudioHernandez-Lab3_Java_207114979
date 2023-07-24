import java.util.Scanner;
import java.util.Date;

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
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        case 14:
                            break;
                        case 15:
                            break;
                        case 16:
                            break;
                        case 17:
                            break;
                        case 18:
                            break;
                        case 19:
                            break;
                        case 20:
                            break;
                        case 21:
                            break;
                        case 22:
                            break;
                        case 23:
                            break;
                        default:
                            System.out.println("Opción inválida. Vuelva a intentarlo");
                    }
                }
                while (subEleccion!=24);
            }
            else if(eleccion == 3 && sistemaArchivos != null){

            }
            opcionEscogida(eleccion);
        }
        while (eleccion != 4);
        scanner.close();
    }
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
    public static void mostrarSubMenu(){
        System.out.println("---------------------------");
        System.out.println("Escoja una de las opciones:\n");
        System.out.println("1.Añadir una unidad al sistema");
        System.out.println("2.Registrar un usuario en el sistema");
        System.out.println("3.Iniciar sesión con un usuario existente en el sistema");
        System.out.println("4.Cerrar sesión del usuario");
        System.out.println("5.Añadir una unidad al sistema");
        System.out.println("6.Registrar un usuario en el sistema");
        System.out.println("7.Iniciar sesión con un usuario existente en el sistema");
        System.out.println("8.Cerrar sesión del usuario");
        System.out.println("9.Escoger unidad en la que se realizarán operaciones");
        System.out.println("10.Crear una carpeta");
        System.out.println("11.Cambiar directorio para realizar operaciones");
        System.out.println("12.Agrega un archivo");
        System.out.println("13.Elimina un archivo o carpeta");
        System.out.println("14.Copia un archivo");
        System.out.println("15.Mueve un archivo");
        System.out.println("16.Renombra un archivo");
        System.out.println("17.Lista contenido de un directorio o ruta");
        System.out.println("18.Formatea una unidad");
        System.out.println("19.Encripta un archivo o carpeta");
        System.out.println("20.Desencripta un archivo o carpeta");
        System.out.println("21.Buscar dentro de un archivo o de una ruta");
        System.out.println("22.Mostrar contenido de la papelera de reciclaje");
        System.out.println("23.Restaurar una carpeta o archivo de la papelera de reciclaje");
        System.out.println("24.Volver al menú principal");
        System.out.println("---------------------------");
    }

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
