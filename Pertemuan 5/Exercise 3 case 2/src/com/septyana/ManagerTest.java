package com.septyana;

public class ManagerTest{
	public static void main (String[] args){
		Sortable[] staff = new Employee[3];
		staff[0] = new Employee("Antonio Rossi", 2500000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 2100000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);
		Sortable.shell_sort(staff);
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
	}
}