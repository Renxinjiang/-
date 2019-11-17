package d9;

import java.util.Scanner;

/**
 * @PackageName: d9
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/15
 */
public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
