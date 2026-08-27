public class Book {
    private String title;
    private String author;
    private String bookcode;
    private boolean loaned;

    Book(String title ,String author , String bookcode)
    {
        this.title=title;
        this.author =author ;
        this.bookcode=bookcode;
        this.loaned=false;
        if (title == null || author == null || bookcode == null )
        {
            System.out.println("NULL VALUES NOT ALLOWED");
        }
    }
    public boolean borrowBook()
    {
        if(loaned==true)
            return false;
        loaned =true;
        return true;
    }
    public boolean returnBook()
    {
        if(loaned ==false)
            return false ;
        loaned =false;
        return true;
    }
    public boolean isAvailable()
    {
        if(loaned==true)
            return false;
        return true;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getBookcode()
    {
        return bookcode ;
    }
    public String toString()
    {
        String l=String.valueOf(loaned);
        return l;
    }
}
