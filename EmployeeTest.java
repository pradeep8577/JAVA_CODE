import java.util.Scanner;
class Employee
{
String first_name,last_name;
double mon_sal,year_sal,per;
Employee()
{
first_name=" ";
last_name=" ";
mon_sal=0.0;
}
void set_name(String f_name,String l_name)
{
first_name=f_name;
last_name=l_name;
}
void get_name()
{
System.out.println("First name="+first_name);
System.out.println("Last name="+last_name);
}
void set_sal(double ms)
{
mon_sal=ms;
}
void getsal()
{
if(mon_sal<0)
{
System.out.println(mon_sal=0.0);
}
else
{
year_sal=mon_sal*12;
System.out.println("Monthly salary="+mon_sal);
System.out.println("yearly salary="+year_sal);
}
}
void inc_sal()
{
if(mon_sal<=0)
{
System.out.println(mon_sal=0.0);
}
else
{
System.out.println("Enter % of incrementing salary");
Scanner sc1=new Scanner(System.in);
double per=sc1.nextDouble();
System.out.println("percentage of incrementing salary is="+per+"%");
double x=year_sal*per;
double y=x/100;
double z=year_sal+y;
System.out.println("Yearly incremented salary is="+z);
}
}
}
class EmployeeTest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first name of first employee");
String f_name=sc.next();
System.out.println("Enter last name of first employee");
String l_name=sc.next();
System.out.println("Enter monthly salary of first employee");
double ms=sc.nextDouble();
Employee e=new Employee();
e.set_name(f_name,l_name);
e.get_name();
e.set_sal(ms);
e.getsal();
e.inc_sal();
Scanner sr=new Scanner(System.in);
System.out.println("Enter first name of second employee");
String f_n=sr.next();
System.out.println("Enter last name  of second employee");
String l_n=sr.next();
System.out.println("Enter monthly salary of second employee");
double m_s=sr.nextDouble();
Employee em=new Employee();
em.set_name(f_n,l_n);
em.get_name();
em.set_sal(m_s);
em.getsal();
em.inc_sal();
}
}