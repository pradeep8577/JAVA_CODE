package MyMath;
public class Trig
{
public void display(double angle)
{
double b=Math.toRadians(angle);
System.out.println("Sin value="+angle+"Degrees "+Math.sin(b));
System.out.println("cos value="+angle+"Degrees "+Math.cos(b));
System.out.println("tan value="+angle+"Degrees "+Math.tan(b));
double sec=1/Math.sin(b);
double cosec=1/Math.cos(b);
double cot=1/Math.tan(b);
System.out.println("sec value="+angle+"Degrees "+sec);
System.out.println("cosec value="+angle+"Degrees "+cosec);
System.out.println("cot value="+angle+"Degrees "+cot);
}
}