package Interface;

import Modelo.Ciudad;

public interface IArista {

    public  Ciudad getDestino();

    public void setDestino(Ciudad destino);

    public int getCosto();

    public void setCosto(int costo);
}
