import java.util.*;

import javax.swing.JOptionPane;

public class WebLesson9_1 {
	
	
	public static void main(String[] args){
		new WebLesson9_1().start();
		
	}
	
	private void start() {
		String fibonumber = JOptionPane.showInputDialog("Enter in the term of Fibonacci's sequence you'd like to calculate.");
		int y = Integer.parseInt(fibonumber);
		
		int num = fib(y);
		JOptionPane.showMessageDialog(null, "The "+y+ " term was "+num);
	}

	public int fib(int term){
		if(term == 0){
			return 0;
		}
		if(term == 1){
			return 1;
		}
		else{
			return fib(term-1) + fib(term -2);
		}
			
	}
}
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 0;
//		for(int looper = 1; looper <= y-1; looper++){
//			num3 = num1+num2;
//			num1 = num2;
//			num2 = num3;
//		}
//		System.out.println("The term number is "+y);
//		System.out.println("The term is "+num3);
		