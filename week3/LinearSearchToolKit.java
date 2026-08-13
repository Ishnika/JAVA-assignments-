import java.util.Scanner ;

public class LinearSearchToolKit {
    public boolean contains(int []arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
            
        }
        return false;
    }
    public int FindIndexOf(int []arr,int target)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]==target)
            {
                index = i;
                return index;
            }
        }
        return index;
    }
    public int lastIndexOf(int[] arr, int target)
    {
        int index=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                index=i;
                return index;
            }
        }
        return index;
    }
    public int countOccurrences(int[] arr, int target)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count+=1;
            }
        }
        return count ;
    }
}
