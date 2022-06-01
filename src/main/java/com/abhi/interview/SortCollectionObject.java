package com.abhi.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollectionObject {
    // List<Emp> emp = new ArrayList<>;
    public static void main(String[] args) {
        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp("Abhinav", 32, 10000));
        emp.add(new Emp("Abhinav", 36, 5000));
        emp.add(new Emp("Abhinav", 28, 95000));

        List<Emp> emp2 = new ArrayList<>();
        emp2.add(new Emp("Abhinav", 32, 10000));
        emp2.add(new Emp("Abhinav", 36, 5000));
        emp2.add(new Emp("Abhinav", 28, 95000));

        List<Emp> emp3 = new ArrayList<>();
        emp3.add(new Emp("Abhinav", 32, 10000));
        emp3.add(new Emp("Abhinav", 36, 5000));
        emp3.add(new Emp("Abhinav", 28, 95000));

        emp.stream().sorted(Emp::compareTo).forEach(System.out::println);
        emp2.stream().sorted().forEach(System.out::println);

        emp3.stream().sorted(Comparator.comparing(Emp::getAge)).forEach(System.out::println);

        Collections.sort(emp3, new EmpAgeComp());
    }
}

class EmpDepComp implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getDeptId() - o2.getDeptId();
    }
}

class EmpAgeComp implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getAge() - o2.getAge();
    }
}

class Emp implements Comparable<Emp> {
    private String name;
    private int age;
    private int deptId;

    public Emp(String name, int age, int deptId) {
        this.name = name;
        this.age = age;
        this.deptId = deptId;
    }

//    public Emp getInstance() {
//        synchronized (emp) {
//            if (emp.getInstance() != null) {
//                emp = new Emp("Abhinav", 32, 10000);
//            }
//            return emp;
//        }
//
//    }

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

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptId=" + deptId +
                '}';
    }

    @Override
    public int compareTo(Emp o) {
        return this.getDeptId() - o.getDeptId();
    }
}
