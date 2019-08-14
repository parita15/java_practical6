import java.util.*;
class Employee
{
	int empid;
	String name;
	int salary;
	public void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter employee id:");
		empid=s.nextInt();
		System.out.print("Enter employee name:");
		name=s.next();
		System.out.println("Enter employee salary:");
		salary=s.nextInt();
	}
}
class Manager
{
	public Employee emp_obj=new Employee();
	String dept_name,city,branch;

	public void getData()
	{
		emp_obj.getData();
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter Department Name:");
		dept_name=s1.next();
		System.out.print("Enter City:");
		city=s1.next();
		System.out.print("Enter Branch:");
		branch=s1.next();
	}
	public void disp()
	{
		System.out.println("Employee Id="+emp_obj.empid);
		System.out.println("Employee Name="+emp_obj.name);
		System.out.println("Employee Salary="+emp_obj.salary);
		System.out.println("Department Name="+dept_name);
		System.out.println("City="+city);
		System.out.println("Branch="+branch);
	}
}
class office
{
	public static void main(String args[])
	{
		Manager m=new Manager();
		m.getData();
		m.disp();
	}
}