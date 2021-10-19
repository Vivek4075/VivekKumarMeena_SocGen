import java.util.*;
class Order
{   
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) 
        {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
    static float squareRoot(int number)
    {    int precision=1;
        int start = 0, end = number;
        int mid;

        double ans = 0.0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (mid * mid == number) {
                ans = mid;
                break;
            }
            if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            }
            else {
                end = mid - 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float)ans;
    }
    static int floorSqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;
 
        int i = 1, result = 1;
         
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    public static void main(String[] args)
    {
        int arr[]={8,9,10,15,16};
        ArrayList<Integer> a1= new ArrayList<Integer>();
        ArrayList<Float> a2= new ArrayList<Float>();
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            if(isPerfectSquare(arr[i]))
            {
                a1.add(floorSqrt(arr[i]));
                
            }
            else
            {
               
                a2.add(squareRoot(arr[i]));
            }
        }
            
        System.out.println(a1);

        System.out.println(a2);
        Collections.sort(a1, Collections.reverseOrder()); 
        Collections.sort(a2, Collections.reverseOrder()); 
        
        System.out.println(a1);

        System.out.println(a2);
    }
}