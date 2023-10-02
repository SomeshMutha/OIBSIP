import java.util.*;
import java.util.Scanner;
class NumberGuessingGame
{
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number:");
        int x=sc.nextInt();
        Random ran=new Random();
        int num=ran.nextInt(100);
        for(int i=1;i<=4;i++)
        {
            if(num<x)
        {
            System.out.println("Number is Smaller");
            System.out.println("Guess the number:");
            x=sc.nextInt();
        }
        else if(num>x)
        {
            System.out.println("Number is Grater");
            System.out.println("Guess the number:");
            x=sc.nextInt();
        }
        else
        {
            System.out.println("Congratulation! Number is Correct");
            break;
        }
        }
        if(x!=num)
        {
            System.out.println("Sorry! Number is not correct");
            System.out.println("The correct number is:"+num);
        }
    }
}
