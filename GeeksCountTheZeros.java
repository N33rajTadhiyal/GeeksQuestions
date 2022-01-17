public class GeeksCountTheZeros {
    public static void main(String[] args) {
        //given an array we have to count the number of zeros in the array array is sorted descending 
        //all we have to do is use bineary search
        //first we will find the first position on which the element came
        //then find the last occurance of the element
        //then we subtract the first occurance to last occ +1
        //(pos of last occ - pos of first occ)+1
        int a[]={1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        int k=0;
        int first= firstOccurance( a,k);
        int last= lastOccurance( a,k);
         int ans=(last-first)+1;
         System.out.println(ans+" :are the count of 0");
    }

    public static int firstOccurance(int a[],int k)
    {
        int l=0;
        int h = a.length-1;
        int result=-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(a[mid]==k)
            {
                result=mid;
                h=mid-1;
            }
            if(k>a[mid])
            {
                h=mid-1;
            }
            if(k<a[mid])
            {
                l=mid+1;
               
            }
        }
        
        return result;
    }
        public static int lastOccurance(int a[],int k)
    {
        int l=0;
        int h = a.length-1;
        int result=-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(a[mid]==k)
            {// here wer checking if the number present is equal to the key if yea then stor it and make l = mid +1
                result=mid;
                l=mid+1;
            }
            if(k>a[mid])
            {
                h=mid-1;
            }
            if(k<a[mid])
            {
                l=mid+1;
               
            }
        }
        
        return result;
    }
    
}
