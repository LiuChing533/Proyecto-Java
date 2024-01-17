package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public class Scooter extends Transporte {
    
    // Atributo de la clase Scooter
    private String color;       // El color del Scooter
    
    // Constructor de la clase Scooter
    public Scooter(String codigo, String tipo, int tarifaBase, String color) {
        
        super(codigo, tipo, tarifaBase);      // Se traen los valores de la clase padre
        this.color = color;             // Asigna el color proporcionado al atributo "color"
    }
    
    // Constructores de la clase Scooter Vacios
    public Scooter() {
        super();
        this.color = "";    // Se le asigna una cadena vacia a color
    }

    @Override       // Indica que el método que lo precede está sobrescribiendo el método de la superclase Transporte.
    public double CalcularMonto(int distancia) {    // Se crea la funcion para calcular el monto dependiendo de la distancia.
        tarifaBase = 2000;      // TarifaBase inicializada en 2000 colones
        double porcentaje;
        if(distancia <= 1000) {
            porcentaje = 0.40;
        } else if(distancia <= 2000) {
            porcentaje = 0.30;
        } else if(distancia <= 3000) {
            porcentaje = 0.25;
        } else {
            porcentaje = 0.15;
        }
        double monto = tarifaBase + (tarifaBase * porcentaje); // Se utiliza la formula dada para el calculo.
        return monto;
    }
    
    // Metodos Set / Get
    public String getColor() {                   // Se asigna el get para el color
        return color;
    }

    public void setColor(String color) {        // Se asigna el set para el color
        this.color = color;
    }
}