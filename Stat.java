package MyMath;
import java.util.Scanner;
public class Stat
{
int a[],size,temp,sum=0,count=0;
public void memory()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter size");
size=sc1.nextInt();
a=new int[size];
System.out.println("Enter array element");
for(int i=0;i<size;i++)
{
a[i]=sc1.nextInt();
}
System.out.println("Arry =");
for(int i=0;i<size;i++)
{
System.out.println(a[i]);
count++;
}
System.out.println("count ="+count);
}
public void methodoperation()
{
int min=a[0];
int max=a[0];
for(int i=0;i<size;i++)
{
if(min>a[i])
{
min=a[i];
}
if(max<a[i])
{
max=a[i];
}
}
System.out.println("MIN="+min);
System.out.println("MAX="+max);
for(int i=0;i<size;i++)
{
sum=sum+a[i];
}
System.out.println("Sum of array element="+sum);
int avg=sum/size;
System.out.println("Avg of array element="+avg);
}
}