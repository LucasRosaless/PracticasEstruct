
public class Estudiantes {

    String Name;
    String Age;
    String DNI;

    public Estudiantes(String nombre, String edad, String deni) {
        this.Name = nombre;
        this.Age = edad;
        this.DNI = deni;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getDNI() {
        return DNI;
    }

}
