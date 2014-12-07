package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface HR {

    void takeInterviews(List<Employee> employeeList);

    void doPromotions(List<Employee> employeeList, List<Boolean> promotionStatus);

    void setEmployeeInfo(Employee employee, HumanResource.EmployeeInfo... employeeInfo);

    void getEmployeeInfo(Employee employee, HumanResource.EmployeeInfo... employeeInfo);

}

abstract class HumanResource implements HR {

    @Override
    public void takeInterviews(List<Employee> employeeList) {

        List<Boolean> promotionStatus = new ArrayList<>();
        Boolean passed = true;

        employeeList.stream().forEach((_item) -> {
            if (passed) {
                promotionStatus.add(passed);
            } else {
                promotionStatus.add(!passed);
            }
        });

        doPromotions(employeeList, promotionStatus);

    }

    @Override
    public void doPromotions(List<Employee> employeeList, List<Boolean> promotionStatus) {

        HardwareEmployeePostions hardwareEmployeePostions = HardwareEmployeePostions.getInstance();
        ManagementEmployeePositons managementEmployeePositons = ManagementEmployeePositons.getInstance();
        SoftwareEmployeePostions softwareEmployeePostions = SoftwareEmployeePostions.getInstance();

        Iterator<Employee> employeeIterator = employeeList.iterator();

        for (Boolean promotion : promotionStatus) {
            Employee employee = employeeIterator.next();

            if (promotion) {

                if (employee.getClass() == SoftwareEmployee.class) {

                    employee.setPostionsHeld(softwareEmployeePostions.softwareEmployeePositions.get(softwareEmployeePostions.softwareEmployeePositions.indexOf(employee.getPositionsHeld().peek()) + 1));

                }

                if (employee.getClass() == HardwareEmployee.class) {
                    employee.setPostionsHeld(hardwareEmployeePostions.hardwareEmployeePositions.get(hardwareEmployeePostions.hardwareEmployeePositions.indexOf(employee.getPositionsHeld().peek()) + 1));
                }

                if (employee.getClass() == ManagementEmployee.class) {
                    employee.setPostionsHeld(managementEmployeePositons.managementEmployeePositons.get(managementEmployeePositons.managementEmployeePositons.indexOf(employee.getPositionsHeld().peek()) + 1));

                }
            }

        }
    }

    @Override
    public void setEmployeeInfo(Employee employee, EmployeeInfo... employeeInfo) {

    }

    @Override
    public void getEmployeeInfo(Employee employee, EmployeeInfo... employeeInfo) {

    }

    protected static class EmployeeInfo {

        String key;
        String value;
    }

}
