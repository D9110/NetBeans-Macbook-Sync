
package oops.project;

import java.util.Objects;
import java.util.Stack;





                                                                   //ADD EMPLOYEE DEPARTMENT WITH HASH MAP
public abstract class Employee implements java.io.Serializable {
    private static final long serialVersionUID = 1L;


    
    private String ID;
    private String name;
    private String DOB;
    private String Address;
    private String phoneNo;
    private Stack<String> positionsHeld;

    public Employee() {
        
       positionsHeld=new Stack<>();
 
    }
    
    public Employee(String ID,String name, String DOB, String Address, String phoneNo, Stack<String> positionsHeld) {
        this.ID=ID;
        this.name = name;
        this.DOB = DOB;
        this.Address = Address;
        this.phoneNo = phoneNo;
        this.positionsHeld = positionsHeld;
    
        EmployeeList.getInstance().addEmployee(this);
    
    }
    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    


    public Stack<String> getPositionsHeld() {
        return positionsHeld;
    }

    public void setPositionsHeld(Stack<String> positionsHeld) {
        this.positionsHeld = positionsHeld;
    }
    
    public void setPostionsHeld(String position)
    {
        positionsHeld.add(position);
    }
    
    public String getPositionHeld()
    {
    
    return positionsHeld.peek();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
        @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ID);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.DOB);
        hash = 97 * hash + Objects.hashCode(this.Address);
        hash = 97 * hash + Objects.hashCode(this.phoneNo);
        hash = 97 * hash + Objects.hashCode(this.positionsHeld);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.DOB, other.DOB)) {
            return false;
        }
        if (!Objects.equals(this.Address, other.Address)) {
            return false;
        }
        if (!Objects.equals(this.phoneNo, other.phoneNo)) {
            return false;
        }
        if (!Objects.equals(this.positionsHeld, other.positionsHeld)) {
            return false;
        }
        return true;
    }
    
}



class SoftwareEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    SoftwareEmployeePositions softwareEmployeePositions=SoftwareEmployeePositions.getInstance();
    
    public SoftwareEmployee() {
        super();
        EmployeeList.getInstance().addEmployee(this);
    }
    
    public int getEmployeeSalary()
    {
    
        return softwareEmployeePositions.softwareEmployeePositionsSalary.get(softwareEmployeePositions.softwareEmployeePositions.indexOf(this.getPositionHeld()));
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoftwareEmployee other = (SoftwareEmployee) obj;
        return true;
    }



}


class HardwareEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    HardwareEmployeePositions hardwareEmployeePositions=HardwareEmployeePositions.getInstance();
    
    public HardwareEmployee() {
        super();
        EmployeeList.getInstance().addEmployee(this);
    }
    public int getEmployeeSalary()
    {
    
        return hardwareEmployeePositions.hardwareEmployeePositionsSalary.get(hardwareEmployeePositions.hardwareEmployeePositions.indexOf(this.getPositionHeld()));
    
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HardwareEmployee other = (HardwareEmployee) obj;
        return true;
    }


}


class ManagementEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    ManagementEmployeePositions managementEmployeePositions=ManagementEmployeePositions.getInstance();
    
    public ManagementEmployee() {
        super();
        EmployeeList.getInstance().addEmployee(this);
    }
 
     public int getEmployeeSalary()
    {
    
        return managementEmployeePositions.managementEmployeePositionsSalary.get(managementEmployeePositions.managementEmployeePositions.indexOf(this.getPositionHeld()));
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ManagementEmployee other = (ManagementEmployee) obj;
        return true;
    }
     
     
    
}