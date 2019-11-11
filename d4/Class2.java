package d4;

import java.util.Scanner;

/**
 * @PackageName: d4
 * @ClassName: Class2
 * @Description:
 * [编程题]69390-删除公共字符
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 * 链接:https://www.nowcoder.com/questionTerminal/f0db4c36573d459cae44ac90b90c6212
 * @author: 呆呆
 * @date: 2019/11/9
 */
public class Class2 {
    /**
     * 思路：
     * 将第二个字符串转化为字符数组，遍历其
     * 若第一个字符串不包含这个字符，则打印
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        delete(s1,s2);
    }

    private static void delete(String s1, String s2) {
        for (int i = 0;i < s1.length();i++){
            if (!s2.contains(String.valueOf(s1.charAt(i)))){
                System.out.print(s1.charAt(i));
            }
        }
    }

}
