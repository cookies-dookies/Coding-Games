import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int arr[] = new int[n]; int min = Integer.MAX_VALUE; 
 
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(Math.abs(min) >= Math.abs(arr[i])) min = arr[i];
           // if(arr[i] < 0 && isIn(arr,arr[i])) min = arr[i] *(-1);
        }
        if(min < 0 && isIn(arr,(-1)*min)) min = min *(-1);
        if(min != Integer.MAX_VALUE) System.out.println(min);
        else  System.out.println("0");
    }

    public static boolean isIn(int arr[],int toCheckValue){
        for (int element : arr) {
        if (element == toCheckValue) return true;
              }
              return false;
    }
}
