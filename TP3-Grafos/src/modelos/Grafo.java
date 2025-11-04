package modelos;

import interfaces.INodo;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<Nodo<T>> nodos;

    public Grafo(List<Nodo<T>> nodos) {
        this.nodos = new ArrayList<>();
    }

    public void agregarNodo(INodo<T> nodo) {
        nodos.add((Nodo<T>) nodo);
    }
}
