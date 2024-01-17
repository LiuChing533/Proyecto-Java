package Clases;

/**
 *
 * @author Liu Ching Richard
 */
public abstract class Transporte {
    
    // Atributos de la clase Transporte
    protected String codigo;    // El codigo del transporte                                     // Se usa protected para que las clases hijas hereden estos atributos
    protected String tipo;      // El tipo de transporte ya sea normal o electrico
    protected int tarifaBase;   // La tarifa base que tendra el transporte
    
    // Constructor de la clase Transporte
    public Transporte(String codigo, String tipo, int tarifaBase) {
        
        this.codigo = codigo;           // Asigna el codigo proporcionado al atributo "codigo"
        this.tipo = tipo;               // Asigna el tipo de transporte proporcionado al atributo "tipo"
        this.tarifaBase = tarifaBase;   // Asigna la tarifa base proporcionada al atributo "tarifaBase"
    }
    
    // Constructores de la clase Transporte Vacios
    public Transporte() {
        this.codigo = "";       // El codigo se le asigna una cadena vacia
        this.tipo = "";         // El tipo se le asigna una cadena vacia
        this.tarifaBase = 0;    // A la tarifa base se le asigna un numero en este caso 0
    }

    public abstract double CalcularMonto(int distancia);  //Calcular el monto a pagar basado en la distancia proporcionada.
    
    // Metodos Set / Get
    public String getCodigo() {                         // Se asigna el get para el codigo
        return codigo;
    }

    public void setCodigo(String codigo) {              // Se le asigna el set para el codigo
        this.codigo = codigo;
    }

    public String getTipo() {                           // Se asigna el get para el tipo
        return tipo;
    }

    public void setTipo(String tipo) {                  // Se le asigna el set para el tipo
        this.tipo = tipo;
    }

    public int getTarifaBase() {                        // Se asigna el get para la tarifa base
        return tarifaBase;
    }

    public void setTarifaBase(int tarifaBase) {         // Se le asigna el set para la tarifa base
        this.tarifaBase = tarifaBase;
    }
}
