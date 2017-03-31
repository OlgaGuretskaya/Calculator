package operations;

public class Multiplication implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
