package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public class Cliente {
    
    // Atributos de la clase Cliente
    private String nombre;      // El nombre del cliente
    private String ID;          // El ID del cliente
    private String direccion;   // La direccion resumida del cliente
    private int edad;           // La edad del cliente
    
    private static Cliente clienteActual; // Para poder consultarlo a la hora de ingresar Factura
    
    // Constructor de la clase Cliente
    public Cliente(String nombre, String ID, String direccion, int edad) {
        
        this.nombre = nombre;           //Asigna el nombre proporcionado al atributo "nombre" 
        this.setID(ID);                 //Asigna el ID proporcionado al atributo "ID" 
        this.setDireccion(direccion);   //Asigna la direccion proporcionada al atributo "direccion" 
        this.edad = edad;               //Asigna la edad proporcionada al atributo "edad" 
        Cliente.clienteActual = this;  // Asigna al cliente actual proporcionado al atriburo "clienteActual"
    }
    
    // Constructores de la clase Cliente Vacios
    public Cliente() {
        this.nombre = "";       // Al nombre se le asigna una cadena vacia
        this.ID = "";           // Al ID se le asigna una cadena vacia
        this.direccion = "";    // A la direccion se le asigna una cadena vacia
        this.edad = 0;          // A la edad se le asigna un 0 para inicializarla
    }
    
    // Metodo estatico para obtener el cliente actual
    public static Cliente getClienteActual() {
        return clienteActual;
    }

    public static void setClienteActual(Cliente cliente) {
        Cliente.clienteActual = cliente;
    }
    
    // Metodos Set / Get para los atributos de la clase Cliente
    public String getNombre() {                     // Se asigna el get para el nombre
        return nombre;
    }

    public void setNombre(String nombre) {          // Se asigna el set para el nombre
        this.nombre = nombre;
    }

    public String getId() {                         // Se asigna el get para el ID
        return ID;
    }

    public void setID(String ID) {                  // Se asigna el set para el ID
        this.ID = ID;
    }

    public String getDireccion() {                  // Se asigna el get para la direccion
        return direccion;
    }

    public void setDireccion(String direccion) {    // Se asigna el set para la direccion
        this.direccion = direccion;
    }

    public int getEdad() {                          // Se asigna el get para la edad
        return edad;
    }

    public void setEdad(int edad) {                 // Se asigna el set para la edad
        this.edad = edad;
    }

}