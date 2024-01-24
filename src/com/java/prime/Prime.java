package com.java.prime;
/*step 1: Read num ,step 2: Set b=l, c=0
step 3: Repeat through step-5 while (b <= num)
step 4: If (num mod b) equals to 0 then set c = c + 1
step 5: b = b + l,step 6: If c equals to 2 then print “num is prime”
Else print “num is not prime”
step 7: Exit

 */
import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        int num,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number");
        num =s.nextInt();
        b=1;
        c=0;
        while(b<= num)
        {
            if((num%b)==0)
                c=c+1;
            b++;
        }
        if(c==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}
