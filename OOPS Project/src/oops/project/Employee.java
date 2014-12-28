
package oops.project;

import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;

 
public interface Employee extends Serializable {

    boolean equals(Object obj);

    String getAddress();

    String getDOB();

    String getID();

    String getName();

    String getPhoneNo();

    String getPositionHeld();

    Stack<String> getPositionsHeld();

    int hashCode();

    void setAddress(String Address);

    void setDOB(String DOB);

    void setID(String ID);

    void setName(String name);

    void setPhoneNo(String phoneNo);

    void setPositionsHeld(Stack<String> positionsHeld);

    void setPostionsHeld(String position);
    
}



                                                                   //ADD EMPLOYEE DEPARTMENT WITH HASH MAP
 abstract class AbstractEmployee implements Employee {
    private static final long serialVersionUID = 1L;


    
    private String ID;
    private String name;
    private String DOB;
    private String Address;
    private String phoneNo;
    private Stack<String> positionsHeld;

    public AbstractEmployee() {
        
        ID = "'";
        name = "";
        DOB = "";
        Address = "";
        phoneNo = "";
        
        
       positionsHeld=new Stack<>();
 
    }
    
    public AbstractEmployee(String ID,String name, String DOB, String Address, String phoneNo, Stack<String> positionsHeld) {
        this.ID=ID;
        this.name = name;
        this.DOB = DOB;
        this.Address = Address;
        this.phoneNo = phoneNo;
        this.positionsHeld = positionsHeld;
    
        EmployeeList.getInstance().addEmployee(this);
    
    }
    
    
    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }
    
    


    @Override
    public Stack<String> getPositionsHeld() {
        return positionsHeld;
    }

    @Override
    public void setPositionsHeld(Stack<String> positionsHeld) {
        this.positionsHeld = positionsHeld;
    }
    
    @Override
    public void setPostionsHeld(String position)
    {
        positionsHeld.add(position);
    }
    
    @Override
    public String getPositionHeld()
    {
    
    return positionsHeld.peek();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDOB() {
        return DOB;
    }

    @Override
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
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
        final AbstractEmployee other = (AbstractEmployee) obj;
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



class SoftwareEmployee extends AbstractEmployee
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


class HardwareEmployee extends AbstractEmployee
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


class ManagementEmployee extends AbstractEmployee
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