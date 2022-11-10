import MyMath.Arithmetic;
import MyMath.Trig;
import MyMath.Stat;
import java.util.Scanner;
class PackDemo
{
public static void main(String[] args)
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
float a=sc.nextFloat();
System.out.println("Enter b value");
float b=sc.nextFloat();
System.out.println("Enter angle in degree");
double angle=sc.nextDouble();
while(true)
{
System.out.println("Enter \n1 for arithmetic\n2 for trig\n3 for stat\n4 for end");
System.out.println("Enter your choice");
choice=sc.nextInt();
if(choice>3)
{
System.out.println("End");
break;
}
else
{
switch(choice)
{
case 1:
Arithmetic a1=new Arithmetic();
while(true)
{
System.out.println("Enter \n1 for add\n2 for sub\n3 for multiplicatiion\n4 for division\n5 for end for end");
System.out.println("Enter your choice");
int choice1=sc.nextInt();
if(choice1>4)
{
System.out.println("End");
break;
}
else
{
switch(choice1)
{
case 1:
     a1.add(a,b);
     break;
case 2:
      a1.sub(a,b);
      break;
case 3:
      a1.mult(a,b);
      break;
case 4:
      a1.div(a,b);
      break;
default:
      System.out.println("End");
      break;
}
}
}
break;

case 2:
Trig t=new Trig();
while(true)
{
System.out.println("Enter \n1 for display\n2 for  end");
System.out.println("Enter your choice");
int choice2=sc.nextInt();
if(choice2>1)
{
System.out.println("End");
break;
}
else
{
switch(choice2)
{
case 1:
     t.display(angle);
      break;

default:
      System.out.println("End");
      break;
}
}
}
break;
case 3:
Stat s=new Stat();
while(true)
{
System.out.println("Enter \n1 for operation\n2 for  end");
System.out.println("Enter your choice");
int choice3=sc.nextInt();
if(choice3>1)
{
System.out.println("End");
break;
}
else
{
switch(choice3)
{
case 1:
     s.memory();
      s.methodoperation();
      break;

default:
      System.out.println("End");
      break;
}
}
}
break;
default:
      System.out.println("End");
      break;
}
}
}
}
}