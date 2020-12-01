import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // number of columns.
        int H = in.nextInt(); // number of rows.
        ArrayList<String> tunnel = new ArrayList<>();
        int arr[][] = new int[H][W];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String LINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
            String str[] = LINE.split(" ");
            for(int j = 0; j < str.length; j++){
               arr[i][j] = Integer.parseInt(str[j]);
            }
           
        }
        int EX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            String pos = in.next();
            posAfter(pos, arr[Y][X], X, Y);
        }
    }

    public static void posAfter(String posB,int type,int x, int y){
        String newPos = "";
            if(type == 1){
            if(posB.equals("LEFT")) newPos = "DOWN";
            if(posB.equals("RIGHT")) newPos = "DOWN";
            if(posB.equals("TOP")) newPos ="DOWN";
            }if(type == 2){
            if(posB.equals("LEFT")) newPos = "RIGHT";
            if(posB.equals("RIGHT")) newPos = "LEFT";
             }if(type == 3){
            if(posB.equals("TOP")) newPos = "DOWN";
             }if(type == 4){
            if(posB.equals("RIGHT")) newPos ="DOWN";
            if(posB.equals("TOP")) newPos ="LEFT";
             }if(type == 5){
            if(posB.equals("LEFT")) newPos ="DOWN";
            if(posB.equals("TOP")) newPos = "RIGHT";
            }if(type == 6){
            if(posB.equals("LEFT")) newPos = "RIGHT";
            if(posB.equals("RIGHT")) newPos = "LEFT";
            }if(type == 7){
            if(posB.equals("RIGHT")) newPos ="DOWN";
            if(posB.equals("TOP")) newPos ="DOWN";
            }if(type == 8){
            if(posB.equals("LEFT")) newPos = "DOWN";
            if(posB.equals("RIGHT")) newPos = "DOWN";
            }if(type == 9){
            if(posB.equals("LEFT")) newPos ="DOWN";
            if(posB.equals("TOP")) newPos ="DOWN";
             }if(type == 10){
            if(posB.equals("TOP")) newPos ="LEFT";
            }if(type == 11){
            if(posB.equals("TOP")) newPos = "RIGHT";
            }if(type == 12){
            if(posB.equals("RIGHT")) newPos = "DOWN";
            }if(type == 13){
            if(posB.equals("LEFT")) newPos = "DOWN";
            }
      if(newPos.equals("DOWN")) System.out.println(x + " " + (y+1));
      else if(newPos.equals("LEFT")) System.out.println((x-1) + " " + y);
      else if(newPos.equals("RIGHT")) System.out.println((x+1) + " " + y);
    }
}
