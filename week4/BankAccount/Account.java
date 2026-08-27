public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    Account(String aNum,String oName)
    {
        accountNumber=aNum;
        ownerName=oName;
        balance =0;
    }
    Account(String aNum,String oName,double b)
    {
        accountNumber=aNum;
        ownerName=oName;
        balance=b;
    }
    public boolean deposit(double amount)
    {
        if(amount>0)
            {
                balance+=amount;
                return true;
            }
        return false;
    }
    public boolean withdrawn(double amount)
    {
        if(amount>0)
        {
            balance-=amount;
            return true ;
        }
        return false;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public String toString()
    {
        String bal=String.valueOf(balance);
        return (bal);
    }

}
