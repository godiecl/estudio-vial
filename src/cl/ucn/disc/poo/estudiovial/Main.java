package cl.ucn.disc.poo.estudiovial;

import cl.ucn.disc.poo.estudiovial.domain.Automovil;
import cl.ucn.disc.poo.estudiovial.domain.Conductor;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<Automovil> filtrarVehiculosConductores30a40Anios(
            Set<Automovil> automoviles) {

        // Bolsa donde estaran los Autos que su conductor
        // tiene entre 30 y 40 anios
        Set<Automovil> resultado = new HashSet<>();

        // Recorrer la bolsa de los automoviles
        for (Automovil automovil : automoviles) {
            // Si el auto existe ..
            if (automovil != null) {

                // .. y tiene conductor actual
                if (automovil.getConductorActual() != null) {

                    // .. y la edad del conductor esta entre 30 y 40 anios
                    Conductor conductor = automovil.getConductorActual();
                    if (conductor.getEdad() >= 30 &&
                        conductor.getEdad() <= 40) {
                        // agregamos el conductor al resultado!
                        resultado.add(automovil);

                    }
                }
            }
        }
        return resultado;
    }

}
