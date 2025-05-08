
public class practOneMain {

    public static void main(String[] args) {

        Curso NewsCurso = new Curso();

        NewsCurso.StudentAdd("Lucas", "21", "45015059");
        NewsCurso.StudentAdd("Joquin", "17", "49030110");
        NewsCurso.StudentAdd("Tizi", "11", "534554545");

        int sizes = NewsCurso.sizeCurso();
        System.err.println("La cantidad total es de:" + sizes);

        NewsCurso.Seacrh("Joquin");
        NewsCurso.Seacrh("Maxi");
    }
}
