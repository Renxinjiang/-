package d28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName: d28
 * @ClassName: Class1
 * @Description:
 * 守形数是这样一种整数，它的平方的低位部分等于它本身。
 * 比如25的平方是625，低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
 *
 * 输入描述:
 * 输入包括1个整数N，2<=N<100。
 * 输出描述:
 * 可能有多组测试数据，对于每组数据，
 * 输出"Yes!”表示N是守形数。
 * 输出"No!”表示N不是守形数。
 *
 * 示例1
 * 输入
 * 25
 * 4
 * 输出
 * Yes!
 * No!
 * @author: 呆呆
 * @date: 2020/3/6
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n == 2 || n  == 3){
                System.out.println("No!");
            }
            // 求n的平方
            int n2 = n * n;
            String s = "" + n;
            String s2 = "" + n2;
            String str = s2.substring(s2.length()-s.length(),s2.length());
            if (str.equals(s)){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
