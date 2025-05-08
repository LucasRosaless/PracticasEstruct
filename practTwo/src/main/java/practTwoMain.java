
public class practTwoMain {

    public static void main(String[] args) {

        PhoneBoock newphoneboock = new PhoneBoock();

        // create new elments for test
        newphoneboock.addEntry("Lucas", "358");
        newphoneboock.addEntry("joaco", "352");
        newphoneboock.addEntry("Tizi", "351");
        newphoneboock.addEntry("borrado", "350");

        // edit phone, for name
        newphoneboock.changePhone("Lucas", "353");

        // delete for name
        newphoneboock.delContact("borrado");

        // view phone for name
        newphoneboock.lookupNumber("Lucas");

        // view all contacts
        System.out.println("------------------------------");
        newphoneboock.getAllCotacts();
        System.out.println("------------------------------");

    }
}
