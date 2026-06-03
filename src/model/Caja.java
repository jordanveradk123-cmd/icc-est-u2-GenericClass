package model;

public class Caja <T> {
    private T t;

    public Caja() {

    }
    

    public Caja(T t) {
        this.t = t;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public boolean estaVacia() {
        return this.t == null;
    }
}
