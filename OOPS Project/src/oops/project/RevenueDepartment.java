

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
    private final int loss;
    private final int NetRevenues;
    private int implicitCosts;
    private final int explicitCosts;
    private final int totalEquity;
    private final int totalShares;
    private final int netIncome;
    private final int netAssets;
    private final int assetsBought;
    private final int assetsSold;
    private final int netSalaryPaid;

    public Revenue(int profit, int loss, int NetRevenues, int implicitCosts, int explicitCosts, int totalEquity, int totalShares, int netIncome, int netAssets, int assetsBought, int assetsSold, int netSalaryPaid) {
        this.profit = profit;
        this.loss = loss;
        this.NetRevenues = NetRevenues;
        this.implicitCosts = implicitCosts;
        this.explicitCosts = explicitCosts;
        this.totalEquity = totalEquity;
        this.totalShares = totalShares;
        this.netIncome = netIncome;
        this.netAssets = netAssets;
        this.assetsBought = assetsBought;
        this.assetsSold = assetsSold;
        this.netSalaryPaid = netSalaryPaid;
    }

    public Revenue() {
        loss = 0;

        profit = 0;
       
        NetRevenues = 0;
        implicitCosts = 0;
        explicitCosts = 0;
        totalEquity = 0;
        totalShares = 0;
        netIncome = 0;
        netAssets = 0;
        assetsBought = 0;
        assetsSold = 0;
        netSalaryPaid = 0;

    }
    
    
    
    
    
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