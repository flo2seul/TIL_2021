import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import java.util.Scanner;

public class Gugudan {
    public static int[] calculater(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
            return result;
        }

    public static void print(int[] result) {
        for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args){
            for(int i =2;i<10;i++){
                int[] result = calculater(i);
                print(result);
            }


    }
}

