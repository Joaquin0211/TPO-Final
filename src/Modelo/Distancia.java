package Modelo;

public class Distancia {
    private Ciudad ciudad;
    private int distancia;

    public Distancia(Ciudad ciudad, int distancia) {
        this.ciudad = ciudad;
        this.distancia = distancia;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}

