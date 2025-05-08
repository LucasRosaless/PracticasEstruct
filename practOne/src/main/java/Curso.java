
import java.util.ArrayList;

public class Curso {

    ArrayList<Estudiantes> Curso = new ArrayList<>();

    public Curso() {
        System.out.println("Curso Genreado Correctmente! ");
    }

    public void StudentAdd(String Nombre, String Age, String DNI) {
        Estudiantes Student = new Estudiantes(Nombre, Age, DNI);
        Curso.add(Student);
    }

    public String Seacrh(String NameS) {
        int cout = 0;
        boolean encotrado = false;

        for (Estudiantes m1 : Curso) {
            cout = cout + 1;
            if (m1.getName().equals(NameS)) {
                encotrado = true;
            }
        }

        if (encotrado) {
            return "Usurio " + NameS + " Encontrado ! Numero de ID " + cout;
        } else {
            return "Usurio " + NameS + " NO ENCONTRADO";
        }
    }

    public int sizeCurso() {
        return Curso.size();
    }

}
