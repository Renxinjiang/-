package d5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName: d5
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/10
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0;i < n;i++){
            array.add(scanner.nextInt());
        }
       solution(n,array);
    }

    private static void solution(int n, List<Integer> array) {
        int count = 0;
        for (int i = 0;i < n-1;i++){
            int sum = 0;
            sum = array.get(i);
            for (int j = i+1;j < n;j++){
                sum += array.get(j);
                if (sum == 40){
                    sum = array.get(i);
                    count++;
                }else if (sum > 40){
                    sum = array.get(i) + array.get(j);
                }
            }
        }
        System.out.println(count);
    }
}
