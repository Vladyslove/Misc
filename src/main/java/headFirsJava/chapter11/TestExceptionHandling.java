package headFirsJava.chapter11;

/**
 * Created by User on 03.09.2017.
 */
public class TestExceptionHandling {

    private boolean abandonAllHope;

    public void takeRisk() throws BadException {
        if (abandonAllHope) {
            throw new BadException();
        }
    }

    static TestExceptionHandling anObject = new TestExceptionHandling();

    public static void croosFingers() {
        try {
            anObject.takeRisk();
        } catch (BadException ex) {
            System.out.println("Aaaaaa");
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
       croosFingers();
    }
}
