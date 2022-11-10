import java.util.Scanner;
class Matrix
{
void add(int a[][],int b[][],int r,int c)
{
int m[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=a[i][j]+b[i][j];
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
void sub(int a[][],int b[][],int r,int c)
{
int m[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=a[i][j]-b[i][j];
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
void mult(int a[][],int b[][],int r,int c)
{
int m[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=0;
for(int k=0;k<r;k++)
{
m[i][j]+=a[i][k]*b[k][j];
}
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
void div(int a[][],int b[][],int r,int c)
{
int m[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=a[i][j]/b[i][j];
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
void scaler(int a[][],int r,int c)
{
int m[][]=new int[r][c];
System.out.println("Enter multiplyer");
Scanner sr1=new Scanner(System.in);
int c1=sr1.nextInt();
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=a[i][j]*c1;
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
void transpose(int a[][],int r,int c)
{
int m[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=a[j][i];
System.out.print(m[i][j]+" ");
}
System.out.println();
}
}
}

class ArrayTest
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter row");
int r=obj.nextInt();
System.out.println("Enter column");
int c=obj.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
System.out.println("Enter array element");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=obj.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("Enter array element");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]=obj.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
Matrix m1=new Matrix();
//Matrix m3=new Matrix();
System.out.println("Enter op value only 1");
Scanner sr=new Scanner(System.in);
int op=sr.nextInt();

while(op==1)
{
System.out.println("Enter \n1 for addition\n2 for substraction\n3 for multiplication\n4 for division\n5 for scaler mult\n6 for transpose\n7 for end");
System.out.println("Enter your choice");
Scanner sc=new Scanner(System.in);
int choice=sc.nextInt();
if(choice>6)
{
System.out.println("End");
break;
}
else
{
switch(choice)
{
case 1:
m1.add(a,b,r,c);
break;
case 2:
m1.sub(a,b,r,c);
break;
case 3:
m1.mult(a,b,r,c);
break;
case 4:
m1.div(a,b,r,c);
break;
case 5:
m1.scaler(a,r,c);
break;
case 6:
m1.transpose(a,r,c);
break;
default:
System.out.println("End");
break;
}
}
}
}
}


