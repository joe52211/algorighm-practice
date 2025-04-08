import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
        c = sc.nextInt();
        String num = Integer.toString(a*b*c);
        
        for (int i = 0; i < 10; i++){
            int count = 0;
            char num_check = (char)(i + '0'); 
            
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == num_check) {  
                    count++;  
                }
            }
            System.out.println(count);
        }
    }
}