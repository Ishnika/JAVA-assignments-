public class MatrixOpperation {
    public int[] rowSum(int [][]arr)
    {
        int []sum=new int[arr.length];
        for(int r=0;r<arr.length;r++)
        {
            int row_sum=0;
            for(int c=0;c<arr[0].length;c++)
            {
                row_sum+=arr[r][c];
            }
            sum[r]=row_sum;
        }
        return sum;
    }
    public int[] columnSum(int [][]arr)
    {
        int []sum=new int[arr[0].length];
        for(int c=0;c<arr[0].length;c++)
        {
            int csum=0;
            for(int r=0;r<arr.length;r++)
            {
                csum+=arr[r][c];
            }
            sum[c]=csum;
        }
        return sum;
    }
    public int [][] add(int [][]arr1,int [][]arr2)
    {
        for(int r1=0,r2=0;r1<arr1.length && r2<arr2.length;r1++,r2++)
        {
            for(int c1=0,c2=0;c1<arr1[0].length && c2<arr2[0].length;c1++,c2++)
            {
                arr1[r1][c1]+=arr2[r2][c2];
            }
        }
        return arr1;
    }
    public int [][] transpose(int [][]arr)
    {
        for(int r=0;r<arr.length;r++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(r<j)
                {
                    int temp=arr[r][j];
                    arr[r][j]=arr[j][r];
                    arr[j][r]=temp;
                }
            }
        }
        return arr;
    }
    public int[][] multiply(int [][] arr1, int [][] arr2)
    {
        
            int [][] prod= new int[arr1.length][arr2[0].length];
            for(int i=0;i<arr1.length;i++)
            {
                for(int j=0;j<arr2[0].length;j++)
                {
                    for(int k=0;k<arr1[0].length;k++)
                    {
                        prod[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            return prod;
    }
    public void print(int [][] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println(" ");
        }
    }
}
