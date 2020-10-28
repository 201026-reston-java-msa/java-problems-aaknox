package com.revature.eval.java.core;

public class Driver {

	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();
		String[] words = { "fair", "away", "test" };
		  for (String word : words) {
		    String s = es.toPigLatin(word);
		    System.out.println(word + " is " + s);
		  }
	}

}
