package com.masai.q3;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	
	
	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}

	@Override
	public int compareTo(Student s)
	{
		double marks=this.engMarks+this.engMarks+this.scienceMarks;
		double m2=s.mathsMarks+s.engMarks+s.scienceMarks;
		if(marks<m2)return 1;
		else if(marks==m2)
		{
			if(this.name.equals(s.name))
			{
				if(this.rollNo<s.rollNo)return 1;
				else return -1;
			}else return(s.name.compareTo(this.name));
		}
		else return -1;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}



}
