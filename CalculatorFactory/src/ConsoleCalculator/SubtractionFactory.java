package ConsoleCalculator;

public class SubtractionFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Subtraction();
    }
}
