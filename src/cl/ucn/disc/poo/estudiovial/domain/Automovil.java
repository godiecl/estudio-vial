// (c) 2026 POO, UCN, Antofagasta, Chile.
package cl.ucn.disc.poo.estudiovial.domain;

/**
 * The Vehicle class.
 *
 * @author Diego Urrutia-Astorga.
 */
public class Automovil {

    private String placaPatente;

    private String marca;

    private String modelo;

    private double capacidadEstanque;

    private double rendimientoCombustible;

    private Conductor conductorActual;

    /**
     * The constructor of the class.
     *
     * @param placaPatente
     * @param marca
     * @param modelo
     * @param capacidadEstanque
     * @param rendimientoCombustible
     */
    public Automovil(String placaPatente,
                     String marca,
                     String modelo,
                     double capacidadEstanque,
                     double rendimientoCombustible) {
        this(placaPatente, marca, modelo, capacidadEstanque, rendimientoCombustible, null);
    }

    /**
     * The constructor of the class.
     *
     * @param placaPatente
     * @param marca
     * @param modelo
     * @param capacidadEstanque
     * @param rendimientoCombustible
     * @param conductorActual
     */
    public Automovil(String placaPatente,
                     String marca,
                     String modelo,
                     double capacidadEstanque,
                     double rendimientoCombustible,
                     Conductor conductorActual) {
        // TODO: coding the validations!
        this.placaPatente = placaPatente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadEstanque = capacidadEstanque;
        this.rendimientoCombustible = rendimientoCombustible;
        this.conductorActual = conductorActual;
    }

    public String getPlacaPatente() {
        return this.placaPatente;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getCapacidadEstanque() {
        return this.capacidadEstanque;
    }

    public double getRendimientoCombustible() {
        return this.rendimientoCombustible;
    }

    public Conductor getConductorActual() {
        return this.conductorActual;
    }
}
