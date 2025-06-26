package Modelo;

public class Arista {
    private Ciudad destino;
    private int costo;

    public Arista(Ciudad destino, int costo) {
        this.destino = destino;
        this.costo = costo;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}

