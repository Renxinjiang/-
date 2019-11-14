package d6;

import java.util.Scanner;

/**
 * @PackageName: d6
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/12
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        int[] num = new int[4];
        // Integer.parseInt(array[0]);将字符串转为数字。
        for (int i = 0;i <array.length;i++){
            num[i] = Integer.parseInt(array[i]);
        }
        int a = (num[0] + num[2])/2;
        int b = num[2] - a;
        int c = num[3] - b;
        if ((a - b) != num[0]){
            System.out.println("No");
        }else if ((b - c) != num[1]){
            System.out.println("No");
        }else if ((a+b) != num[2]){
            System.out.println("No");
        }else if ((b+c) != num[3]){
            System.out.println("No");
        }else {
            System.out.println(a + " "+b+" "+c);
        }
    }
}
