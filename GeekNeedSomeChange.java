public class GeekNeedSomeChange {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
       
        for(int i = 0 ; i<a.length;i++)
        {
            if(i+2<a.length)
            {
                Swap(a, i, i+2);
            }
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
       

    }
    public static int[] Swap(int a[],int l,int h)
    {
        int temp = a[l];
        a[l]=a[h];
        a[h]=temp;
        return a;
    }
    
}
