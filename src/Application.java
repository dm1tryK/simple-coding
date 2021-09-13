import task.calculator.Calculator;
import java.util.Scanner;
import java.util.Random;



public class Application {

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int res = calculateInLoop(calc); //todo передать корректный параметр
        System.out.println("Итоговый результат должен быть = 0, " + (res == 0)); //для проверки
    }

    public static int calculateInLoop(Calculator calculator) { //функция вычисления некой суммы в цикле
        int[] digits = new int[] {1,2,3,4,3,2,1};//массив чисел, нужно разобраться что это вообще такое и зачем
        int res = 0;//todo переменная с итоговым результатом вычисления, нужно объявить ее тип и начальное значение
        for (int i = 0; i < digits.length; i++) { //обход массива нужно разобраться как работают циклы for и while
            int a = digits[i];
            if (calculator.isEven(a))
            {
                res = calculator.add(res, 1);
                System.out.println(res);
            }
            else
            {
                res = calculator.diff(res, 1);
                System.out.println(res);
            }
            //todo для каждого числа из массива если число четное, то прибавить его к res, иначе вычесть
        }
        return res;//todo нужно вернуть итоговый результат
    }
}
