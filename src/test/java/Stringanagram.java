import java.util.*;
public class Stringanagram {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scobj=new Scanner(System.in);
        String str1,str2;
        int l1,l2;
        boolean x;
        System.out.println("enter string 1:");
        str1=scobj.nextLine();
        System.out.println("enter string 2:");
        str2=scobj.nextLine();
        l1=str1.length();
        l2=str2.length();
        if(l1!=l2)
        {
            System.out.println("Both given strings are not anagrams");
        }
        else
        {
            char c1[]=str1.toCharArray();
            char c2[]=str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            x=Arrays.equals(c1,c2);
            if(x)
            {
                System.out.println("Both given strings are anagrams");
            }
            else
            {
                System.out.println("Both given strings are not anagrams");
            }
        }

    }
}
