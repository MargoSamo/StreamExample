package com.mariia.stream;

import java.util.*;
import java.util.stream.Collectors;


public class Solution {

    public static void main(String[] args) {
        var employees = new ArrayList<Employee>();
        Collections.addAll(employees,
                new Employee(10000, 5),
                new Employee(4000, 3),
                new Employee(2000, 1),
                new Employee(22000, 15),
                new Employee(7000, 4),
                new Employee(5000, 5));

        var filtered = employees.stream()
                .filter(years -> (years.getYears() < 4))
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);

        System.out.println( );

        var filtered1 = employees.stream()
                .filter(salary -> (salary.getSalary() > 4000))
                .collect(Collectors.toList());
        filtered1.forEach(System.out::println);

        System.out.println( );

        var filtered3 = employees.stream()
                .filter(years -> (years.getYears() == 5))
                .collect(Collectors.toList());
        filtered3.forEach(System.out::println);

        System.out.println( );

        var filtered4 = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println(filtered4);

        System.out.println( );


        /*List<Employee> newEmployees = employees.stream().map(e ->
        {
            e.setSalary(e.getSalary());
            return e;
        }).collect(Collectors.toList());

        System.out.println(newEmployees);*/

        Map<Integer, Set<Integer>> map = employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getYears,
                        Collectors.mapping(Employee::getSalary, Collectors.toSet())
                ));
        System.out.println(map);

    }
}

