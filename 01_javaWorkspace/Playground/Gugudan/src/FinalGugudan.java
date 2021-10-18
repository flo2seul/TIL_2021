import java.util.Scanner;
public class FinalGugudan {

    public static int[] calculator(int i,int second){

        int[] result = new int[second];


        for(int j=0;j<result.length;j++){

            result[j] = i * (j + 1);

        }
        return result;
    }
    public static void print(int[] result) {
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }



}
