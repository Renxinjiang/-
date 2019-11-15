package d9;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @PackageName: d9
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/15
 */
public class Class1 {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = 1;
        while (n != 0){
            x *= n;
            n--;
        }
        String s = String.valueOf(x);
        String[] num = s.split(" ");
        int count = 0;
        for (int i = num.length-1;i >= 0;i--){
            if (num[i].equals(0)){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }
    */

    /**
     * 能被5（5^1）整除的提供1个0
     * 能被25（5^2）整除的提供2个0
     * 能被125（5^3）整除的提供3个0
     * 能被625（5^4）整除的提供4个0
     * 所以 结果= n/5 + n/25 + n/125 + n/625
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n/5 + n/25 + n/125 + n/625;
        System.out.println(count);
    }
}
