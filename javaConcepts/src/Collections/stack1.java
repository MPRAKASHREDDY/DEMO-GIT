package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scan=new Scanner(System.in);
//		Stack st=new Stack();
//		st.push(10);
//		st.push(20);
//		st.push(30);
////		System.out.println(st);
////		System.out.println(st.peek());
//		st.remove(0);
//		System.out.println(st);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        System.out.println("Enter 3 integers to push into the stack:");
        for (int i = 0; i < 3; i++) {
            int value = Integer.parseInt(reader.readLine()); // Reading input as a string and parsing to integer
            st.push(value);
        }

        System.out.println("Stack after pushing elements: " + st);
	}

}
