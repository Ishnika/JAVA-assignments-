public class Product {
    private String code;
    private String name;
    private int unitPrice;
    private int quantity;
    private static int productCounter;
    Product(String code , String name ,int unitPrice)
    {
        this.code =code ;
        this.name = name ;
        if(unitPrice>=0)
            this.unitPrice=unitPrice;
        productCounter++;
    }
    Product(String code , String name , int unitPrice , int quantity)
    {
        this.code =code ;
        this.name = name ;
        if(unitPrice>=0)
            this.unitPrice=unitPrice;
        if(quantity>=0)
            this.quantity=quantity;
        productCounter++;
    }
    public int restock(int amount)
    {
        quantity+=amount;
        return quantity;
    }
    public int sell(int amount)
    {
        if(quantity==0)
            return -1;
        quantity-=amount;
        return quantity;
    }
    public double getInventoryValue()
    {
        int val=quantity*unitPrice;
        return val;
    }
    public static int getProductCount()
    {
        return productCounter;
    }
    public String toString()
    {
        String unit=String.valueOf(unitPrice);
        String quan=String.valueOf(quantity);
        return "unit price:"+unit+"quantity:"+quan;
    }

}
/*Required filename: ProductInventory.java

Create a Product class and a public ProductInventory driver.

Product requirements:

- code, name, unit price, quantity, and a static product counter
- overloaded constructors for zero quantity and supplied quantity
- positive price and non-negative quantity invariants
- restock(int amount)
- sell(int amount), rejecting unavailable quantities
- getInventoryValue()
- static getProductCount()
- toString()

Create several products and demonstrate independent quantities and one shared
static count. */
