package bean;

public class Calculator {
    String operation;
    double firstVariable;
    double secondVariable;
    double result;

    public Calculator() {
    }

    public Calculator(String operation, double firstVariable, double secondVariable, double result) {
        this.operation = operation;
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }

    public double getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
