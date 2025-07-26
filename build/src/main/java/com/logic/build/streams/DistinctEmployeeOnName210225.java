package com.logic.build.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.logic.build.DTO.Employee;

public class DistinctEmployeeOnName210225 {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();

		Employee e1 = new Employee();

		e1.setName("Reeyansh");
		e1.setEmpId("123");
		e1.setSalary(1010);
		empList.add(e1);

		Employee e2 = new Employee();
		e2.setName("Shanaya");
		e2.setEmpId("123");
		e2.setSalary(1010);
		empList.add(e2);

		Employee e3 = new Employee();
		e3.setName("Reeyansh");
		e3.setEmpId("123");
		e3.setSalary(1010);
		empList.add(e3);

		Set<String> set = new HashSet<>(empList.size());

		List<Employee> collect = empList.stream().filter(e -> set.add(e.getName())).collect(Collectors.toList());

		//collect.stream().forEach(e -> System.out.println(e.getName()));

		//set.stream().forEach(System.out::println);

		TreeSet<Employee> collect2 = empList.stream().collect(
				Collectors.toCollection(() -> new TreeSet<Employee>((p1, p2) -> p1.getName().compareTo(p2.getName()))));
		
		collect2.stream().forEach(e -> System.out.println(e.getName()));

	}

}
