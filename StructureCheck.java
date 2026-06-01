import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class StructureCheck {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Queue<String> q = new LinkedList<>();

        s.push("Action 1");
        s.push("Action 2");
        s.push("Action 3");

        q.add("Action 1");
        q.add("Action 2");
        q.add("Action 3");

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.pop());
            System.out.println(q.poll());
        }
    }
}
