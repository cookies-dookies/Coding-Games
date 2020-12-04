import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int L = in.nextInt();
        String lines[] = new String[L];
        lines[0] = "" + R;
       
        if(L > 1){ 
        lines[1] = "1 " + R;
        for(int i = 2; i < L; i++){
            lines[i] = "";
        }
        for(int i = 2; i < L; i++){
            lines[i-1] = lines[i-1].strip();
            String str[] = lines[i-1].split(" ");
            int count = 1;
            for(int j = 0;j < str.length;j++){
                if(j < str.length-1){
                if(str[j].equals(str[j+1])) {count++;continue;}
                }if(count > 1){lines[i] += " " + count + " " + str[j];count = 1;continue;}
                else {lines[i] += " " + count + " " + str[j];count = 1;continue;}
               } lines[i] = lines[i].strip();
        }

        System.out.println(lines[L-1]);}
        else System.out.println(lines[0]);
    }
}
