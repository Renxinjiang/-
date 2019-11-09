package d3;

import java.util.Scanner;

/**
 * @PackageName: d3
 * @ClassName: Class1
 * @Description:
 * [编程题]69385-字符串中找出连续最长的数字串
 * 输入
 * abcd12345ed125ss123456789
 * 输出
 * 123456789
 * 链接:https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d
 * @author: 呆呆
 * @date: 2019/11/9
 */
public class Class1 {
    /**
     * 思路：
     * 用max表示经过的数字长度最大值，
     * count表示计数器，当为字母时重置为0
     * end表示数字尾部，
     * 每次满足数字时，对max进行判断，当max小于于count时，更新max和end
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            int count = 0;
            int max = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    count++;
                    if (max < count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
         //substring--》返回[begin,end)
        System.out.println(s.substring(end - max + 1,end + 1));
    }
}
