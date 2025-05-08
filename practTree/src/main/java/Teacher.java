
public class Teacher extends Person {

    private int canClasses;

    public Teacher(int cant, String name, String age) {
        super(name, age);
        this.canClasses = cant;
    }

    public int getClasses() {
        return canClasses;
    }
}
