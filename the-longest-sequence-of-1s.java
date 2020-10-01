import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        
        ArrayList<Integer> ones = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
      
        String arr[] = b.split("0");
        if(!b.contains("1")) {System.out.println("1");return;}
        if(!b.contains("0")){System.out.println(b.length());return;}

        for(int i = 0; i < arr.length - 1; i++){
           ones.add((arr[i]+arr[i+1]+1).length());
        }
        System.out.println(Collections.max(ones));
    }
}
