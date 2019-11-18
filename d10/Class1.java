package d10;

import java.util.Scanner;

/**
 * @PackageName: d10
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/16
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int a = 0;   //第n-2项
        int b = 0;   //第n-1项
        int c = 1;   //第n项
        while (c < n){
            a = b;
            b = c;
            c = a+b;
        }
        int re1 = c - n;
        int re2 = n - b;
        System.out.println(re1 < re2 ? re1 : re2);
    }

}
