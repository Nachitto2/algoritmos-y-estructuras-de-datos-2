package interfaces;

import java.util.List;

public interface INodo<T> {

    //Getters y setters
    public T getDato();
    public void setDato(T dato);


    public void agregarVecino(INodo<T> nodo);


    public boolean fueVisitado();
    public void marcarVisitado(boolean b);
}
