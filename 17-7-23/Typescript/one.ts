
class Employee {
private empid:number ; 
private ename:string;
private salary:number;
public constructor(empid:number , ename:string ,salary:number)
{
this.empid = empid ; this.ename=ename; this.salary=salary; 
}

public getEmpid() : number
{
return this.empid ; 
}
public getEname() :string 
{
return this.ename ; 
}
public getSalary() : number 
{
return this.salary ; 
}
}
let emp = new Employee(101 , "DK" , 25000);
console.log("empid  :- " + emp.getEmpid());
console.log("empid  :- " + emp.getEname());
console.log("empid  :- " + emp.getSalary());
