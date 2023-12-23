package PENG.ploymorphism.employee;

public class CommissionEmployee extends Employee {
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // constructor
   public CommissionEmployee(String firstName, String lastName, 
		      String socialSecurityNumber, boolean isSimpleFormat,double grossSales, double commissionRate) {
		      super(firstName, lastName, socialSecurityNumber, isSimpleFormat);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      if (grossSales < 0.0) { // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) { // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {return grossSales;}

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {return commissionRate;}

   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings() {                                          
      return getCommissionRate() * getGrossSales();                    
   }                                                                   

   @Override                                                   
   public String toString() {   
	   return String.format(
    		  isSimpleFormat?("\r\n%10s\t%50s\t%15.2f\t%15.2f\t%15.2f") //Method1
    				        :("\r\n%10s\t%50s,15.2f\t%15.2f\t%15.2f"),  //Method2"\r\n%s\t%s\t$%,-10.2f\t%-10.2f\t%-10.2f"
    				        "C-Employee",super.toString(),getGrossSales(),getCommissionRate(),earnings());
   } 
   
   @Override 
   public String toString2(){
	   return String.format("%s: %s%n%s: $%,10.2f; %s: %.2f",
			   "C-employee",super.toString(),
			   "gross sales",getGrossSales(),
			   "commission rate",getCommissionRate());
   }
   
   
   @Override 
    public String toString3(){
	   return String.format("\r\n%10s,%s, %,15.2f, %15.2f, %15.2f","C-Employee",super.toString3(),getGrossSales(),
			   getCommissionRate(),earnings());
    }
} 