
public class practTreeMain {

    public static void main(String[] args) {
        String name = "Lucas";
        String age = "21";
        int intTest = 20;

        Person persona = new Person(name, age);
        System.out.println("Persona Creada! \n \n");

        Teacher teacher = new Teacher(intTest, name, age);
        System.out.println("Teacher Creado! \n \n");

        Student student = new Student(intTest, name, age);
        System.out.println("Student Creado! \n \n");

        PhDStudent phStudent = new PhDStudent(intTest, name, age, intTest);
        System.out.println("Student PH Creado! \n \n");

        Person p1 = new Student(5, "Ana", "22");
        Person p2 = new PhDStudent(5, "Pablo", "27", 10);

        Student s1 = new PhDStudent(4, "Mario", "30", 12);


    }
}
