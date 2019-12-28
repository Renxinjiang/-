package d19;



/**
 * @PackageName: d19
 * @ClassName: Class1
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/27
 */
public class Class1 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] re = new boolean[n];
        for (int i = 0;i < n;i++){
            re[i] = s.contains(p[i]);
        }
        return re;
    }
}
