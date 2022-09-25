package com.oops;


import java.util.*;

public class Employee_inheritance {
    public static void main(String[] args) {
//        Employee suren = new Employee("suren", 65000, 1234);
//        System.out.println(suren.getSalary());
//        Bonus surenkumar = new Bonus("suren", 65000, 1234);
//        surenkumar.raiseSalary(10);
//        surenkumar.setBonus(200000);
//        System.out.println(surenkumar.getSalary());
//        Employee m = new Bonus("suren", 100000, 1234);

        Employee[] arr = new Employee[4];
        arr[0] = new Bonus("suren", 1000, 123, 20);
        arr[1] = new Bonus("kili", 2000, 124, 20);
        arr[2] = new Bonus("subash", 3000, 125, 20);
        arr[3] = new Bonus("maaran", 4000, 126, 20);
//        arr[4] = new Employee("Thanika", 4000, 127);

        for (Employee e : arr) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
        Arrays.sort(arr);
        System.out.println("---------------------------------");
        for (Employee e : arr) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}

// Inheritance ,dynamic binding
class Employee {
    private String name;
    protected double Salary;
    private int Id_card_No;

    Employee(String name, double Salary, int Id_card) {
        this.name = name;
        this.Salary = Salary;
        this.Id_card_No = Id_card;
    }

    Employee() {
        this.name = "";
        this.Salary = 0;
        this.Id_card_No = 0;
    }

    public double getSalary() {
        return Salary;
    }

    public int getId_card_No() {
        return Id_card_No;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public void setId_card_No(int Id) {
        this.Id_card_No = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(double per) {
        Salary += (Salary * per) / 100;
    }
}

class Bonus extends Employee implements Comparable<Bonus>{
    public double getBonus() {
        return bonus;
    }

    Bonus(double data) {
        setBonus(data);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    double bonus;

    Bonus(String name, double Salary, int Id_card, double data) {
        super(name, Salary, Id_card);
        setBonus(data);
    }

    @Override
    public int compareTo(Bonus o) {
        if(this.getName().equals(o.getName()))
            return 0;
        else if (this.getName().charAt(0) > o.getName().charAt(0)) {
            return 1;
        }
        return (int)this.Salary - (int)o.getSalary();
    }
}

