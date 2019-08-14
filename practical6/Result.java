import java.util.*;
class Student
{

	int rollno;
	String name;
	public void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter rollno:");
		rollno=s.nextInt();
		System.out.print("Enter name:");
		name=s.next();
	}
	public void disp()
	{
		System.out.print("Rollno:"+rollno);
		System.out.print("Name:"+name);
	}
	public class Sessional
	{
		int sub[][]=new int[5][3];
		//int sum[]=new int[5];
		//int per[]=new int[5];
		int sum=0;
		int tot;
		float per;
		int i,j;
		public void getMarks()
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter marks of 5 subjects:");
			for(i=0;i<5;i++)
			{
				System.out.println("Subject" + (i+1) + "marks");
				for(j=0;j<3;j++)
					sub[i][j]=s1.nextInt();
			}
		}
		public void getTotal()
		{
			for(i=0;i<5;i++)
			{
				for(j=0;j<3;j++)
					sum=sum+sub[i][j];
				System.out.println("Total Of Subject"+ (i+1) +"marks"+sum);
			}
		}
		public void getPer()
		{
			System.out.println(" ");
			per=(sum*100)/120;
			System.out.println("Percentage="+per);
		}
	}
}
class Result
{
	public static void main(String args[])
	{
		Student a=new Student();
		Student.Sessional b=a.new Sessional();
		a.getData();
		a.disp();
		b.getMarks();
		b.getTotal();
		b.getPer();
	}
}