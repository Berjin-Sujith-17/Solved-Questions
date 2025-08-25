import java.util.Scanner;

// Code to find the Amstrong Number
public class Amstrong{
    public static void main(String[] args)
    {
        System.out.print("Enter Your Number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int Length = nlen(num);
        int amslogic = amstrong(num);
        if(num == amslogic)
        {
            System.out.println("This is an Amstrong Number...");
        }
        else 
        {
            System.out.println("This Number is Not an Amstrong Number...");
        }
    }

//Function to return the length of the integer
    static int nlen(int n)
    {
    int count = 0;
    int i=n;
    while(i>0)
    {
        i = i/10;
        count++;
    }
    return count;
    }


    //Function to perform the logic operation
    static int amstrong(int n)
    {
        int sum = 0;
        int refv = n;
        while(refv>0)
        {
            int lastdig = refv % 10; 
            sum = sum + (int)Math.pow(lastdig,nlen(n));
            refv = refv/10;
        }
        return sum;
    }
}

