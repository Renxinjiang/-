package d18;

/**
 * @PackageName: d18
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/27
 */
public class Class2 {
    public static void main(String[] args) {
        long rich = 0;
        long poor = 0;
        for (int i = 1;i <= 30;i++){
            rich += 10;
            poor = poor + (long)Math.pow(2,i-1);
        }
        System.out.println(rich+" "+poor);
    }
}
