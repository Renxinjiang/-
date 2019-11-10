package d4;

import java.util.Scanner;

/**
 * @PackageName: d4
 * @ClassName: Class1
 * @Description:
 * [编程题]46578-买苹果
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
 * 如果不能购买恰好n个苹果，小易将不会购买。
 * 输入描述:
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述:
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 * 链接:https://www.nowcoder.com/questionTerminal/61cfbb2e62104bc8aa3da5d44d38a6ef
 * @author: 呆呆
 * @date: 2019/11/9
 */
public class Class1 {
    /**
     * 思路：
     * 如果小易想买奇数个苹果，输出-1；
     * 因为偶数%8结果只能是 0，2,4,6
     * n % 8 = 6；输出n / 8 +1；
     * n % 8 = 4；输出n / 8 -1 + 2 = n / 8 +1；
     * n % 8 = 2；输出n / 8 -2 + 3 = n / 8 +1；
     * n % 8 = 0；输出n / 8 ；
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0){
            System.out.println("-1");
        }else {
            if (n % 8 == 0){
                System.out.println(n / 8);
            }else {
                System.out.println( n / 8 +1);
            }
        }
    }
}
