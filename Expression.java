import java.util.Scanner;

public class Expression {
    private static Expression instance = null;

    private Expression(double x, double y) {
        System.out.println("Результат выражения 2x + 3/y: " + (2*x + 3/y));
    }

    public static Expression getInstance(double x, double y) {
        if (instance == null) {
            instance = new Expression(x, y);
        }
        return instance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        double x = in.nextDouble();
        System.out.println("Введите значение y: ");
        double y = in.nextDouble();
        Expression printer = Expression.getInstance(x, y);
    }
}