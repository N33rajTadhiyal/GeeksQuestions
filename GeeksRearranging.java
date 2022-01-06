public class GeeksRearranging{
   public static void main(String[] args) {
       //this is not a nice aproach
       long a[]={5,0,3,7,1,4,6,2};
     
       int b[]=new int[a.length];
       int x=0;
          
       for(int i =0;i<a.length;i++)
       {
           x=(int)a[i];
           b[i]=(int)a[x];
         
       }
       for(int i =0;i<b.length;i++)
       {
           System.out.print(b[i]+" ");
       }

   }

}