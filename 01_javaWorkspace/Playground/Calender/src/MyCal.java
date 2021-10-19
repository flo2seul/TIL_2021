import java.util.Scanner;

public class MyCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("반복횟수를 입력하세요.");
        int n = scanner.nextInt();
        System.out.println("월을 입력하세요.");
        int[] month = new int[n];
        for(int i = 0;i<n;i++) {
            int a = scanner.nextInt();
            month[i] = a;
        }
        scanner.close();
        for(int j=0;j<month.length;j++) {

            if (month[j] == 2) {
                System.out.println(month[j] + "월은 29일혹은 28일까지 있습니다.");
            } else if (month[j] == 4 || month[j] == 6 || month[j] == 9 || month[j] == 11) {
                System.out.println(month[j] + "월은 30일까지 있습니다");
            } else {
                System.out.println(month[j] + "월은 31일까지 있습니다");
            }
        }
    }
}
