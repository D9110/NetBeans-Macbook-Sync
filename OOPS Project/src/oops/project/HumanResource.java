package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface HumanResource {

    void takeInterviews(List<Employee> employeeList);

    void doPromotions(List<Employee> employeeList, List<Boolean> promotionStatus);

    void setEmployeeInfo(Employee employee, AbstractHumanResource.EmployeeInfo... employeeInfo);

    void getEmployeeInfo(Employee employee, AbstractHumanResource.EmployeeInfo... employeeInfo);

}

abstract class AbstractHumanResource implements HumanResource {

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

        HardwareEmployeePositions hardwareEmployeePostions = HardwareEmployeePositions.getInstance();
        ManagementEmployeePositions managementEmployeePositions = ManagementEmployeePositions.getInstance();
        SoftwareEmployeePositions softwareEmployeePostions = SoftwareEmployeePositions.getInstance();

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
                    employee.setPostionsHeld(managementEmployeePositions.managementEmployeePositions.get(managementEmployeePositions.managementEmployeePositions.indexOf(employee.getPositionsHeld().peek()) + 1));

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
