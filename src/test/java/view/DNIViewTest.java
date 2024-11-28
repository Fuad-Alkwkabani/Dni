package view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DNIViewTest {
     @Test
    public void testShowMessage() {
        DNIView view = new DNIView();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.showMessage("Mensaje de prueba");
        assertEquals("Mensaje de prueba\n", outContent.toString());
    }

    @Test
    public void testGetInput() {
        ByteArrayInputStream inContent = new ByteArrayInputStream("12345678\n".getBytes());
        System.setIn(inContent);

        DNIView view = new DNIView();
        String input = view.getInput();
        assertEquals("12345678", input);
    }
}
