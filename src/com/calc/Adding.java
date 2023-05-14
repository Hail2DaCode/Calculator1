package com.calc;

public class Adding implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	public Adding() {
		super();
		this.operandOne = 1;
		this.operandTwo = 1;
		this.operation = "+";
	}
	
	public Adding(double operandOne, double operandTwo, String operation) {
		super();
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	public double  getOperandOne() {
		return operandOne;
	}
	public  void  setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public  double getOperandTwo() {
		return operandTwo;
	}
	public  void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public void performOperation(double num1, double num2, String operation) {
		this.setOperandOne(num1);
		this.setOperandTwo(num2);
		this.setOperation(operation);
		
	}
	public double getResults() {
		double result;
		if (this.getOperation() == "+") {
			result = this.getOperandOne() + this.getOperandTwo();
			return result;
		}
		else if (this.getOperation() == "-") {
			result = this.getOperandOne() - this.getOperandTwo();
			return result;
		}
		else {
			result = 0;
			return result;
		}
	}
	
	
	

	
}
