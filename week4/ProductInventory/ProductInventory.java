public class ProductInventory {
    public static void main(String[] args) throws Exception {
        Product P1= new Product("nsjsj","pemcil",100);
        Product P2=new Product("lakoq","pen",200,10);
        int quan=P1.restock(5);
        System.out.println("After restock:"+quan);
        int sell=P2.sell(2);
        System.out.println("After selling:"+sell);
        double inVal=P1. getInventoryValue();
        System.out.println("inverntory value for 1st product:"+inVal);
        int count =Product.getProductCount();
        System.out.println("product count :"+count);
        String toString=P1.toString();
        System.out.println("after String:"+toString);
    }
}
