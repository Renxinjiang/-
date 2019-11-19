package d10;

/**
 * @PackageName: d10
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/16
 */
public class Class2 {
    /**
     * 递归解决：
     *
     */
    public int countWays(int x, int y) {
        if (x == 1 || y == 1){
            return 1;
        }
        return countWays(x-1,y) + countWays(x,y-1);
    }


}
