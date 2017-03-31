package writer;

public class ConsoleWriter implements Writer{

    public void inputVariables() {

    }

    @Override
    public void showSentencesInputFirstVariable() {
        System.out.println("Input of the first variable:");
    }

    @Override
    public void showSentencesInputSecondVariable() {
        System.out.println("Input of the second variable:");
    }

    @Override
    public void showResult(String result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void showSentencesSelectOperation(){
        System.out.println("Select an operation: +, -, *, /");
    }
}
