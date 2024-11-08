import java.util.*;
import java.lang.*;
import java.io.*;

class SearchInArray {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[]a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(a[i]==x){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}