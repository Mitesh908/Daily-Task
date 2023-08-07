package inheritance.strategy.demo.entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("HourlyWages")
public class HourlyWagesEmployee extends Employee
{
	   @Column(name="no_hour")
	   private int noOfHours;
	   
	   @Column(name="rate_hour")
	   private double ratePerHours;
	   
	   public HourlyWagesEmployee() {}
	   
	   public HourlyWagesEmployee(int employeeId,String employeeName,int noOfHours,double ratePerHour)
	   {
		   super(employeeId,employeeName);
		   this.noOfHours=noOfHours;
		   this.ratePerHours=ratePerHour;
	   }

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public double getRatePerHours() {
		return ratePerHours;
	}

	public void setRatePerHours(int ratePerHours) {
		this.ratePerHours = ratePerHours;
	}
	   
	   
}


