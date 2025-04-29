import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int command_length = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < command_length; i++) {
            int command = sc.nextInt();
            if (command == 0) {
                stack.pop();
            } 
            else {
                stack.push(command);
            }
        }

        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        System.out.println(sum);
    }
}
