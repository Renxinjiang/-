package d11;

/**
 * @PackageName: d11
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/17
 */
public class Class2 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (B.length != 0){
            B[0] = 1;
            for (int i = 1;i < B.length;i++){
                B[i] = B[i-1] * A[i-1];
            }
            int tmp = 1;
            for (int j = B.length-2;j >= 0;j--){
                tmp = tmp * A[j+1];
                B[j] = B[j] * tmp;
            }
        }
        return B;
    }
}
