import java.util.Scanner;
public class Net
{
  public static void main(String[] args)
  {
   double basic;
   double hra = 0;
   double da = 0;
   double gs = 0;
   double income = 0;
   double net = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the basic salary");
    basic = sc.nextInt();
    hra=0.1*basic;
    da=0.73*basic;
    gs=basic+da+hra;
    income=0.3*gs;
    net=gs-income;

  System.out.println("empolyee's net salary is:"+net);
  }
}