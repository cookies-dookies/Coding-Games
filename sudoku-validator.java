import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        int arr[][] = new int[9][9];
    
        String subs[] = new String[9];
        Scanner in = new Scanner(System.in);
       
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = in.nextInt();
                arr[i][j] = n;
                all+=arr[i][j];
            }
        }

        int count = 0;

      for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for(int n = j+1; n < 9; n++){
                  if (arr[i][j] == arr[i][n]) count++;}
                  for(int n = i+1; n < 9; n++){
                  if (arr[i][j] == arr[n][j]) { count++;}} 
                }}
  
            subs[0] = ""+arr[0][0]+arr[0][1]+arr[0][2]+arr[1][0]+arr[1][1]+arr[1][2]+arr[2][0]+arr[2][1]+arr[2][2];
            subs[1] = ""+arr[3][0]+arr[3][1]+arr[3][2]+arr[4][0]+arr[4][1]+arr[4][2]+arr[5][0]+arr[5][1]+arr[5][2];
            subs[2] = ""+arr[6][0]+arr[6][1]+arr[6][2]+arr[7][0]+arr[7][1]+arr[7][2]+arr[8][0]+arr[8][1]+arr[8][2];

            subs[3] = ""+arr[0][3]+arr[0][4]+arr[0][5]+arr[1][3]+arr[1][4]+arr[1][5]+arr[2][3]+arr[2][4]+arr[2][5];
            subs[4] = ""+arr[3][3]+arr[3][4]+arr[3][5]+arr[4][3]+arr[4][4]+arr[4][5]+arr[5][3]+arr[5][4]+arr[5][5];
            subs[5] = ""+arr[6][3]+arr[6][4]+arr[6][5]+arr[7][3]+arr[7][4]+arr[7][5]+arr[8][3]+arr[8][4]+arr[8][5];

            subs[6] = ""+arr[0][6]+arr[0][7]+arr[0][8]+arr[1][6]+arr[1][7]+arr[1][8]+arr[2][6]+arr[2][7]+arr[2][8];
            subs[7] = ""+arr[3][6]+arr[3][7]+arr[3][8]+arr[4][6]+arr[4][7]+arr[4][8]+arr[5][6]+arr[5][7]+arr[5][8];
            subs[8] = ""+arr[6][6]+arr[6][7]+arr[6][8]+arr[7][6]+arr[7][7]+arr[7][8]+arr[8][6]+arr[8][7]+arr[8][8];
         
            for(int i = 0; i < 9;i++){
              
                for(int j = 0; j < 9; j++){
                    for(int n = j+1; n < 9;n++){
                             if(subs[i].charAt(j)==subs[i].charAt(n)){
                                 count++;
                             }
                    }
                }
            }
        
            if(count==0) System.out.println("true");
            else System.out.println("false");
      
    }
}
