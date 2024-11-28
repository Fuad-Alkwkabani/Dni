package controller;

import model.DNICalculator;
import view.DNIView;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class DNIControllerTest {

    @Test
    public void testExecuteValidDNI() {
        DNICalculator calculator = mock(DNICalculator.class);
        DNIView view = mock(DNIView.class);

        when(view.getInput()).thenReturn("12345678");
        when(calculator.calculateLetter(12345678)).thenReturn('Z');

        DNIController controller = new DNIController(calculator, view);

        controller.execute();

        verify(view).getInput();
        verify(view).showMessage("El DNI completo es: 12345678Z");
        verify(calculator).calculateLetter(12345678);
    }

    @Test
    public void testExecuteInvalidInput() {
        DNICalculator calculator = mock(DNICalculator.class);
        DNIView view = mock(DNIView.class);

        when(view.getInput())
                .thenReturn("abc")   
                .thenReturn("-1")    
                .thenReturn("12345678"); 

        when(calculator.calculateLetter(12345678)).thenReturn('Z');

        DNIController controller = new DNIController(calculator, view);

        controller.execute();

        verify(view, times(1)).showMessage("El dato introducido es incorrecto. Inténtalo de nuevo.");
        verify(view, times(1)).showMessage("El número debe estar entre 0 y 99999999. Inténtalo de nuevo.");
        verify(view, times(1)).showMessage("El DNI completo es: 12345678Z");
    }
}




