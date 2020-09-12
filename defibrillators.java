import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        String LON = in.next().replaceAll("," , ".");
        String LAT = in.next().replaceAll(",", ".");
        double lon1 = Double.parseDouble(LON), lat1 = Double.parseDouble(LAT);
        double distance = Double.MAX_VALUE;
        int N = in.nextInt();
        String DEFIBs[] = new String[N];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        double min = Double.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            DEFIBs[i] = DEFIB;
            String arr[] = splitter(DEFIB);
            double lon2,lat2;
          lon2 = Double.parseDouble(arr[4]);lat2 = Double.parseDouble(arr[5]);
             double lon = (lon2-lon1) * Math.cos((lon2+lon1)/2);
             double lat = (lat2-lat1) * Math.cos((lat2+lat1)/2);
             double dist = Math.sqrt(lon*lon + lat * lat) * 6371;
             if(dist <= distance) distance = dist;
        }
         for (int i = 0; i < N; i++) {
            String arr[] = splitter(DEFIBs[i]);
            double lon2,lat2;
             lon2 = Double.parseDouble(arr[4]);lat2 = Double.parseDouble(arr[5]);
             double lon = (lon2-lon1) * Math.cos((lon2+lon1)/2);
             double lat = (lat2-lat1) * Math.cos((lat2+lat1)/2);
             double dist = Math.sqrt(lon*lon + lat * lat) * 6371;
             if(dist == distance) System.out.println(arr[1]);
        }

    }





    public static String[] splitter(String DEFIB){
        
        if(DEFIB.contains(";;")) {
            String arr[] = DEFIB.split(";;");
            String ans = arr[0] + ";*;" + arr[1];
            //for(String a : arr){System.out.println(a);}
            ans = ans.replaceAll(",",".");
            //System.out.println(ans);
            arr = ans.split(";");
            return arr;
        }
        else{
            DEFIB = DEFIB.replaceAll(",",".");
             //System.out.println(DEFIB);
            String arr[] = DEFIB.split(";");
            return arr;
        }
        
            
    }

}
