import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int command_length = sc.nextInt();
        String command;
        Queue<Integer> queue = new LinkedList<>();
        int last = -1; 

        for (int i = 0; i < command_length; i++) {
            command = sc.next();

            switch (command) {
                case "push":
                    int push_num = sc.nextInt();
                    queue.add(push_num);
                    last = push_num; 
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.remove());
                    }
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    System.out.println(queue.isEmpty() ? "1" : "0");
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(last); 
                    }
                    break;
            }
        }
    }
}
