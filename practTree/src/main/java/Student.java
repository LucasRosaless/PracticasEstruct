
public class Student extends Person {

    private int matAprobadas;

    public Student(int mat, String name, String age) {
        super(name, age);
        this.matAprobadas = mat;
    }

    public int getmatAprobadas() {
        return matAprobadas;
    }
}
