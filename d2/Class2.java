package d2;

/**
 * @PackageName: d2
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/7
 */
public class Class2 {
    public int count(int[] A, int n) {
        /**
         * 思路：
         * 两层循环
         */
        int count = 0;
        for (int i = 0;i < n-1;i++){
            for (int j = i + 1;j < n;j++){
                if (A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
