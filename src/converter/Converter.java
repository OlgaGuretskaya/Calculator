package converter;

public class Converter {
    public static int convertStringToInt(String variable) {
        return Integer.parseInt(variable);
    }

    public static double convertStringToDouble(String variable) {
        return Double.parseDouble(variable);
    }

    public static String convertDoubleToString(double variable) {
        return Double.toString(variable);
    }
}
