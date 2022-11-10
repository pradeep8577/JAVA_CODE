import java.util.Scanner;
interface stack
{
void push();
void pop();
void sdisplay();
}
interface queue
{
void enqueue();
void dequeue();
void qdisplay();
}
class stackqueueinterface implements stack,queue
{
 int a[];
int top,front,rear;
int size,sizeq;
int val;
Scanner sc=new Scanner(System.in);
stackqueueinterface(int size,int sizeq)
{
this.size=size;
this.sizeq=sizeq;
a=new int[size];
a=new int[sizeq];
top=-1;
front=-1;
rear=-1;
}
public void push()
{
int item;
Scanner sc=new Scanner(System.in);
System.out.println("Enter item which u want to add");
item=sc.nextInt();
if(top==this.size-1)
{
System.out.println("Stack is full");
}
else
{
top++;
a[top]=item;
}
}
public void pop()
{
if(top==-1)
{
System.out.println("Stack is empty");
}
else
{
val=a[top];
top--;
System.out.println("Popped val:"+val);
}
}
public void sdisplay()
{
int i;
if(top==-1)
{
System.out.println("Stack is empty");
}
else
{
System.out.println("Stack elements are:");
for(i=top;i>=0;i--)
{
System.out.println("stack:"+a[i]);
}
}
}
public void enqueue()
{
int value;
System.out.println("Enter which value u want to insert");
value=sc.nextInt();
if(rear==this.sizeq-1)
{
System.out.println("Queue is full");
}
else
{
rear++;
a[rear]=value;
if(front==-1)
front=0;
}
}
public void dequeue()
{
if(front==-1)
{
System.out.println("Queue is empty");
}
else
{
int item1=a[front];
a[front]=0;
if(front==rear)
front=rear=-1;
else
front++;
}
}
public void qdisplay()
{
int i;
if(rear==-1)
{
System.out.println("Queue is empty");
}
else
{
System.out.println("Queue elements:");
for(i=front;i<=rear;i++)
{
System.out.println("Queue:"+a[i]);
}
}
}
}

class stackqueue
{
public static void main(String[] args)
{
int choice;
int op=1;
Scanner sc1=new Scanner(System.in);
stackqueueinterface sq=new stackqueueinterface(10,10);
while(op==1)
{
System.out.println("Enter \n1 for stack push\n2 for pop\n3 for stack sizplay\n4 for enqueue\n5 for dequeue\n6 for queue display\n7 for end");
System.out.println("Enter yor choice");
choice=sc1.nextInt();
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
       sq.push();
       break;
case 2:
       sq.pop();
       break;
case 3:
       sq.sdisplay();
       break;
case 4:
       sq.enqueue();
       break;
case 5:  
       sq.dequeue();
       break;
case 6:
       sq.qdisplay();
       break;
default:
       System.out.println("End");
       break;
}
}
}
}
}