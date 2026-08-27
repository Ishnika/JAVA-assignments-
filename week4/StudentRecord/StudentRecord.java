        class StudentRecord {
    public static void main(String[] args)
    {
        Student s1= new Student("Ishnika",null,20);
        Student s2= new Student ("Ananya","25csu092",30);
        Student s3=new Student("rahul","25csu83",68);
        String name=s1.GetName();
        System.out.println("Name:"+name);
        String sid=s1.GetS_id();
        System.out.println("student id :"+sid);
        int marks=s1.GetMarks();
        System.out.println("marks :"+marks);
        boolean n_marks=s2.SetMarks(40);
        System.out.println("new marks:"+n_marks);
        boolean pass3=s3.HasPassed();
        System.out.println("passed student 3:"+pass3);
        boolean pass2=s2.HasPassed();
        System.out.println("passed student 2:"+pass2);
        String grade1=s1.getClassification();
         System.out.println("grades:"+grade1);
    }

}

