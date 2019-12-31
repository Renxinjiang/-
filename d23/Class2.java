package d23;

import java.util.Scanner;

/**
 * @PackageName: d23
 * @ClassName: Class2
 * @Description:
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 * @author: 呆呆
 * @date: 2019/12/2
 */
public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int A1 = 0,A2 = 0,A3 = 0,A4 = 0,A5 = 0;
        int flag = 1;   //A2中用
        int count = 0;  //A4中用
        for (int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
            if (array[i] % 5 == 0){
                if (array[i] % 2 == 0){
                    A1 += array[i];
                }
            }
            if (array[i] % 5 == 1){
                A2 += flag*(array[i]);
                flag = -flag;
            }
            if (array[i] % 5 == 2){
                A3++;
            }
            if (array[i] % 5 == 3){
                A4 += array[i];
                count++;
            }
            if (array[i] % 5 == 4){
                if (array[i] > A5){
                    A5 = array[i];
                }
            }
        }
        if(A1!=0){
            System.out.print(A1+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A2!=0){
            System.out.print(A2+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A3!=0){
            System.out.print(A3+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A4!=0){
            System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");
        } else{
            System.out.print("N"+" ");
        }
        if(A5!=0){
            System.out.print(A5);
        } else{
            System.out.print("N");
        }

        }
}
