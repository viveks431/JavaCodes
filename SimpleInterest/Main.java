package SimpleInterest;

import java.util.Scanner;

class Interest
{
    public float calculateInterest(float amount, float rate, int period)
    {
        return((amount*rate*(period/365))/100);
    }
}
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Interest si = new Interest();

        System.out.print("Enter the amount: ");
        float amount = sc.nextFloat();

        System.out.print("Enter the interest rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time period(in days): ");
        int time = sc.nextInt();

        System.out.println("Simple Interest: " + si.calculateInterest(amount, rate, time));
        
        sc.close();
    }
}
