import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ROUNDS = in.nextInt();
        int CASH = in.nextInt();
        int bet = (int)Math.ceil(CASH * 0.25);
        if((double)bet < CASH / 4) bet++;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < ROUNDS; i++) {
            CASH -= bet;
            String PLAY = in.nextLine();
            String arr[] = PLAY.split(" ");
            int result = Integer.parseInt(arr[0]);
            switch(arr[1]){
                case("ODD"): if(result % 2 !=0 || result == 1 ){bet*=2;} 
                if(result % 2 == 0 || result == 0) bet = 0; break;
                case("EVEN"): if(result % 2 == 0){bet*=2;} 
                 if(result % 2 != 0 || result == 0) bet = 0; break;
                case("PLAIN"): int mine = Integer.parseInt(arr[2]); 
                if(result == mine){bet*=36;} else bet = 0; break;
            }
            CASH += bet;
            if(CASH <= 0){ System.out.println("0"); return;}
            if(CASH!=0){bet = (int)Math.ceil(CASH * 0.25 ); }
            if((double)bet < CASH * 0.25) bet++;
        }
         System.out.println(CASH);
    }
}
