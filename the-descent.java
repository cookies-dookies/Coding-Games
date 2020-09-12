import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int max = -1;int mountains[]=new int[8];
        int maxI = 0;
        
        while (true) {
            for (int i = 0; i < 8; i++) {
                mountains[i] = in.nextInt();
            }
            for(int i = 0; i < 8;i++){
                if(mountains[i] == max(mountains,8)){
                        maxI = i;
                }
            }
            System.out.println(maxI);

        }
    }

    public static int[] sort(int sorted[],int N){
            for(int i = 0;i < N;i++){
                for(int j = i+1;j < N;j++){
                    if(sorted[i] <= sorted[j]){
                        int temp = sorted[i]; sorted[i] = sorted[j]; sorted[j] = temp;
                    }   
                  
                }
            }
            return sorted;
    }
      public static int max(int sorted[],int N){
          int max = -1;
            for(int i = 0;i < N;i++){
               if(sorted[i] >= max) max = sorted[i];
            }
            return max;
    }

}
