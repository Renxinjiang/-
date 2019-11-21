package d10;

import java.util.Scanner;

/**
 * @PackageName: d10
 * @ClassName: Main
 * @Description:
 * 给定一个数组和目标值，输出数组中三数之和等于目标值的数位置
 * @author: 呆呆
 * @date: 2019/11/17
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组个数N:");
        int N = scanner.nextInt();   //数组个数
        System.out.println("输入目标值T:");
        int T = scanner.nextInt();
        System.out.println("输入"+N+"个整数：");
        int[] num = new int[N];
        for (int i = 0;i < N;i++){
            num[i] = scanner.nextInt();
        }
        solution(num,T);
    }

    private static void solution(int[] num, int t) {
        for (int i = 0;i < num.length - 2;i++){
            for (int j = i+1;j < num.length - 1;j++){
                int z = j+1;
                while (t - num[i] - num[j] != num[z]){
                    z++;
                    if (z == num.length - 1){
                        break;
                    }
                }
                if (t - num[i] - num[j] == num[z]){
                    System.out.println((i+1) +" "+(j+1)+" "+(z+1));
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
