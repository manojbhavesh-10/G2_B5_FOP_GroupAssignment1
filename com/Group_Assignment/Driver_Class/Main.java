package com.Group_Assignment.Driver_Class;

import com.Group_Assignment.model.AdminDepartment;
import com.Group_Assignment.model.HRDepartment;
import com.Group_Assignment.model.SuperDepartment;
import com.Group_Assignment.model.TechDepartment;

import java.util.Scanner;

public class Main { // Driver class
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option;

        SuperDepartment parent = new SuperDepartment(); // base class

        SuperDepartment admin = new AdminDepartment();
        HRDepartment hr = new HRDepartment();
        TechDepartment tech = new TechDepartment();


            System.out.println("Enter the operation number you want to know department details ");
            System.out.println("1. Admin, HR and Tech departments\n2. Including Super and Other departments (optional)");

            option = in.nextInt();

            System.out.println();

            switch (option) {

                case 1: {
                    System.out.println(" Welcome to " + admin.departmentName());
                    System.out.println(admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n" + admin.isTodayAHoliday());
                    System.out.println();

                    System.out.println(" Welcome to " + hr.departmentName());
                    System.out.println(hr.doActivity() + "\n" + hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayAHoliday());
                    System.out.println();

                    System.out.println(" Welcome to " + tech.departmentName());
                    System.out.println(tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n" + tech.getStackInformation() + "\n" + tech.isTodayAHoliday());

                    break;
                }

                case 2: {
                    System.out.println(" Welcome to " + parent.departmentName());
                    System.out.println(parent.getTodaysWork() + "\n" + parent.getWorkDeadline() + "\n" + parent.isTodayAHoliday());
                    System.out.println();

                    System.out.println(" Welcome to " + admin.departmentName());
                    System.out.println(admin.getTodaysWork() + "\n" + admin.getWorkDeadline() + "\n" + admin.isTodayAHoliday());
                    System.out.println();

                    System.out.println(" Welcome to " + hr.departmentName());
                    System.out.println(hr.doActivity() + "\n" + hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayAHoliday());
                    System.out.println();

                    System.out.println(" Welcome to " + tech.departmentName());
                    System.out.println(tech.getTodaysWork() + "\n" + tech.getWorkDeadline() + "\n" + tech.getStackInformation() + "\n" + tech.isTodayAHoliday());

                    break;

                }

                default:
                    System.out.println("Enter valid option");
            }

    }
}
