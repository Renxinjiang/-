package d1;

import java.util.Scanner;

/**
 * @PackageName: d1
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/7
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= s1.length(); i++) {
            StringBuilder sb = new StringBuilder(s1);
            sb.insert(i,s2);
            if (plalindrome(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }




    private static boolean plalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        String re = reverse.toString();
        if (s.equals(re)){
            return true;
        }
        return false;
    }
}
