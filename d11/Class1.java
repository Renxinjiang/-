package d11;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @PackageName: d11
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/17
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] array = s.toCharArray();
        int[] re = new int[10];
        for (int i = 0;i<10;i++){
            re[i] = 0;
        }
        for (int i = 0;i < array.length;i++){
            int n = array[i]-'0';
            re[n] = re[n] +1;
        }
        for (int i = 0;i < re.length;i++){
            if (re[i] != 0){
                System.out.println(i + ":" + re[i]);
            }
        }
    }
}
