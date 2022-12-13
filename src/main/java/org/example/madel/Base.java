package org.example.madel;

public abstract class Base {
    protected  int id;
    private static int idGen=0;

    public Base() {
        this.id = ++idGen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
