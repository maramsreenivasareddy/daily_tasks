import java.util.*;
public class Countcharacter {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scobj=new Scanner(System.in);
        String str;
        int i,j,l;
        System.out.println("enter a string:");
        str=scobj.nextLine();
        l=str.length();
        int a[]=new int[l];
        char c[]=str.toCharArray();
        for(i=0;i<l;i++)
        {
            a[i]=1;
            for(j=i+1;j<l;j++)
            {
                if(c[i]==c[j])
                {
                    a[i]++;
                    c[j]='0';

                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(c[i]!=' ' && c[i]!='0')
            {
                System.out.println(c[i]+"="+ a[i]);
            }

        }

    }
}
