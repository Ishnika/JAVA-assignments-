public class ArrayTransformation {
    public void ReverseInPlace(int []arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public void ReversedCopy(int[]arr)
    {
        int []arr2=arr.clone();/*to make a copy of arr1 if arr2=arr1 used will point at the same location(changes in arr2 will
                                take place in arr1 as well)*/
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr2[i];
            arr2[i]=arr2[arr.length-1-i];
            arr2[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr2[i]);
        }
    }
    public int removeValue(int[] arr, int target)
    {
        int newSize=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=target)
            {
                arr[newSize]=arr[i];
                newSize++;
            }
        }
        System.out.println("new array ");
        for(int i=0;i<newSize;i++)
        {
            System.out.print(" "+arr[i]);
        }
        return newSize;
    }
    public int sum(int []arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
