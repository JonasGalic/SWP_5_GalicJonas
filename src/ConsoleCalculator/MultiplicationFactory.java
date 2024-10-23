package ConsoleCalculator;

public class MultiplicationFactory implements OperationFactory {

    public Operation createOperation() {
        return new Multiplication();
    }
}
//sl