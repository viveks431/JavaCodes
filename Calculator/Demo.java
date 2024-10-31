import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public int div(int a, int b) throws ArithmeticException 
    {
        if (b == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
public class Demo 
{
    public static void main(String args[]) 
    {   
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        try
        {
            System.out.print("Enter a number(a): ");
            int a = sc.nextInt();
            System.out.print("Enter a number(b): ");
            int b = sc.nextInt();
            System.out.print("Which operation: ");
            String op = sc.next();
            switch(op)
            {
                case "+":
                    System.out.println("result: " + calc.add(a,b));
                    break;
                case "-":
                    System.out.println("result: " +calc.sub(a,b));
                    break;
                case "*":
                    System.out.println("result: " + calc.multiply(a,b));
                    break;
                case "/":
                    try
                    {
                        System.out.println("result: " + calc.div(a,b));
                    }catch(ArithmeticException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    break;
                default:
                        System.out.print("Enter a valid operation");
            }
        }catch(InputMismatchException e)
            {
                System.out.println("Enter an integer value");
            } 
        finally
            {
                sc.close();
            }
    }
}

