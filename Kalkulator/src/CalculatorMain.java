public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(3));
        System.out.println(calc.calculate(3, 4));
        System.out.println(calc.calculate(3, 4, 5));
    }
}
