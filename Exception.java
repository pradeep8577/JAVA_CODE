import java.net.SocketTimeoutException;

class MyException extends Exception
{
    MyException(String str)
    {
        super(str);
    }
}
class Operation
{
    void division(int x,int y) throws MyException
    {
        try
        {
            if(y==0)
            {
                throw new MyException("Divide by zero");
            }
            else
            {
                int z=x/y;
                System.out.println(z);
            }
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
    void ArrayOut(int access) throws MyException
    {
        int []arr={1,2,3,4,5};
        try
        {
            if(access>arr.length || access<0)
            {
                throw new MyException("ArrayIndexOutOfBound");
            }
            else
            {
                System.out.println(arr[access]);
            }
        }
        catch (MyException e) 
        {
            System.out.println(e);
        }
    }
    void StringOut(int access) throws MyException
    {
        String str="Kedar";
        try
        {
            if(access>str.length() || access<0)
            {
                throw new MyException("StringIndexOutOfBound");
            }
            else
            {
                System.out.println(str.charAt(access));
            }
        }
        catch (MyException e) 
        {
            System.out.println(e);
        }
    }
}
class Excep
{
    public static void main(String []args) throws MyException
    {
        Operation d=new Operation();
        d.division(10, 0);
        d.ArrayOut(2);
        d.StringOut(2);
    }
}