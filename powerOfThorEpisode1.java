import java.util.*;
import java.io.*;
import java.math.*;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int diffX = lightX - initialTx;
        int diffY = initialTy - lightY;
        String position = "";
         
             
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            if(lightX < 40 && lightY <18 && initialTx<40 && initialTy<18){
            if(diffX > 0 && diffY == 0){
                 position = "E";  
                 initialTx++;
            }
            
            if(diffX == 0 && diffY > 0) {
                position = "N";
                initialTy--;
            }
            if(diffX == 0 && diffY < 0) {
                position = "S";
                initialTy++;
            }
            if(diffX < 0 && diffY == 0){
                 position = "W";
                 initialTx--;
            }
            
            if(diffX > 0 && diffY > 0){
                 position = "NE"; 
                 initialTx++;initialTy--;
            }
            if(diffX > 0 && diffY < 0) {
                position = "SE"; 
                initialTx++;initialTy++;
            }
         
            if(diffX < 0 && diffY < 0){
                 position = "SW"; 
                 initialTx--;initialTy++;
            }
            
            if(diffX < 0 && diffY > 0) {
                position = "NW"; 
                initialTx--;initialTy++;
            }
          }
            diffX = lightX - initialTx;
            diffY = initialTy - lightY;

            if(lightX < 40 && lightY <18 && initialTx<40 && initialTy<18){
            System.out.println(position); 
            //  N NE E SE S SW W or NW
            }
            
        }
    }



}

    
