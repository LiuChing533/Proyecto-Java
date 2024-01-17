package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public class Bicicleta extends Transporte {
    
    // Atributo de la clase Bicicleta
    private int cantidadCambios;        // La cantidad de cambios de la bicicleta.
    
    // Constructor de la clase Bicicleta
    public Bicicleta(String codigo, String tipo, int tarifaBase, int cantidadCambios) {
        
        super(codigo, tipo, tarifaBase);                  // Se traen los valores de la clase padre
        this.cantidadCambios = cantidadCambios;     // Asigna la cantidad de cambios proporcionados al atributo "cantidadCambios"
    }
    
    // Constructores de la clase Bicicleta Vacios
    public Bicicleta() {
        super();
        this.cantidadCambios = 0;       // Se inician la cantidad de cambios en 0
    }
    
    @Override       // Indica que el método que lo precede está sobrescribiendo el método de la superclase Transporte.
    public double CalcularMonto(int distancia) {  // Se crea la funcion para calcular el monto dependiendo de la distancia.
        tarifaBase = 3000;  // TarifaBase inicializada en 3000 colones
        double porcentaje;
        if(distancia <= 1000) {
            porcentaje = 0.50;
        } else if(distancia <= 2000) {
            porcentaje = 0.35;
        } else if(distancia <= 3000) {
            porcentaje = 0.20;
        } else {
            porcentaje = 0.10;
        }
        double monto = tarifaBase + (tarifaBase * porcentaje); // Se utiliza la formula dada para el calculo.
        return monto;
    }
    
    // Metodos Set / Get
    public int getCantidadCambios() {                       // Se asigna el get para la cantidad de cambios
        return cantidadCambios;
    }

    public void setCantidadCambios(int cantidadCambios) {  // Se asigna el set para la cantidad de cambios
        this.cantidadCambios = cantidadCambios;
    }
}