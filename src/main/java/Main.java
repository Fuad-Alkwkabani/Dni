import controller.DNIController;
import model.DNICalculator;
import view.DNIView;

public class Main {
    public static void main(String[] args) {
        DNICalculator calculator = new DNICalculator();
        DNIView view = new DNIView();
        DNIController controller = new DNIController(calculator, view);

        controller.execute();
    }

    
}