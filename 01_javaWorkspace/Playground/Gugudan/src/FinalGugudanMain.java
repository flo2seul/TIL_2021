import java.util.Scanner;

public class FinalGugudanMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitValue = inputValue.split(",");

        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);

        for(int i=2;i<first+1;i++){
            int [] result = FinalGugudan.calculator(i,second);
            FinalGugudan.print(result);
        }

    }
}
