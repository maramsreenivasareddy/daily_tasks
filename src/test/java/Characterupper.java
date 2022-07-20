import java.util.*;
public class Characterupper {
    public void task(String s)
    {
        int i;
        char c[];
        c=s.toCharArray();
        c[0]=Character.toUpperCase(c[0]);
        for(i=1;i<s.length();i++)
        {
            if(c[i]==' ')
            {
                c[i+1]=Character.toUpperCase(c[i+1]);
            }

        }
        for(i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scobj=new Scanner(System.in);
        Characterupper k=new Characterupper();
        String str;
        System.out.println("enter a string");
        str=scobj.nextLine();
        k.task(str);


    }
}
