package PENG.ploymorphism.employee;

public class HourlyEmployee extends Employee {
   private double hourlywage; // wage per hour
   private double hours; // hours worked for week
   private double extraHourRate;
   private double maxWorkedHours=80;
   private double maxRate=2.0;
   private double minRate=1.0;
   private double normalWH=40.0;

   // constructor
   public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber, double hourlyWage, double hours, boolean _isSimpleFormat) {
      super(firstName, lastName, socialSecurityNumber, _isSimpleFormat);

      if (hourlyWage < 0.0) { // validate wage
         throw new IllegalArgumentException("Hourly wage must be >= 0.0");
      }

      if ((hours < 0.0) || (hours > maxWorkedHours)) { // validate hours
         throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= maxWorkedHours");
      }
      
      if((extraHourRate < minRate/*0.0*/) || (extraHourRate > maxRate/*1.0*/)) {//validate hours
    	  throw new IllegalArgumentException("Extra-Hour Rate must be must be >="+minRate+" and <="+maxRate);
      }

      this.hourlywage = hourlyWage;
      this.hours = hours;
      this.extraHourRate=extraHourRate;
   } 

   // set wage
   public void setWage(double wage) {
      if (wage < 0.0) { // validate wage
         throw new IllegalArgumentException("Hourly wage must be >= 0.0");
      }

      this.hourlywage = wage;
   } 

   // return wage
   public double getHourlyWage() {
	   return hourlywage;
	   }

   // set hours worked
   public void setHours(double hours) {
      if ((hours < 0.0) || (hours > 168.0)) { // validate hours
         throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= maxWorkedHours");
      }

      this.hours = hours;
   } 

   // return hours worked
   public double getHours() {
	   return hours;
	   }
   
   // set base salary
   public void setExtraHourRate(double extraHourRate) {
	   if(extraHourRate < minRate*1.5) {//validate baseSalary
		   throw new IllegalArgumentException("Extra-Hour Rate must be >= 1.5*miniRate");
	   }
	   
	   this.extraHourRate=extraHourRate;
   }

   // return base salary
   public double getExtraHourRate() {
	   return extraHourRate;
   }
   
   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings() {                                          
      if (getHours() <= normalWH/*40*/) { // no overtime                           
         return getHours() * getHourlyWage();                                
      }else {                                                           
         return normalWH * getHourlyWage() + (getHours() - normalWH) * getExtraHourRate();  
      }                                                                
   }                                                                   

   // return String representation of HourlyEmployee object              
   @Override                                                             
   public String toString() {                                            
      return String.format(
    		  isSimpleFormat ? ("\n%10s\t%50s\t%15.2f\t%15.2f\t%15.2f\t%15.2f")
    				         : ("\n%10s\t%50s\t%15.2f\t%15.2f\t%15.2f\t%15.2f"),
    		  "H-Employee",super.toString(),getHourlyWage(),getHours(),getExtraHourRate(),earnings());                                  
   }       
   
   // return String representation of HourlyEmployee object              
   @Override 
   public String toString2() {
	   return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f %s: %,.2f",super.toString(),"hourly wage",
			   getHourlyWage(),"hours worked",getHours(),"rate",getExtraHourRate());
   }
   
   @Override 
   public String toString3() {
	   return String.format("\r\n%10s, %s, %,15.2f, %15.2f, %15.2f, %15.2f","H=Employee",super.toString3(),
			   getHourlyWage(), getHours(),getExtraHourRate(),earnings());
   }   
} 






