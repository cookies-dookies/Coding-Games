
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String triforce[] = new String[2*N];
        String spaces[] = new String[2 * N]; String stars[]= new String[2 * N]; String space = "",star = "*";
        String middleSpace[] = new String[2 * N];
        for(int i = 2*N -1;i >= 0;i--){
              spaces[i] = space;
                  space += " ";
                 middleSpace[i] = "";   
        } 

	 stars[0] = "*";stars[N] = "*";
	 for(int i = 1; i < N;i++){
	 	star+="**";
	 	stars[i] = star;
	 } star = "*";
    
	  for(int i = N+1; i < 2*N;i++){
	 	star+="**";
	 	stars[i] = star;
	 } 
    space = space.replaceFirst(" ", "");
	 for(int i = 0; i < 2 * N ;i++){
	  triforce[i] = "";
	  triforce[i] += spaces[i] + stars[i];
      if(i >= N) {
          middleSpace[i] = space;
           triforce[i] +=  middleSpace[i] + stars[i] ;
          space = space.replaceFirst("  ","");
        
      }
      }
     
	 
     triforce[0] = triforce[0].replaceFirst(" ",".");
           for(int i = 0;i < 2*N;i++){
             System.out.println(triforce[i]);
        }
    }
}
