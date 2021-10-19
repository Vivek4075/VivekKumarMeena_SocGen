class Order
{   
    
    public static void main(String[] args)
    {
        int arr[]={1,2,9,8,10,5};
            
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) 
        {
 
            while(arr[left]%2!=0)
            {
                left++;
            }
            while(arr[right]%2!=1)
            {
            right--;
            }

            if(left<right)
            {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            }
        }

        int id=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                id=i;
                break;
            }
        }
         for (int i = 0; i < (id); i++) {     
            for (int j = i+1; j < (id); j++) {     
               if(arr[i] < arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        } 
         for (int i = id; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        } 

        for (int  i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");


    }
}