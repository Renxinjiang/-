package exam;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

/**
 * @PackageName: exam
 * @ClassName: Class1
 * @Description:
 * 打印不重复的字符串
 * @author: 呆呆
 * @date: 2019/12/1
 */
public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            List<Character> list = new ArrayList<>();
            for (char c : s.toCharArray()){
                if (!list.contains(c)){
                    list.add(c);
                }
            }
            for (int j = 0;j < list.size();j++){
                System.out.print(list.get(j));
            }
            System.out.println();
        }
    }
}
