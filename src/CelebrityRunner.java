/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner {
    /**
     * The entry point of the Java application.
     * @param args Unused parameter as it is a GUI based program.
     */
    public static void main(String [] args) {
        CelebrityGame game = new CelebrityGame();

        Celebrity cel = new Celebrity("Big Bird", "From Sesame Street, covered in yellow feathers");
        System.out.println(cel); // test toString



    }
}
