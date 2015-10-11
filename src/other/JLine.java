package other;

import jline.TerminalFactory;
import jline.console.ConsoleReader;
import java.io.IOException;

/**
 * Created by Armand on 10/11/2015.
 */
public class JLine {
    public static void main(String[] args) {
        try {
            ConsoleReader console = new ConsoleReader();
            console.setPrompt("prompt> ");
            String line = null;
            while ((line = console.readLine()) != null) {
                console.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                TerminalFactory.get().restore();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
