public class Course {
    private String code ;
    private String title;
    private int capacity;
    private int enrolledCount;
    Course()
    {
        code ="basic";
        title="pollution";
        capacity=30;
        enrolledCount=0;
    }
    public boolean enroll()
    {
        if(enrolledCount==capacity)
            return false ;
        enrolledCount++;
        return true ;
    }
    public boolean withdrawn()
    {
        if(enrolledCount==0)
            return false;
        enrolledCount--;
        return true;
    }
    public boolean isFull()
    {
        if(enrolledCount==capacity)
            return true ;
        return false;
    }
    public int getAvailableSeats()
    {
        int seats=capacity-enrolledCount;
        return seats;
    }
    public String toString()
    {
        String cap=String.valueOf(capacity);
        String count =String.valueOf(enrolledCount);
        return"capacity:"+cap+"enrolled count:"+count;
    }
}
