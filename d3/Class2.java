package d3;

import java.util.Stack;

/**
 * @PackageName: d3
 * @ClassName: Class2
 * @Description:
 * [编程题]36939-合法括号序列判断
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false
 * 链接:https://www.nowcoder.com/questionTerminal/d8acfa0619814b2d98f12c071aef20d4
 * @author: 呆呆
 * @date: 2019/11/9
 */
public class Class2 {
    /**
     * 用栈解决：
     * 遇到左括号就入栈，
     * 若字符不是括号，返回false
     * 遇到右括号出栈，
     * 若出栈时栈为空则返回false，
     * 字符串遍历完，栈不空返回false
     * 否则返回true
     */
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < A.length();i++){
            if (A.charAt(i) == '(' ){
                stack.push(A.charAt(i));
            }else if (A.charAt(i) == ')'){
                if (stack.empty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
