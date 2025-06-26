package Modelo;

import java.util.*;

public class Grafo {
    private Map<Ciudad, List<Arista>> adyacencia = new HashMap<>();

    public void agregarCiudad(Ciudad ciudad) {
        adyacencia.putIfAbsent(ciudad, new ArrayList<>());
    }

    public void conectarCiudades(Ciudad origen, Ciudad destino, int costo) {
        adyacencia.get(origen).add(new Arista(destino, costo));
    }

    public List<Arista> obtenerAdyacentes(Ciudad ciudad) {
        return adyacencia.getOrDefault(ciudad, new ArrayList<>());
    }

    public Set<Ciudad> obtenerCiudades() {
        return adyacencia.keySet();
    }

    public Map<Ciudad, List<Arista>> getAdyacencia() {
        return adyacencia;
    }

    public void setAdyacencia(Map<Ciudad, List<Arista>> adyacencia) {
        this.adyacencia = adyacencia;
    }
}

