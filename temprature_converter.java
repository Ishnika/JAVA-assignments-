import java.util.Scanner;
public class temprature_conversion {   
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the temprature in celcius:");
        int temp= input.nextInt();
        int f_temp=(temp*9/5)+32;
        System.out.println("The temprature in faherenhiet is:"+f_temp);
    }

}


