package Interface;

import Modelo.Ciudad;

public interface ICiudad {

    public String getNombre();

    public void setNombre(String nombre);


    public String toString();


    public boolean equals(Object obj);

    public int hashCode();

}
