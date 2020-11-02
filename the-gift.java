import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int C = in.nextInt();
        ArrayList<Integer> money = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = C;int n = N;int amount = 0;
        for (int i = 0; i < N; i++) {
            money.add(in.nextInt());amount+=money.get(i);
        }
        Collections.sort(money);
	int average = (int)((double)sum / (double)N);
	if(amount < C) {System.out.println("IMPOSSIBLE"); return;}

	for (int i = 0; i < N; i++) {
	   if(money.get(i) < average){ arr.add(money.get(i));sum-=money.get(i); n--;
       average = (int)((double)sum / (double)n);}
    }for (int i = 0; i < N; i++) {
	   if(money.get(i) >= average && sum >= average){ arr.add(average);
	   sum-=average; 
	   n--;average = (int)((double)sum / (double)n);}
	   }for (int i = 0; i < N; i++) { 
           if(average >= sum && n >= 1){ 
           arr.add(sum);
	    sum=0;  n--;average = (int)((double)sum / (double)n);
	   } else arr.add(average);}
    for (int i = 0; i < N ; i++) {
    System.out.println(arr.get(i));
}
}
}		
