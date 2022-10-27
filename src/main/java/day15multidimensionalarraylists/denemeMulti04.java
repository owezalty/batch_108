package day15multidimensionalarraylists;

import java.util.Arrays;

public class denemeMulti04 {

    public static void main(String[] args) {

        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, { -2, 4}, {65, -12, 23}}

        int arr[][]= { {5, 0}, { -2, 4}, {45, -12, 230,344, 14}};

        //My Way:
        int sum = 0;
        for(int []w: arr){
            sum+=w.length;
        }
        int[] brr = new int[sum];
        int idx =0;
        for(int []t : arr){
            for(int x :t){
                brr[idx]=x;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        int max = 0;
        int max2 = Integer.MIN_VALUE;
        for(int i=1; i<brr.length; i++){
           max = Math.max(brr[i],brr[i-1]);
           if(max2<brr[i]){
               max2=brr[i];
           }
        }
        System.out.println(max);
        System.out.println(max2);

        //Suleyman Hoca Way:
        int crr[][]= { {5, 0}, { -2, 4}, {45, -12, 230,344, 14}};
        int max4 = crr[0][0];
        for(int l[] : crr){
            for(int t : l){
                max4 = Math.max(max4,t);
            }
        }
        System.out.println(max4);



    }
}
