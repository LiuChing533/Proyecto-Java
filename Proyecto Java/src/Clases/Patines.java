package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public class Patines extends Transporte {
    
    // Atributo de la clase Patines
    private int cantidadRuedas;     // La cantidad de ruedas que tienen los patines
    
    // Constructor de la clase Patines
    public Patines(String codigo, String tipo, int tarifaBase, int cantidadRuedas) {
        
        super(codigo, tipo, tarifaBase);              // Se traen los valores de la clase padre
        this.cantidadRuedas = cantidadRuedas;   // Asigna la cantidad de ruedas proporcionada al atributo "cantidadRuedas"
    }
    
    // Constructores de la clase Patines Vacios
    public Patines() {
        super();
        this.cantidadRuedas = 0;    // Se le asignan 0 cantidad de ruedas para inicializarla
    }
    
    @Override           // Indica que el método que lo precede está sobrescribiendo el método de la superclase Transporte.
    public double CalcularMonto(int distancia) {    // Se crea la funcion para calcular el monto dependiendo de la distancia.
        tarifaBase = 1500;          // TarifaBase inicializada en 1500 colones
        double porcentaje;
        if(distancia <= 1000) {
            porcentaje = 0.20;
        } else if(distancia <= 2000) {
            porcentaje = 0.15;
        } else if(distancia <= 3000) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.05;
        }
        double monto = tarifaBase + (tarifaBase * porcentaje); // Se utiliza la formula dada para el calculo.
        return monto;
    }
    
    // Metodos Set / Get
    public int getCantidadRuedas() {                        // Se asigna el get para la cantidad de ruedas
        return cantidadRuedas;
    }
    
    public void setCantidadRuedas(int cantidadRuedas) {     // Se asigna el set para la cantidad de ruedas
        this.cantidadRuedas = cantidadRuedas;
    }
}