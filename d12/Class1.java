package d12;

/**
 * @PackageName: d12
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/18
 */
public class Class1 {
    public int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }
}
