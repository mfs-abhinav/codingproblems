package com.abhi.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterCollectionUsingLambda {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Abhi1", 31, 4500),
                new Employee("Abhi2", 33, 3500),
                new Employee("Abhi3", 35, 5500),
                new Employee("Abhi4", 37, 4000),
                new Employee("Abhi5", 38, 3000));

        Predicate<Integer> salFilter = (x) -> x > 4000;

        // filter employee having salary more than 4000
        for (Employee e : emps) {
            if (salFilter.test(e.getSalary())) {
                System.out.println(e);
            }
        }

    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
