package Palindrome;
import java.util.Scanner;

class PalindromeChecker
{
    public static boolean isPalindrome(String str)
    {
       int left = 0;
       int right = str.length()-1;

       while(left<right)
       {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
       }
       return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter a word:");
            String str = sc.nextLine();

            str = str.toLowerCase();

            if(isPalindrome(str))
            {
                System.out.println("Yes, it is a palindrome");
            }
            else
            {
                System.out.println("No, not a palindrome");
            }
        }catch(Exception e)
        {
            System.out.println("Error"+ e.getMessage());
        }finally
        {
            sc.close();
        }
        
    }
}