public class ArrayStatistics {
   public static int sum(int[] arr)
   {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
       return sum;
   }
   public static double average(int[] arr)
   {
        int sum=sum(arr);
        int count=arr.length;
        double avg=(double)sum/count;
        return avg;
   }
   public static int minimum(int []arr)
   {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
   }
   public static int maximum(int []arr)
   {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
   }
   public static int countEven(int []arr)
   {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count+=1;
            }
        }
        return count ;
   }
   public static void signCount(int []arr)
   {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count+=1;
            }
        }
        System.out.println("number of -ve sign:"+count);
   }
}
