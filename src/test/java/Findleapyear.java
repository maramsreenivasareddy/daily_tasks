import java.util.*;
public class Findleapyear {
    public void find(int i)
    {
        if(((i%4==0) && (i%100!=0)) || (i%400==0))
        {
            System.out.println(i+" is a leap year");
        }
        else
        {
            System.out.println(i+" is not a leap lear");
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scobj=new Scanner(System.in);
        Findleapyear r=new Findleapyear();
        int y;
        System.out.println("enter any year:");
        y=scobj.nextInt();
        r.find(y);
    }
}
