import java.util.*;

import javax.print.attribute.standard.Media;

import java.io.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        System.out.println(decode(AsciiToBinary(MESSAGE)));
       
    }

    public static String decode(String code){
        int count = 0;
        String ans = "";
        for(int i = 0; i < code.length(); i++){
            if(i > 0){
                if((code.charAt(i) == '1' && code.charAt(i - 1) == '1') ||
                 ((code.charAt(i) == '0' && code.charAt(i - 1) == '0'))){
                     ans+="0";
                }
                else{
                    if(code.charAt(i) == '0'){ ans+=" 00 0";} 
                    if(code.charAt(i) == '1') {ans+=" 0 0";}
                }
            }
            if(i == 0){
                    if(code.charAt(i) == '0'){ ans+="00 0";} 
                    if(code.charAt(i) == '1') {ans+="0 0";}
            }
        }

        return ans;
        

    }

    public static String AsciiToBinary(String asciiString){  

          byte[] bytes = asciiString.getBytes();  
          StringBuilder binary = new StringBuilder();  
          for (byte b : bytes)  
          {  
             int val = b;  
             for (int i = 0; i < 8; i++)  
             {  
                binary.append((val & 128) == 0 ? 0 : 1);  
                val <<= 1;  
             }   
          }  
          String a = binary.toString();String answer = "";
          for(int i = 0; i < a.length();i+=7){
                a =  new StringBuilder(a).deleteCharAt(i).toString();
          }
          for(int i = 0; i < a.length();i++){
              int count = 0;
              if(a.charAt(i) == '\1'){
                  count++;
                  for(int j = i+i;j < a.length();j++){

                  }}
                  else count = 0;
                    

              }
          
          return a;
    }  
}
