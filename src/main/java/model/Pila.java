package model;

import java.util.ArrayList;

public class Pila <T>{
    private final ArrayList<T> lista;

    public Pila(){
        lista = new ArrayList<>();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public void add(T element){
        lista.add(element);
    }

    public T peek() throws PilaException{
        try {
            return lista.get(lista.size() -1);
        } catch (Exception e){
            throw  new PilaException();
        }

    }

    public T pop() throws PilaException {
        if(lista.isEmpty()) throw new PilaException();
        return lista.remove(lista.size()-1);
    }
}
