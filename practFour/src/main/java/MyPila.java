
import java.util.ArrayList;

import main.Pila; // <-- Asegurate de esto si están en paquetes separados

public class MyPila<T> implements Pila<T> {

    ArrayList<T> stock = new ArrayList<>();

    public MyPila() {
        System.out.println("Pila creada\n");
    }


    
    public void push(T element) {
        stock.add(0, element); // Agrega al tope (posición 0)
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stock.remove(0); // Quita y retorna el tope
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stock.get(0); // Muestra el tope sin quitar
    }

    public boolean isEmpty() {
        return stock.isEmpty();
    }

    public int elementSize() {
        return stock.size();
    }
}
