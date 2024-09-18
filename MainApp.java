package evidencia;


public class MainApp {
    public static void main(String[] args) {
        // Crear una instancia de Cliente
        Cliente cliente = new Cliente(
            "Juan", "Pérez", "555-1234", "juan.perez@example.com", 
            "Calle Falsa 123", "1990-01-01", "juanp", "password123", "123456789"
        );

        // Mostrar los detalles del cliente
        System.out.println(cliente.toString());
    }
}

