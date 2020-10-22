import java.util.*;
import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speedKM = in.nextInt();
        //System.out.println(speedKM);
        int lightCount = in.nextInt();
        int distances[] = new int[lightCount],durations[] = new int[lightCount];
    
        for (int i = 0; i < lightCount; i++) {
             distances[i] = in.nextInt();
             durations[i] = in.nextInt(); 
        }
          for (int i = 0; i < lightCount; i++) {
           if(!passes(distances[i],durations[i],speedKM)){ speedKM--; i--;}
           }
         System.out.println(speedKM);
         }
                      
   public static boolean passes(int distance,int duration,double speed){
     double time = ((18 * (double)distance)/(speed * 5));
     int temp = (int)(time / (double)duration);  
     if(time <= duration || temp == 0 || temp % 2 == 0) return true;
      return false;}
}

