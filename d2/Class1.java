package d2;

        import java.util.Scanner;

/**
 * @PackageName: d2
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/7
 */

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0){
                break;
            }
            calculate(n);
        }
    }

    private static void calculate(int n) {
        int count = 0;
        while (n >= 3){
            count += n/3;
            int tmp = n/3;
            n %= 3;
            n += tmp;
        }
        if (n == 2){
            count++;
        }
        System.out.println(count);
    }
}