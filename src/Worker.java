import bean.Calculator;
import converter.Converter;
import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Operation;
import operations.Subtraction;
import reader.ConsoleReader;
import reader.Reader;
import writer.ConsoleWriter;
import writer.Writer;

public class Worker {

    Calculator calculator = new Calculator();
    Writer writer = new ConsoleWriter();
    Reader reader = new ConsoleReader();
    Operation operation;

    public void run() {
        setVariables();
        calculate();
        showResult();
    }

    void setVariables() {
        writer.showSentencesSelectOperation();
        String selectedOperationInConsole = reader.readString();
        calculator.setOperation(selectedOperationInConsole);
        //        calculator.setOperation(reader.readString());

        writer.showSentencesInputFirstVariable();
        String selectedFirstVariableInConsoleString = reader.readString();
        double selectedFirstVariableInConsoleDouble = Converter.convertStringToDouble(selectedFirstVariableInConsoleString);
        calculator.setFirstVariable(selectedFirstVariableInConsoleDouble);
        //        calculator.setFirstVariable(Converter.convertStringToDouble(reader.readString()));

        writer.showSentencesInputSecondVariable();
        String selectedSecondVariableInConsoleString = reader.readString();
        double selectedSecondVariableInConsoleDouble = Converter.convertStringToDouble(selectedSecondVariableInConsoleString);
        calculator.setSecondVariable(selectedSecondVariableInConsoleDouble);
        //        calculator.setSecondVariable(Converter.convertStringToDouble(reader.readString()));

        setOperation();
    }

    void setOperation() {
        switch (calculator.getOperation()) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
        }
    }

    void calculate() {
        double result = operation.calculate(calculator.getFirstVariable(), calculator.getSecondVariable());
        calculator.setResult(result);
        //        calculator.setResult(operation.calculate(calculator.getFirstVariable(), calculator.getSecondVariable()));
    }

    void showResult() {
        writer.showResult(Converter.convertDoubleToString(calculator.getResult()));
    }
}
