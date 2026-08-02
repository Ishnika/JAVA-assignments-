import java.util.Scanner;
public class simple_intrest {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p_amt=input.nextInt();
        System.out.println("Enter the rate of intrest:");
        int intrest=input.nextInt();
        System.out.println("Enter the time:");
        int time =input.nextInt();

        double s_intrest=(p_amt*intrest*time)/100;
        System.out.println("The simple intrest is:"+s_intrest);

        double final_amt=s_intrest+p_amt;
        System.out.println("The final amount is:"+final_amt);
    }
}
