
package oops.project;

import java.util.List;
                                                            //ADD EMPLOYEE DEPARTMENT WITH HASH MAP
public class Employee implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    private String ID;
    private String name;
    private String DOB;
    private String Address;
    private String phoneNo;
    private List<String> positionsHeld;

    
    public Employee(String ID,String name, String DOB, String Address, String phoneNo, List<String> positionsHeld) {
        this.ID=ID;
        this.name = name;
        this.DOB = DOB;
        this.Address = Address;
        this.phoneNo = phoneNo;
        this.positionsHeld = positionsHeld;
    }

    public List<String> getPositionsHeld() {
        return positionsHeld;
    }

    public void setPositionsHeld(List<String> positionsHeld) {
        this.positionsHeld = positionsHeld;
    }
    
    public void setPostionsHeld()
    {
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
