
package oops.project;

import java.util.ArrayList;
import java.util.List;
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
    
    
    
}



class SoftwareEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    public SoftwareEmployee() {
        super();
    }


}


class HardwareEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    public HardwareEmployee() {
        super();
    }


}


class ManagementEmployee extends Employee
{
    private static final long serialVersionUID = 1L;

    public ManagementEmployee() {
        super();
    }


}