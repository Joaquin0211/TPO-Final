package Modelo;

import java.util.*;

public class Dijkstra {
    public static Map<Ciudad, Integer> calcularCaminos(Grafo grafo, Ciudad origen) {
        Map<Ciudad, Integer> distancias = new HashMap<>();
        PriorityQueue<Distancia> cola = new PriorityQueue<>(Comparator.comparingInt(Distancia::getDistancia));
        Set<Ciudad> visitados = new HashSet<>();

        for (Ciudad c : grafo.obtenerCiudades()) {
            distancias.put(c, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);
        cola.add(new Distancia(origen, 0));

        while (!cola.isEmpty()) {
            Distancia actual = cola.poll();
            Ciudad ciudadActual = actual.getCiudad();

            if (visitados.contains(ciudadActual)) continue;
            visitados.add(ciudadActual);

            for (Arista arista : grafo.obtenerAdyacentes(ciudadActual)) {
                Ciudad destino = arista.getDestino();
                int nuevoCosto = distancias.get(ciudadActual) + arista.getCosto();
                if (nuevoCosto < distancias.get(destino)) {
                    distancias.put(destino, nuevoCosto);
                    cola.add(new Distancia(destino, nuevoCosto));
                }
            }
        }

        return distancias;
    }
}

