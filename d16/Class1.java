package d16;

import java.util.Scanner;

/**
 * @PackageName: d16
 * @ClassName: Class1
 * @Description:
 * 洗牌
 * 第一个数T：分T组
 * 第二个数n：左右手各n张牌
 * 第三个数k：洗k次
 * 后面数字：牌的值
 * 3     3 1   1 2 3 4 5 6     3 2   1 2 3 4 5 6      2 2    1 1 1 1
 * 1 4 2 5 3 6    1 5 4 3 2 6    1 1 1 1
 * @author: 呆呆
 * @date: 2019/11/24
 */
public class Class1 {
    /**
     * 每次读取一个数之后，算出他经过k次洗牌后的位置，只用一个长度为2n数组用来输出
     * 根据当前数的位置，可以算出经过一次洗牌后的位置
     * 如果当前数小于等于n（即在左手），则他下次出现的位置是 2*当前位置-1
     * 如果当前位置大于n（即在右手）,则他下次出现的位置是 2*（当前位置 - n）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[2*n];
            for (int i = 0;i < 2*n;i++){
                int tmp = i+1;
                for (int j = 0;j < k;j++){
                    if (tmp <= n){
                        tmp = 2*tmp - 1;
                    }else {
                        tmp = 2*(tmp - n);
                    }
                }
                arr[tmp - 1] = scanner.nextInt();
            }
            //输出
            if (arr.length > 0){
                System.out.print(arr[0]);
            }
            for (int i = 1;i<arr.length;i++){
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }
}
