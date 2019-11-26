package d12;

/**
 * @PackageName: d12
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/18
 */
public class Class2 {
    /**
     * 格雷码的书写：
     * 1位格雷码有两个码字
     * (n+1)位格雷码中的前2n个码字等于n位格雷码的码字，按顺序书写，加前缀0
     * (n+1)位格雷码中的后2n个码字等于n位格雷码的码字，按逆序书写，加前缀1
     * n+1位格雷码的集合 = n位格雷码集合(顺序)加前缀0 + n位格雷码集合(逆序)加前缀1
     */
    public String[] getGray(int n) {
        String[] re = null;
        if (n == 1){
            re = new String[]{"0","1"};
        }else {
            String[] str = getGray(n - 1);
            re = new String[str.length * 2];
            for (int i = 0; i < str.length; i++) {
                re[i] = "0" + str[i];
                re[re.length - i - 1] = "1" + str[i];
            }
        }
        return re;
    }
}
