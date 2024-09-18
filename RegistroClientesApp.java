package evidencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroClientesApp {
	 private static List<Cliente> clientes = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("=== MENÚ ===");
	            System.out.println("1. Registrar Cliente");
	            System.out.println("2. Mostrar Clientes");
	            System.out.println("3. Salir");
	            System.out.print("Seleccione una opción: ");

	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Consumir la nueva línea

	            switch (opcion) {
	                case 1:
	                    registrarCliente();
	                    break;
	                case 2:
	                    mostrarClientes();
	                    break;
	                case 3:
	                    exit = true;
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }
	        }
	    }

	    private static void registrarCliente() {
	        System.out.println("=== Registrar Cliente ===");

	        System.out.print("Nombre: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Apellido: ");
	        String apellido = scanner.nextLine();

	        System.out.print("Teléfono: ");
	        String telefono = scanner.nextLine();

	        System.out.print("Email: ");
	        String email = scanner.nextLine();

	        System.out.print("Dirección: ");
	        String direccion = scanner.nextLine();

	        System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
	        String fechaNacimiento = scanner.nextLine();

	        System.out.print("Usuario: ");
	        String usuario = scanner.nextLine();

	        System.out.print("Contraseña: ");
	        String contrasena = scanner.nextLine();

	        System.out.print("Identificación: ");
	        String identificacion = scanner.nextLine();

	        Cliente cliente = new Cliente(nombre, apellido, telefono, email, direccion, fechaNacimiento, usuario, contrasena, identificacion);
	        clientes.add(cliente);

	        System.out.println("Cliente registrado exitosamente.");
	    }

	    private static void mostrarClientes() {
	        System.out.println("=== Lista de Clientes ===");

	        if (clientes.isEmpty()) {
	            System.out.println("No hay clientes registrados.");
	        } else {
	            for (Cliente cliente : clientes) {
	                System.out.println(cliente);
	            }
	        }
	    }
	}


