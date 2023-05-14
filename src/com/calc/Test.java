package com.calc;

public class Test {

	public static void main(String[] args) {
		Adding calculation1 = new Adding(500, 450, "+");
		System.out.println(calculation1.getResults());
		calculation1.performOperation(4542.5, 700.54, "-");
		calculation1.getResults();
		System.out.println(calculation1.getResults());
	}

}
