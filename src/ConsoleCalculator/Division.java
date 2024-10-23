package ConsoleCalculator;

public class Division implements Operation{
    @Override
    public double execute(double a, double b) {
        if(b == 0){
            throw new IllegalArgumentException("Division durch 0 nicht möglich");
        }else{
            return a / b;
        }
    }
}
