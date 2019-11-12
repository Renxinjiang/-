package d5;

import java.util.Stack;

/**
 * @PackageName: d5
 * @ClassName: Class2
 * @Description:
 * @author: 呆呆
 * @date: 2019/11/10
 */
public class Class2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty() && stack1.empty()){
            return -1;
        }
        if (!stack2.empty()){
            return stack2.pop();
        }else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
