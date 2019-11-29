package d14;

import java.util.Scanner;

/**
 * @PackageName: d14
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/23
 */
public class Class1 {
    /**
     * 除0以外1-9中按照从小到大的顺序，将最小的数字输出1次
     * 输出所有出现的0
     * 输出1-9中按照从小到大的顺序，将每个数子输出现的次数（第一位输出的数字会在第一次输出的时候减去1）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0;i< 10;i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 1;i < 10;i++){
            if (array[i] != 0){
                System.out.print(i);
                array[i]--;
                break;
            }
        }
        while (array[0] != 0){
            System.out.print(0);
            array[0]--;
        }
        for (int i = 1;i < 10;i++){
            while (array[i] != 0){
                System.out.print(i);
                array[i]--;
            }
        }
        System.out.println();
    }
}
