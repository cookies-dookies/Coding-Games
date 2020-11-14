import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of relationships of influence
        int cont[][] = new int[n][2];int max = 0;
        int conts[] = new int[n];
        List<Integer>[] arrayOfList = new List[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt(); // a relationship of influence between two people (x influences y)
            int y = in.nextInt();
            cont[i][0] = x; cont[i][1] = y;
        }for (int i = 0; i < n; i++) {
            List<Integer> l1 = new ArrayList<>();
            l1.add(cont[i][0]);l1.add(cont[i][1]);
           arrayOfList[i] = contacts(cont,n,l1);
        }for (int i = 0; i < n; i++) {
            if(arrayOfList[i].size() >= max) max = arrayOfList[i].size();
        }
            System.out.println(max);
    }
         public static List<Integer> contacts(int arr[][],int n,List<Integer> l1){ 
                 for(int i = 0; i < n;i++){
                    if(l1.get(l1.size() - 1) == arr[i][0]){
                    l1.add(arr[i][1]);
                    return contacts(arr,n,l1);
        }}return l1;     
    }
}
