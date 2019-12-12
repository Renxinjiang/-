package d18;

import java.util.Scanner;

/**
 * @PackageName: d18
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/27
 */
public class Class1 {
    /**
     * 遍历字符串，以每个下标为开始，进行提取子串。
     * 然后相当于找最大值一样，依次打擂台。找到最大值的GC比例
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        String maxString = "";
        double maxN = 0;
        for (int i = 0;i < s.length()-n+1;i++){
            String tmp = s.substring(i,i + n);
            if (getCount(tmp) > maxN){
                maxString = tmp;
                maxN = getCount(tmp);
            }
        }
        System.out.println(maxString);
    }

    private static double getCount(String tmp) {
        double x = 0;
        double count = 0;
        for (char c : tmp.toCharArray()){
            if (c == 'G' || c == 'C'){
                count++;
            }
        }
        x = count / (double)tmp.length();
        return x;
    }
}
