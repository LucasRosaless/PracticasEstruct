import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PhoneBoockTest {

    @Test
    public void testAgregarYBuscarContacto() {
        PhoneBoock PhoneBoock = new PhoneBoock();
        PhoneBoock.addEntry("Lucas", "358");

        assertEquals("358", PhoneBoock.lookupNumber("Lucas"));
        assertTrue(PhoneBoock.contieneContacto("Lucas"));
    }

    @Test
    public void testModificarTelefono() {
        PhoneBoock PhoneBoock = new PhoneBoock();
        PhoneBoock.addEntry("Lucas", "358");
        PhoneBoock.changePhone("Lucas", "999");

        assertEquals("999", PhoneBoock.lookupNumber("Lucas"));
    }

    @Test
    public void testEliminarContacto() {
        PhoneBoock PhoneBoock = new PhoneBoock();
        PhoneBoock.addEntry("Lucas", "358");
        PhoneBoock.delContact("Lucas");

        assertNull(PhoneBoock.lookupNumber("Lucas"));
    }

    @Test
    public void testgetAllCotacts() {
        PhoneBoock PhoneBoock = new PhoneBoock();
        PhoneBoock.addEntry("Lucas", "358");
        PhoneBoock.addEntry("Joaco", "352");

        assertEquals(2, PhoneBoock.totalDeContactos());
        assertTrue(PhoneBoock.getAllCotacts().contains("Lucas"));
        assertTrue(PhoneBoock.getAllCotacts().contains("Joaco"));
    }
}
