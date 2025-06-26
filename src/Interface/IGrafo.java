package Interface;

import Modelo.Arista;
import Modelo.Ciudad;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IGrafo {

    public void agregarCiudad(Ciudad ciudad);

    public void conectarCiudades(Ciudad origen, Ciudad destino, int costo);

    public List<Arista> obtenerAdyacentes(Ciudad ciudad);

    public Set<Ciudad> obtenerCiudades();

    public Map<Ciudad, List<Arista>> getAdyacencia();

    public void setAdyacencia(Map<Ciudad, List<Arista>> adyacencia);

}
