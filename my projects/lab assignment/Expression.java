import java.lang.*;
import java.io.*;
class Ex
{
        public static void main(String args[])
        {
            try
            {
                int x,y,z;
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                System.out.println("Enter First no: ");
                x=Integer.parseInt(br.readLine());
                System.out.println("Enter Second no: ");
                y=Integer.parseInt(br.readLine());
                z=x/y;
                System.out.println("Division Result is: "+z);
                int[] arr=new int[5];
                arr[5]=5;
            }
            catch(IOException e)
            {
                System.out.println("Input Problem");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please give right input data");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Please don't divide by Zero");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array size exceded");
            }
            finally
            {
                System.out.println("End");
            }
        }
}