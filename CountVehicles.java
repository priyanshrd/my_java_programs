import java.util.Scanner;
class CountVehicles
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int car=0,auto=0,bike=0;
    System.out.println("Enter the number of wheels.");
    int total = sc.nextInt();
    int t=total,temp=0;
    while(t!=0)
    {
      if(t%4 == 0)
      {
      car=t/4;
      t-=car*4;
      }
      else
      {
        temp=t%4;
        if(temp<2)
        {
        car=(t/4)-1;
        t-=car*4;
        auto=t/3;
        t-=auto*3;
        bike=1;
        t-=bike*2;
        }
        else if (temp<3) {
        car=(t/4);
        t-=car*4;
        bike=1;
t-=bike*2;
        } else
        {
          car=t/4;
          t-=car*4;
          auto=1;
          t-=auto*3;
        }
      }
    }
    System.out.println("no. of:\ncars\t"+car+"\nautos\t"+auto+"\nbikes\t"+bike+"\nThank You!!");
  }
}


