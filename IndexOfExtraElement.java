public class IndexOfExtraElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4};
        int ans=-1;
        
        if(a.length > b.length)
        {
            ans =Search(a, b);
        }

        if(ans!=-1)
        {
            System.out.println(ans+" :index of missing number");
        }
    }
    public static int Search(int a[],int b[])
    {
     int l=0,h=b.length-1;
     int ans=-1;
     while(l<=h)
     {
         
         int mid=(l+h)/2;
         if(a[mid] !=b[mid])
         {
             ans =mid;
             h=mid-1;
         }
         if(a[mid] == b[mid])
         {
             l=mid+1;
         }
         else{
             h=mid-1;
         }
     }
         
     if(ans!=-1)
     {
         return ans;
     }else{
         return a.length-1;
     }
        
    }
    
}
