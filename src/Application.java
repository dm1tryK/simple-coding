import task.calculator.Calculator;
import java.util.Scanner;



public class Application {

    public static void main(String[] args)
    {
//        Calculator calc = new Calculator();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        double num1 = scan.nextDouble();
//        System.out.println("Введите второе число");
//        double num2 = scan.nextDouble();
//        System.out.println("Введите 0 если нужно выполнить сложение или 1 для вычитания");
//        double num3 = scan.nextDouble();
//        if (num3 ==0)
//        {
//            double res = calc.add(num1 , num2);
//            System.out.println("Сумма чисел = " + res);
//        }
//        else
//        {
//            double res2 = calc.diff(num1 , num2);
//            System.out.println("разница чисел = " + res2);
//        }
//        double res3 = calc.add(num1 , num2);
//        boolean c = calc.isEven(res3);
//        if (c)
//        {
//            System.out.println("Число получилось четным");
//        }
//        else
//        {
//            System.out.println("Число получилось нечетным");
//        }
        int res = calculateInLoop(); //todo передать корректный параметр
        System.out.println("Итоговый результат должен быть = 0, " + (res == 0)); //для проверки
    }

    public static int calculateInLoop(Calculator calculator) { //функция вычисления некой суммы в цикле
        int[] digits = new int[] {1,2,3,4,3,2,1}; //массив чисел, нужно разобраться что это вообще такое и зачем
        res;//todo переменная с итоговым результатом вычисления, нужно объявить ее тип и начальное значение
        for (int i = 0; i < digits.length; i++) { //обход массива нужно разобраться как работают циклы for и while
            //todo для каждого числа из массива если число четное, то прибавить его к res, иначе вычесть
        }
        return ; //todo нужно вернуть итоговый результат
    }
}
