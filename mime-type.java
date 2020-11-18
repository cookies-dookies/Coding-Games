import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Map<String, String> types = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            types.put(EXT.toLowerCase(),MT);
        }
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            if(FNAME.contains(".")) FNAME = FNAME.substring(FNAME.lastIndexOf(".")+1).toLowerCase();
            else FNAME = "N";

        if(FNAME == "N") {
            System.out.println("UNKNOWN");}
               else if(types.containsKey(FNAME)) {
                    System.out.println(types.get(FNAME));
                }else{
                    System.out.println("UNKNOWN");
            }}     
    }
}
