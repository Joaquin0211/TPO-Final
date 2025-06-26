//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Modelo.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        Ciudad a = new Ciudad("Buenos Aires");
        Ciudad b = new Ciudad("Rosario");
        Ciudad c = new Ciudad("Córdoba");
        Ciudad d = new Ciudad("Mendoza");

        grafo.agregarCiudad(a);
        grafo.agregarCiudad(b);
        grafo.agregarCiudad(c);
        grafo.agregarCiudad(d);

        grafo.conectarCiudades(a, b, 3);
        grafo.conectarCiudades(a, c, 6);
        grafo.conectarCiudades(b, c, 2);
        grafo.conectarCiudades(b, d, 8);
        grafo.conectarCiudades(c, d, 5);

        Map<Ciudad, Integer> distancias = Dijkstra.calcularCaminos(grafo, a);

        for (Map.Entry<Ciudad, Integer> entry : distancias.entrySet()) {
            System.out.println("Costo mínimo de " + a.getNombre() + " a " + entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }
}
