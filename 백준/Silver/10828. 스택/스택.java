import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int command_length = sc.nextInt();
        String command;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < command_length; i++) {
            command = sc.next();  

            switch (command) {
                case "push":
                    int push_num = sc.nextInt();
                    stack.push(push_num);
                    break;

                case "pop":
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.empty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;

                case "top":
                    if (stack.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
    }
}
