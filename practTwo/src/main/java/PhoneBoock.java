
import java.util.HashMap;

public class PhoneBoock {

    HashMap<String, String> Boock = new HashMap<>();

    public PhoneBoock() {
        System.out.println("¡New a Phone Boock Created!");
    }

    public void addEntry(String nombres, String telefonos) {
        Boock.put(nombres, telefonos);
    }

    public void changePhone(String nombres, String nuevoTelefono) {
        Boock.put(nombres, nuevoTelefono);
    }

    public void delContact(String nombres) {
        Boock.remove(nombres);
    }

    public void lookupNumber(String nombres) {
        System.out.println("El Telefono de " + nombres + "es : " + Boock.get(nombres));
    }

    public void getAllCotacts() {
        System.out.println(Boock);
    }
}
