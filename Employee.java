// Fig. 10.4: Employee.java

package PENG.ploymorphism.employee;

import java.awt.Color;
import java.io.Serializable;

public abstract class Employee implements Serializable {
	   private final String firstName;
	   private final String lastName;
	   private final String socialSecurityNumber;
	   
	   private String levelLetter;
	   private Color indexColor;
	   public boolean isSimpleFormat=true;

	   // constructor
	   public Employee(String firstName, String lastName, 
	      String socialSecurityNumber, boolean isSimpleFormat) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.socialSecurityNumber = socialSecurityNumber;
	      isSimpleFormat=isSimpleFormat;
	   } 

	   // return first name
	   public String getFirstName() {return firstName;}

	   // return last name
	   public String getLastName() {return lastName;}

	   // return social security number
	   public String getSocialSecurityNumber() {return socialSecurityNumber;}
	   
	   
	   public void setLevel(String levelLetter) {
		   levelLetter = levelLetter;
	   }

	   public String getLevel() {
		   return levelLetter;
	   }
	   
	   public void setColor(Color index4Color) {
		   indexColor = index4Color;
	   }
	   
	   public Color getColor() {
		   return indexColor;
	   }
	   
	   // return String representation of Employee object
	   @Override
	   public String toString() {
	      return String.format("%15s\t%15s\t%15s", 
	         getFirstName(), getLastName(), getSocialSecurityNumber());
	   }
	   
	   public String toString2() {
		   return String.format("\r%15s %15s%nsocial security number: %s",
				   getFirstName(),getLastName(), getSocialSecurityNumber());
	   }
	   
	   public String toString3() {
		   return String.format("%15s, %15s, %15s", getFirstName(),getLastName(), getSocialSecurityNumber());
	   }

	   // abstract method must be overridden by concrete subclasses
	   public abstract double earnings(); // no implementation here
	} 

