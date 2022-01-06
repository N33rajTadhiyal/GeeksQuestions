public class moveclockwise {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k =2;
        int j=0;
  
        while(j<k)
        {int temp=a[j];
            System.out.print(j+" ");
            for(int i =0;i<a.length;i++)
            {    
                if(i==a.length-1)
                {
                    
                    a[i]=temp;
                   temp=0;
                }
                else{
                    a[i]=a[i+1];
                }
            }
            j++;
        }System.out.println();
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
    
}
