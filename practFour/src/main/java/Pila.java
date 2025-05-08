package main;

public interface Pila<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
}
