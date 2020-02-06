package Patterns.Structural.Composite;

import java.util.ArrayList; 
import java.util.List; 

//A common interface for all employee as well as group of employee (aka Company Directory)
interface Employee 
{ 
	// Here we are using just showing the details. But in real life, this may be calculating cost etc
	public void showEmployeeDetails(); 
} 

class Developer implements Employee 
{ 
	private String name; 
	private long empId; 
	private String position; 
	
	public Developer(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
		this.position = position; 
	} 
	
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" " +name+ " " + position ); 
	} 
} 

class Manager implements Employee 
{ 
	private String name; 
	private long empId; 
	private String position; 

	public Manager(long empId, String name, String position) 
	{ 
		this.empId = empId; 
		this.name = name; 
		this.position = position; 
	} 
	
	public void showEmployeeDetails() 
	{ 
		System.out.println(empId+" " +name+ " " + position ); 
	} 
} 


//Class for a group of Employees will also implement the same interface
class Company implements Employee 
{ 
	private List<Employee> employeeList = new ArrayList<Employee>(); 		

	public void showEmployeeDetails() 
	{ 
		for(Employee emp:employeeList) 
		{ 
			emp.showEmployeeDetails(); 
		} 
	} 		
	public void addEmployee(Employee emp) 
	{ 
		employeeList.add(emp); 
	} 		
	public void removeEmployee(Employee emp) 
	{ 
		employeeList.remove(emp); 
	} 
} 

class CompositePattern
{ 
	public static void main (String[] args) 
	{ 
		// Engineering division of the company
		Company engDivision = new Company();
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
		Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");		
 
		engDivision.addEmployee(dev1); 
		engDivision.addEmployee(dev2); 
		
		// Management division of the company
		Company mgtDivision = new Company(); 
		Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager"); 
		Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager"); 
		
		mgtDivision.addEmployee(man1); 
		mgtDivision.addEmployee(man2); 
	
		Company company = new Company(); 
		company.addEmployee(engDivision); 
		company.addEmployee(mgtDivision); 
		company.showEmployeeDetails(); 
	} 
} 
