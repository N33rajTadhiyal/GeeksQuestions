class moveclockwiseinONandO1{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        /**
         * move item clockwise k times
         */
        int k=5;
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1); 


for(int i =0;i<a.length;i++)
{
    System.out.println(a[i]+"");
}  

}
  public static void reverse(int a[],int l ,int  h) {
      while(l<h)
      {
          int temp = a[l];
          a[l]=a[h];
          a[h]=temp;
          l++;
          h--;

      }
        
    }
}