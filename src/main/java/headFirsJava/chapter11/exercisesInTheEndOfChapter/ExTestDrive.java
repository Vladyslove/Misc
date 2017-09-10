package headFirsJava.chapter11.exercisesInTheEndOfChapter;

/**
 * Created by User on 06.09.2017.
 */
class MyExc extends Exception {}

    public class ExTestDrive  {

        public static void main(String[] args) {
            String test = "no";

            try {
                System.out.print("t");
                doRisky(test);
                System.out.print("o");
            } catch (MyExc e) {
                System.out.print("a");
            } finally {
                System.out.print("w");
            }
            System.out.print("s");
        }

        static void doRisky(String t) throws MyExc{
            System.out.print("h");
            if ("yes".equals(t)) {
               throw new MyExc();
            }
            System.out.print("r");
        }
    }


