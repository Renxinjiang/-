package d14;

import java.util.Scanner;

/**
 * @PackageName: d14
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/23
 */
public class Class2 {
    /**
     * 1^3=1
     * 2^3=3+5
     * 3^=7+9+11
     * 4^3=13+15+17+19
     * 观察规律，连续奇数求和就是等差数列求和，难点立即转换为等差数列的首项，得出首项 a = m*(m-1)+1,有m项
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1){
            System.out.println(1);
            return;
        }
        int a = n * (n - 1) + 1;
        String s = null;
        s = a+"+";
        for (int i = 0;i < n-2;i++){
            a += 2;
            s += a+"+";
        }
        s += a+2;
        System.out.println(s);
    }
}
