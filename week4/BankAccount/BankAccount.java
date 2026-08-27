public class BankAccount {
    public static void main(String[] args) throws Exception {
        Account A1=new Account("17253ABCD2725","Ishnika");
        Account A2=new Account ("1740ANHBX9374","ananya",1000);
        boolean dep1=A1.deposit(-2);
        System.out.println("deposit acc1:"+dep1);
        boolean dep2=A2.deposit(3000);
        System.out.println("deposit acc2:"+dep2);
        boolean with1=A1.withdrawn(-37);
        System.out.println("withdraw acc1:"+with1);
        boolean with2=A2.withdrawn(600);
        System.out.println("withdraw acc2:"+with2);
        double bal1=A1.getBalance();
        System.out.println("balance acc1:"+bal1);
        double bal2=A2.getBalance();
        System.out.println("balance acc2:"+bal2);
        String accNum=A1.getAccountNumber();
        System.out.println("Account Number  acc1:"+accNum);
        String ownName=A1.getOwnerName(); 
        System.out.println("Owne name acc1:"+ownName);
        String balance=A1.toString();
        System.out.println("Balance to string:"+balance);  
    }
}
