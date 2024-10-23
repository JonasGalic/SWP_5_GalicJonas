package ConsoleCalculator;

public class AdditionFactory implements OperationFactory {

    @Override
    public Operation createOperation() {
        return new Addition();
    }
}
