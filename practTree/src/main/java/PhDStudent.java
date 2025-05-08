
public class PhDStudent extends Student {

    private int carrerasAprobadas;

    public PhDStudent(int mat, String name, String age, int matA) {
        super(mat, name, age);
        this.carrerasAprobadas = mat;
    }
    public int getcarrerasAprobadas(){
        return carrerasAprobadas;
    }
}
