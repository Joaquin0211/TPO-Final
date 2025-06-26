package Test;

import Modelo.*;

import java.util.Map;

public class TestDijkstra {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        Ciudad a = new Ciudad("A");
        Ciudad b = new Ciudad("B");
        Ciudad c = new Ciudad("C");

        grafo.agregarCiudad(a);
        grafo.agregarCiudad(b);
        grafo.agregarCiudad(c);

        grafo.conectarCiudades(a, b, 4);
        grafo.conectarCiudades(a, c, 2);
        grafo.conectarCiudades(c, b, 1);

        Map<Ciudad, Integer> distancias = Dijkstra.calcularCaminos(grafo, a);

        assert distancias.get(b) == 3 : "Error: distancia de A a B debería ser 3";
        assert distancias.get(c) == 2 : "Error: distancia de A a C debería ser 2";

        System.out.println("TestDijkstra OK");
    }
}

