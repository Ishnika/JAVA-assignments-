public class BookLoan {
    public static void main(String[] args) throws Exception {
        Book B1=new Book("abcd","efgh","25csgs091");
        boolean borrow =B1.borrowBook();
        System.out.println("Borrow status:"+borrow);
        boolean ret=B1.returnBook();
        System.out.println("return status:"+ret);
        boolean av=B1.isAvailable();
        System.out.println("Availabilty"+av);
        System.out.println("Book title:"+B1.getTitle());
        System.out.println("Book author:"+B1.getAuthor());
        System.out.println("Book code:"+B1.getBookcode());
        System.out.println("to string:"+B1.toString());
    }
}
