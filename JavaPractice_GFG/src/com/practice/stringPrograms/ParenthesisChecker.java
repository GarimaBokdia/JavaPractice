package com.practice.stringPrograms;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given an expression string exp. Examine whether the pairs and the orders of
 * â€œ{â€œ,â€�}â€�,â€�(â€œ,â€�)â€�,â€�[â€œ,â€�]â€� are correct in exp. For example, the program should
 * print 'balanced' for exp = â€œ[()]{}{[()()]()}â€� and 'not balanced' for exp =
 * â€œ[(])â€�
 * 
 * Input: The first line of input contains an integer T denoting the number of
 * test cases. Each test case consists of a string of expression, in a separate
 * line.
 * 
 * Output: Print 'balanced' without quotes if the pair of parenthesis is
 * balanced else print 'not balanced' in a separate line.
 * 
 * Constraints: 1 â‰¤ T â‰¤ 100 1 â‰¤ |s| â‰¤ 105
 * 
 * Example: Input: 3 {([])} () ([]
 * 
 * Output: balanced balanced not balanced
 * 
 * @author garijain 1. Use the help of stack. 2 Push the element into the stack.
 *         Pop the element from the stack if the top of stack has the opposite
 *         parenthesis. At the end check if the stack size is empty or not. The
 *         answer is balanced if stack is empty or else it is unbalanced .
 */
public class ParenthesisChecker {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int testcase = s.nextInt();
		for (int i = 0; i < testcase; i++) {
			String inString = s.next();
			boolean balancedFlag = true;
			Stack<Character> stack = new Stack<Character>();
			if (inString.charAt(0) == '}' || inString.charAt(0) == ']' || inString.charAt(0) == ')') {
				balancedFlag = false;
			} else {
				for (int j = 0; j < inString.length(); j++) {
					char c = inString.charAt(j);
					
					if (c == '(' || c == '{' || c == '[') {
						stack.push(c);
					} else {
						if (!stack.isEmpty()) {
							char c1 = stack.peek();

							if (c1 == '(' && c == ')') {
								stack.pop();
								continue;
							} else if (c1 == '[' && c == ']') {
								stack.pop();
								continue;
							} else if (c1 == '{' && c == '}') {
								stack.pop();
								continue;
							} else {
								balancedFlag = false;
								break;
							}
						}
					}
					System.out.println(stack.toString());
				}
			}
			if (balancedFlag == true && stack.isEmpty()) {
				System.out.println("balanced");
			} else {
				System.out.println("not balanced");
			}
		}
	}
}
