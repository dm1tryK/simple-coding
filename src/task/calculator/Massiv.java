package task.calculator;

public class Massiv {
    public static void main(String[] args)
    {
            Calculator calc = new Calculator();
            int[] digits = new int[]{1, 2, 3, 4, 3, 2, 1};
            for (int i = 0; i < digits.length; i++)
            {
                int a = digits[i];
                if (a + calc.isEven(i))
                {
                    digits[i] = a;
                    System.out.println(a);
                } else
                {
                    digits[i] = a + 1;
                    System.out.println(a);
                }
            }

    }
}