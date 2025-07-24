import java.util.Scanner;
import java.util.Arrays;

// Program for sorting an array using Insersion Sort
public class main {
    public static void main(String[] args) {
        int[] nums = {5,3,2,0,1,4};
        sortarr(nums);
    }

    //Function to sort the array

    static void sortarr(int[] arr)
    {
        int i = 0;
        while(i<arr.length)
        {
                if(zerocon(arr) == true)
                {
                    int position = arr[i];
                 if(arr[i] != arr[position])
                 {
                    int temp = arr[i];
                    arr[i] = arr[position];
                    arr[position] = temp;
                 }
                 else{
                    i++;
                 }
                }
                if(zerocon(arr) == false)
                {
                    int position = arr[i]-1;
                    if(arr[i] != arr[position])
                    {
                        int temp = arr[i];
                        arr[i] = arr[position];
                        arr[position] = temp;
                    }
                    else
                    {
                        i++;
                    }
                }
            }
             System.out.println(Arrays.toString(arr));
        }

    // checking whether the array has zero or not 
    static boolean zerocon(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                return true;
            }
        }
        return false;
    }

}