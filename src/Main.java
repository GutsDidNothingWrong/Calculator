import calculator.Ints;
import calculator.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5, 35));
        System.out.println(calc.mult(4,6));
        System.out.println(calc.pow(2, 3));
    }
}
