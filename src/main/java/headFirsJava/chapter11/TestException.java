package headFirsJava.chapter11;

/**
 * Created by User on 03.09.2017.
 */
public class TestException {

    public static void main(String[] args) {

        String test = "no";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");

        System.out.println();
        System.out.println("SECOND CASE");
        System.out.println();

        String test1 = "yes";
        try {
            System.out.println("start try");
            doRisky1(test1);
            System.out.println("end try");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }

    static void doRisky1(String test1) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test1)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }



    private static class ScaryException extends Exception {
    }
}
