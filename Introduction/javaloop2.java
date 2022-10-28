package HackerRank;

import java.util.*;
import java.lang.Math;

class javaloop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum = 0;
            for (int j = 0; j < n; j++){
                if (j == 0)
                    sum += a + Math.pow(2,j) * b;
                else
                    sum += Math.pow(2,j) * b;
                System.out.print((int)sum + " ");
            }
            System.out.print("\n");
        }   
        in.close();
    }
}