public class CourseEnrollment {
    public static void main(String[] args) throws Exception {
        Course C1=new Course();
        boolean enroll=C1.enroll();
        System.out.println("IS ENROLLED:"+enroll);
        boolean with=C1.withdrawn();
        System.out.println("after withdrawn:"+with);
        boolean full=C1.isFull();
        System.out.println("capacity (full or not)"+full);
        int seat=C1.getAvailableSeats();
        System.out.println("available seats:"+seat);
        String toString=C1.toString();
        System.out.println("convert to string:"+toString);
    }
}
