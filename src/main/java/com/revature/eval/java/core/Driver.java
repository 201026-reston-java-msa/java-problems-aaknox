package com.revature.eval.java.core;

public class Driver {

	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
		String s = "What is 1 plus 1?";
		int answer = es.solveWordProblem(s);
		System.out.println("Answer: " + answer);
	}

}
