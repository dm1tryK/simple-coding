package task.calculator;

/**
 * Данный класс должен релизовывать простую функциональсть калькулятора по сложению и вычитанию, а так же определению четное ли число
 * TODO Требуется дописать сигнатуру методов: модификатор доступа, тип возвращаемого значения
 * TODO Требуется написать релизацию по сложению (add), вычитанию (diff) и проверки четности числа (isEven)
 */
public class Calculator
{
    public int add (int d1, int d2)
    {
       return d1 + d2;
    }

    public int diff(int d1, int d2)
    {
        return d1 - d2;
    }

    public boolean isEven(double d)
    {
        boolean c = d % 2 == 0;
        return c;
    }
}
