public class SortArrayof012 {
    public static void main(String[] args) {
        int a[]={1,2,1,2,2,0};
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i =0;i<a.length;i++)
        {
            if(a[i]==0)
            c0++;

            else if(a[i]==1)
            c1++;

            else  if(a[i]==2)
            c2++;
        }
        c1=c1+c0;
        System.out.println(c1+" ");
        for(int i =0;i<a.length;i++)
        {
            if(i<c0)
            {
                a[i]=0;
            }
            else if(i>=c0 && i< c1)
            {
                a[i]=1;
            }
            else{
                a[i]=2;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }


    }

    
    
}
