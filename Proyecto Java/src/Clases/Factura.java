package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public class Factura {
    
    // Atributos de la clase Factura
    private String IDFactura;           // El ID de las Facturas
    private String IDCliente;            // El ID del cliente
    private String NombreCliente;       // El nombre del cliente
    private String CodigoTransporte;    // El codigo del transporte utilizado
    private int Distancia;              // La distancia que recorrio en total en el transporte
    private double Monto;               // El valor del monto total que debe pagar
    private String fecha;            // La fecha en la que se alquilo el transporte
    
    // Constructor de la clase Factura
    public Factura(String IDFactura, String IDCliente, String NombreCliente, String CodigoTransporte, int Distancia, String fecha, double Monto) {
        
        this.IDFactura = IDFactura;                 // Asigna el ID de la factura proporcionado al atributo "IDFactura"
        this.IDCliente = IDCliente;                 // Asigna el ID del cliente proporcionado al atributo "IDClient"
        this.NombreCliente = NombreCliente;         // Asgina el Nombre del cliente proporcionado al atributo "NombreCliente"
        this.CodigoTransporte = CodigoTransporte;   // Asgina el Codigo del transporte proporcionado al atributo "CodigoTransporte"
        this.Distancia = Distancia;                 // Asgina la distancia proporcionada al atributo "Distancia"
        this.Monto = Monto;                         // Asgina el monto proporcionado al atributo "Monto"
        this.fecha = fecha;                         // Asigna la fecha proporcionada al atributo "fecha"
    }
    
    // Constructores de la clase Factura Vacios
    public Factura() {
        this.IDFactura = "";                 // Al ID de la factura se le asigna una cadena vacia
        this.IDCliente = "";                 // Al ID del cliente se le asigna una cadena vacia
        this.NombreCliente = "";             // Al nombre del cliente se le asigna una cadena vacia
        this.CodigoTransporte = "";          // Al codigo del transporte se le asigna una cadena vacia
        this.Distancia = 0;                  // A la distancia se le inicializa en 0
        this.Monto = 0;                      // Al monto se le inicializa en 0
        this.fecha = "";             // A la fecha se le asigna una fecha nueva para inicializarla
    }

    @Override   // Para poder usarlo en IngresarFactura
    public String toString() {
        return IDFactura + "," + NombreCliente + "," + IDCliente + "," + CodigoTransporte + "," + fecha + "," + Distancia + "," + Monto;
    }
    
    // Metodos Set / Get
    public String getIDFactura() {                                  // Se asigna el get para el ID de la factura
        return IDFactura;
    }

    public void setIDFactura(String IDFactura) {                    // Se asigna el set para el ID de la factura
        this.IDFactura = IDFactura;
    }

    public String getIDCliente() {                                  // Se asigna el get para el ID del cliente
        return IDCliente;
    }

    public void setIDCliente(String IDCliente) {                    // Se asigna el set para el ID del cliente
        this.IDCliente = IDCliente;
    }

    public String getNombreCliente() {                              // Se asigna el get para el nombre del cliente
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {            // Se asigna el set para el nombre del cliente
        this.NombreCliente = NombreCliente;
    }

    public String getCodigoTransporte() {                           // Se asigna el get para el codigo del transporte
        return CodigoTransporte;
    }

    public void setCodigoTransporte(String CodigoTransporte) {      // Se asigna el set para el codigo del transporte
        this.CodigoTransporte = CodigoTransporte;
    }

    public int getDistancia() {                                     // Se asigna el get para la distancia
        return Distancia;
    }

    public void setDistancia(int Distancia) {                       // Se asigna el set para la distancia
        this.Distancia = Distancia;
    }

    public double getMonto() {                                      // Se asigna el get para el monto
        return Monto;
    }

    public void setMonto(double Monto) {                            // Se asigna el set para el monto
        this.Monto = Monto;
    }
    
    public String getFecha() {                                      // Se asigna el get para la fecha
        return fecha;
    }

    public void setFecha(String fecha) {                            // Se asigna el set para la fecha
        this.fecha = fecha;
    }
}