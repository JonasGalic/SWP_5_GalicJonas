package ConsoleCalculator;

public class DivisionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Division();
    }
}
