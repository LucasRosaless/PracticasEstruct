import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void testAgregarYBuscarEstudiante() {
        Curso curso = new Curso();
        curso.StudentAdd("Lucas", "21", "12345678");

        String resultado = curso.Seacrh("Lucas");
        assertEquals("Usurio Lucas Encontrado ! Numero de ID 1", resultado);
        assertEquals(1, curso.sizeCurso());
    }

    @Test
    public void testBuscarEstudianteInexistente() {
        Curso curso = new Curso();
        String resultado = curso.Seacrh("Pedro");
        assertEquals("Usurio Pedro NO ENCONTRADO", resultado);
    }
}
