import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Lab 1 : Task 1");
        /*За введеними значеннями обчислити та вивести на екран значення виразу x*y+((x+y)^3/x^2+y^2)*(x-y)
         Обчислення виконати у трьох варіантах:
                1) вхідні дані дійсного типу, результат – дійсного;
                2) вхідні дані цілого типу, результат – дійсного;
                3) вхідні дані дійсного типу, результат – цілого */
        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        double x = in.nextDouble();

        System.out.println("Input y: ");
        double y = in.nextDouble();

        // 1: Вхідні дані дійсного типу, результат - дійсного:
        double result1 = x * y + Math.pow(x + y, 3) / (x * x + y * y) * (x - y);
        System.out.println("Result (дійсний тип): " + result1);

        // 2: Вхідні дані цілого типу, результат - дійсного:
        int intX = (int) x;
        int intY = (int) y;
        double result2 = intX * intY + Math.pow(intX + intY, 3) / (intX * intX + intY * intY) * (intX - intY);
        System.out.println("Result (дійсний тип з цілими вхідними даними): " + result2);

        // 3: Вхідні дані дійсного типу, результат - цілого:
        int result3 = (int) (x * y + Math.pow(x + y, 3) / (x * x + y * y) * (x - y));
        System.out.println("Result (цілий тип): " + result3);
        in.close();
    }
}
