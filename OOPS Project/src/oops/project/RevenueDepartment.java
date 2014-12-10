

package oops.project; 

public interface RevenueDepartment {
    
    void calculateProfit();
    void calculateLoss();
    void calculateNetRevenues();
    void calculateImplicitCosts();
    void calculateExplicitCosts();
    void calculateTotalEquity();
    void calculateTotalShares();
    void calculateNetIncome();
    void calculateNetAssets();
    void calculateAssetsBought();
    void calculateAssetsSold();
    void calculateNetSalaryPaid();
    
    
}

class Revenue implements RevenueDepartment
{

    private int profit;
    private int loss;
    private int NetRevenues;
    private int implicitCosts;
    private int explicitCosts;
    private int totalEquity;
    private int totalShares;
    private int netIncome;
    private int netAssets;
    private int assetsBought;
    private int assetsSold;
    private int netSalaryPaid;
    
    
    ProductList productList=ProductList.getInstance();
    EmployeeList employeeList=EmployeeList.getInstance();

    
    @Override
    public void calculateProfit() {
        
    profit=netIncome-netSalaryPaid;
        
    }

    @Override
    public void calculateLoss() {
       
    }

    @Override
    public void calculateNetRevenues() {
      
    }

    @Override
    public void calculateImplicitCosts() {
        
     for(Product product:productList)  
     implicitCosts+=product.getInPrice();
     
    // for(Employee employee:employeeList)
     //implicitCosts+=
       
    }

    @Override
    public void calculateExplicitCosts() {
       
    }

    @Override
    public void calculateTotalEquity() {
       
    }

    @Override
    public void calculateTotalShares() {
        
    }

    @Override
    public void calculateNetIncome() {
       
    }

    @Override
    public void calculateNetAssets() {
        
    }

    @Override
    public void calculateAssetsBought() {
       
    }

    @Override
    public void calculateAssetsSold() {
       
    }

    @Override
    public void calculateNetSalaryPaid() {
       
    }

    public int getProfit() {
        return profit;
    }

    public int getLoss() {
        return loss;
    }

    public int getNetRevenues() {
        return NetRevenues;
    }

    public int getImplicitCosts() {
        return implicitCosts;
    }

    public int getExplicitCosts() {
        return explicitCosts;
    }

    public int getTotalEquity() {
        return totalEquity;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public int getNetIncome() {
        return netIncome;
    }

    public int getNetAssets() {
        return netAssets;
    }

    public int getAssetsBought() {
        return assetsBought;
    }

    public int getAssetsSold() {
        return assetsSold;
    }

    public int getNetSalaryPaid() {
        return netSalaryPaid;
    }

}