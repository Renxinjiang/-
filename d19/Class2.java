package d19;

import java.util.*;

/**
 * @PackageName: d19
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/27
 */
class Student{
    public String name;
    public Integer score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class Class2 {
    /**
     * 定义类，属性包括姓名和成绩
     * 实现方法中：先输入人数，再输入排序策略（0或者1），输入多组人名和成绩
     * 按照排序策略进行排序输出
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            //人数
            int count = scanner.nextInt();
            //升序or降序
            int choice = scanner.nextInt();
            List<Student> list = new ArrayList<Student>();
            for (int i = 0;i < count;i++){
                list.add(new Student(scanner.next(),scanner.nextInt()));
            }
            //降序
            if (choice == 0){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score - o1.score;
                    }
                });
            }else if (choice == 1){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score - o2.score;
                    }
                });
            }
            for (int i = 0;i < list.size();i++){
                System.out.println(list.get(i).name + " " + list.get(i).score);
            }
        }
    }
}
