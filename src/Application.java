import task.calculator.Calculator;
import java.util.Scanner;



public class Application {

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scan.nextDouble();
        System.out.println("Введите второе число");
        double num2 = scan.nextDouble();
        System.out.println("Введите 0 если нужно выполнить сложение или 1 для вычитания");
        double num3 = scan.nextDouble();
        if (num3 ==0)
        {
            double res = calc.add(num1 , num2);
            System.out.println("Сумма чисел = " + res);
        }
        else
        {
            double res2 = calc.diff(num1 , num2);
            System.out.println("разница чисел = " + res2);
        }
        double res3 = calc.add(num1 , num2);
        boolean c = calc.isEven(res3);
        if (c)
        {
            System.out.println("Число получилось четным");
        }
        else
        {
            System.out.println("Число получилось нечетным");
        }
    }
}
