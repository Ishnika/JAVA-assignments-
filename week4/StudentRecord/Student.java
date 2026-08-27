public class Student {
    String name ;
    String s_id;
    int marks ;
    Student(String n,String s,int m)
    {
        if(n==null || s==null || (m<0 ||m>100))
        {
            System.out.println("NULL VALUE NOT ACCEPTED");
        }
        else 
        {
            name =n;
            s_id=s;
            marks=m;
        }   
    }
    public String GetName()
        {
            return name;
        }
    public String GetS_id()
    {
        return s_id;
    }
    public int GetMarks()
    {
        return marks;
    }
    public boolean SetMarks(int newMarks)
    {
        if(newMarks>100 ||newMarks<0)
            return false ;
        marks =newMarks;
        return true;
    }
    public boolean HasPassed()
    {
        if(marks>=50)
            return true ;
        return false;
    }
    public String getClassification()
    {
        if(marks>=90)
            return "A";
        else if (marks>=80 && marks<90)
            return "B";
        else if(marks>=70 && marks<80)
            return "C";
        else if (marks>=60 && marks<70)
            return "D";
        else if(marks>=50 && marks<60)
            return "E";
        else 
            return "fail";
    }
    public String ToString()
    {
        String m =String.valueOf(marks);
        return( "\nname:"+name+"\nstudent ID:"+s_id+"\nmarks:"+m);
    }

}

