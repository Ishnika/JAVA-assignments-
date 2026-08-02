import java.util.Scanner;
public class arithematic_calculator {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter : 1 -sum : 2-difference ; 3- product ; 4-quitent; 5-remainder:");
        int choice = input.nextInt();
        System.out.println("Enetr the 1st number:");
        int num1=input.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=input.nextInt();
        if (choice==1)
        {
            int sum= num1+ num2;
            System.out.println("The sum is:"+sum);
        }
        else if(choice==2)
        {
            int diff;
            if (num1>num2)
            {
                diff=num1 - num2 ;
            }
            else
            {
                diff = num2-num1 ;
            }
            System.out.println("The difference is:"+diff);
        }
        else if(choice==3)
        {
            int prod=num1*num2;
            System.out.println("The product is:"+prod);
        }
        else if(choice ==4)
        {
            if(num2==0)
            System.out.println("dividion by 0 is not possible");
            else 
            {
                double Q=num1/num2;
                System.out.println("The quitent is:"+Q);
            }
        }
        else 
        {
            if(num2==0)
            System.out.println("division by 0 is not possible");
            else 
            {
                int rem=num1%num2;
                System.out.println("The remainder is:"+rem);
            }
        }
    }
}
