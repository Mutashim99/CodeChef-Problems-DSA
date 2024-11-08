import java.util.*;
import java.lang.*;
import java.io.*;

class TallestMountain {
    public static void main (String[] args) throws java.lang.Exception {
        int[] mountainHeights = {200,300,100,59,275,185,8185};
        int tallest = mountainHeights[0];
        for(int mountains:mountainHeights){
            if(mountains>tallest){
                tallest = mountains;
            }
        }
        System.out.println("Tallest Mountain is " + tallest);

    }
}
