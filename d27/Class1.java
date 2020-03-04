package d27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @PackageName: d27
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2020/3/4
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(select(array,x));
    }

    private static int select(int[] array, int x) {
        for (int i = 0;i < array.length;i++){
            if (x == array[i]){
                return i;
            }
        }
        return -1;
    }

}
