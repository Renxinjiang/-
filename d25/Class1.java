package d25;

import java.util.Scanner;

/**
 * @PackageName: d25
 * @ClassName: Class1
 * @Description:
 * 实际成绩 绩点
 * 90——100 4.0   85——89 3.7     82——84 3.3      78——81 3.0      75——77 2.7
 * 72——74 2.3    68——71 2.0     64——67 1.5      60——63 1.0      60以下 0
 * 一门课程的学分绩点=该课绩点*该课学分 2．总评绩点=所有学科绩点之和/所有课程学分之和
 * 现要求你编写程序求出某人A的总评绩点（GPA）。
 *
 * 输入描述:
 * 第一行 总的课程数n（n<10）；
 * 第二行 相应课程的学分（两个学分间用空格隔开）；
 * 第三行 对应课程的实际得分；
 * 此处输入的所有数字均为整数。
 * 输出描述:
 * 输出有一行，总评绩点，精确到小数点后2位小数。（printf("%.2f",GPA);）
 * 示例1
 * 输入
 * 5
 * 4 3 4 2 3
 * 91 88 72 69 56
 * 输出
 * 2.52
 * @author: 呆呆
 * @date: 2020/3/2
 */
public class Class1 {
    public static void gpa(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] credit = new int[n];
        double[] gap = new double[n];
        for (int i = 0;i < n;i++) {
            credit[i] = sc.nextInt();
        }
        for (int i = 0;i < n;i++) {
            int score = sc.nextInt();
            if (score >= 90 && score <= 100){
                gap[i] = 4.0;
            }else if (score >= 85 && score <= 89){
                gap[i] = 3.7;
            }else if (score >= 82 && score <= 84){
                gap[i] = 3.3;
            }else if (score >= 78 && score <= 81){
                gap[i] = 3.0;
            }else if (score >= 75 && score <= 77) {
                gap[i] = 2.7;
            }else if (score >= 72 && score <= 74){
                gap[i] = 2.3;
            }else if (score >= 68 && score <= 71){
                gap[i] = 2.0;
            }else if (score >= 64 && score <= 67){
                gap[i] = 1.5;
            } else if (score >= 60 && score <= 63){
                gap[i] = 1.0;
            }else if (score == 0){
                gap[i] = 0;
            }
        }
        double gaps = 0;
        double credits = 0;
        for (int i = 0;i < n;i++){
            credits += credit[i];
            gaps += (gap[i] * credit[i]);
        }
        gaps = gaps/credits;
        System.out.printf("%.2f",gaps);
    }

    public static void main(String[] args) {
        gpa();
    }
}
