import java.util.Scanner;

public class Sqrt
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
        System.out.println(MySqrt(n));
    }

    static int MySqrt(int x)
    {
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            long sq = (long)mid * mid;
            if(sq == x)
            {
                return mid;
            }
            else if(sq > x)
            {
                end = mid-1;
            }
            else if(sq < x)
            {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}