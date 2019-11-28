package d13;

import java.util.Scanner;

public class Class1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        char c = str[1].charAt(0);

        int m = n / 2;
        if (n % 2 != 0) {
            m = n / 2 + 1;
        }

        //打印第一行
        for (int i = 0;i < n;i++) {
            System.out.print(c);
        }
        System.out.println();
        //打印中间
        for (int j = 0;j < m - 2;j++){
            System.out.print(c);
            for (int i = 0;i < n-2;i++){
                System.out.print(" ");
            }
            System.out.println(c);
        }
        //打印最后一行
        for (int i = 0;i < n;i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
