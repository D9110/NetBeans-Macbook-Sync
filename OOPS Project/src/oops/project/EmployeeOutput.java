package oops.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class EmployeeOutput<T extends Employee> {

    void getOutput(T employee) {

        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

        employee.getID();
        employee.getName();
        employee.getAddress();
        employee.getDOB();
        employee.getPhoneNo();

        Stack<String> employeePositions = employee.getPositionsHeld();

        for (String s : employeePositions) {
            System.out.println(s);
        }

        if (employee.getClass() == SoftwareEmployee.class) {

            SoftwareEmployee softwareEmployee=(SoftwareEmployee) employee;
            
            
        }

        if (employee.getClass() == HardwareEmployee.class) {

            HardwareEmployee hardwareEmployee=(HardwareEmployee) employee;
            
            
        }

        if (employee.getClass() == ManagementEmployee.class) {
            
            ManagementEmployee mangementEmployee=(ManagementEmployee) employee;

        }
    }
}
