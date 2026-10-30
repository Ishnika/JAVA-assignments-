public class LinkedList {
    Node Head=null;
    int size;
    
    public void InsertAtEnd(String n, String r)
    {
        if(Head==null)
        {
            Head=new Node();
            Head.name=n;
            Head.rollno=r;
            Head.next=null;
        }
        else 
        {
            Node NewNode= new Node();
            NewNode.name=n;
            NewNode.rollno=r;
            NewNode.next=null;
            
            Node temp=Head;
            while(temp.next !=null)
            {
                temp=temp.next;
            }
            temp.next=NewNode;
        }
    }

    public void InsertAtFront(String n,String r)
    {
        if(Head== null)
        {
            Head = new Node();
            Head.name=n;
            Head.rollno=r;
            Head.next=null;
            
        }
        else 
        {
            Node NewNode =new Node();
            NewNode.name =n;
            NewNode.rollno=r;
            NewNode.next=Head;

            Head=NewNode;
        }
    }
    public void InsertAtMiddle(int pos , String n,String r)
    {
        if(size==0)
        {
            Head=new Node();
            Head.rollno=r;
            Head.name=n;
            Head.next=null;
            size++;
            return;
        }
        if(pos>=size)
        {
            InsertAtEnd(n,r);
        }
        Node temp=Head;
        Node N = new Node();
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        N.next=temp.next;
        temp.next=N;
    }
    public boolean Display()
    {
        if(Head==null)
            return false;
        Node temp=Head;
        while(temp!=null) 
        {
            System.out.println("THE NAME IS :"+temp.name);
            System.out.println("THE ROLL NUMBER IS :"+temp.rollno);
            temp=temp.next;
        }
        return true;
    }
}
