public class segrigate0and1 {
    public static void main(String[] args) {
        int a[]={0,0,1,1,0};
        int l=0,r=a.length-1;
        while(l<r)
        {
         while(a[l]==0 &&l<r)
         {
             l++;
         }
         while(a[r]==1 && r>l)
         {
             r--;
         }
         if(l<r)
         {
             int temp =a[l];
             a[l]=a[r];
             a[r]=temp;
         }
         l++;
         r--;

        }
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
    
}
