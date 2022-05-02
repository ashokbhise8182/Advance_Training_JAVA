package com.problem_statement6_3;
import java.util.Vector;

public class TestEmployee {
public static void main(String[] args) {
	Vector<Employee> v = addInput();
	display(v);
}

private static Vector<Employee> addInput() {
	// TODO Auto-generated method stub
	Employee e1 = new Employee(101,"Ashok  :","Pune") ;
	Employee e2 = new Employee(102,"Sharvari :","Delhi") ;
	Employee e3 = new Employee(103,"Kaveri :","Mumbai") ;
	Vector<Employee> v = new Vector<Employee>();
	v .add(e1);
	v.add(e2);
	v.add(e3);
	return v;
}

private static void display(Vector<Employee> v) {
	// TODO Auto-generated method stub
	for(Employee e:v)
	{
		System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
	}
}
}