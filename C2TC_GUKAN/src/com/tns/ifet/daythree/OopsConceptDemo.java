package com.tns.ifet.daythree;

public class OopsConceptDemo {
	private String name;
	private int roll;
	private  String dept;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRoll() {
		return roll;
	}



	public void setRoll(int roll) {
		this.roll = roll;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public OopsConceptDemo(String name, int roll, String dept) {
		super();
		this.name = name;
		this.roll = roll;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Studend Info [name=" + name + ", roll=" + roll + ", dept=" + dept + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsConceptDemo ob = new OopsConceptDemo("Gukan",22,"IT");
		System.out.println(ob.toString());
		
		ob.setName("John Snow");
		ob.setDept("Stark");
		ob.setRoll(007);
		
		System.out.println("After Adding New Data");
		System.out.println(ob.getName());
		System.out.println(ob.getRoll());
		System.out.println(ob.getDept());
		
		
	}

}
