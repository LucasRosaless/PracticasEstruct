
public class practFourMain {

    public static void main(String[] args) {

        String cadenaString;
        cadenaString = "{([TEST]])}";

        System.out.println(estaBalanceado(cadenaString));

    }

    public static boolean estaBalanceado(String cadena) {

        MyPila<Character> Izq = new MyPila<>();
        MyPila<Character> Der = new MyPila<>();

        for (int i = 0; i < cadena.length(); i++) {

            char A = cadena.charAt(i);

            if (A == '(' || A == '['|| A == '{') {
                Izq.push(A);
            } else if (A == ')' || A == ']' || A == '}') {
                Der.push(A);
            }
        }

        if (Izq.elementSize() == Der.elementSize()) {
            return true;
        } else {
            return false;
        }
    }

}
