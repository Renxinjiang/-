package d16;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @PackageName: d16
 * @ClassName: Class2
 * @Description:
 * 获得给定分数学生人数
 * N：学生个数，N等于0时结束
 * 第二行：学生成绩；
 * 第三行：给定分数 s
 * @author: 呆呆
 * @date: 2019/11/24
 */
public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n == 0){
                return;
            }
            int[] arr = new int[n];
            for (int i = 0;i < n;i++){
                arr[i] = scanner.nextInt();
            }
            int s = scanner.nextInt();
            int count = 0;
            for (int i = 0;i < arr.length;i++){
                if (arr[i] == s){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
