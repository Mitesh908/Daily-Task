package inheritance.strategy.demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Salaried")
public class SalariedEmployee extends Employee
{
    private double salary;
    public SalariedEmployee() {}
	public SalariedEmployee(int employeeId,String employeeName,double salary) {
		super(employeeId,employeeName);
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
    
}
