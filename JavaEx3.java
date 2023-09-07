/*2.A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and
Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses
named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which
returns the amount deposited in that particular bank. Call the method 'getBalance' by the
object of each of the three banks.
*/

package javaex3;

import java.util.*;

class bank
{
    int bal=0;
    int getBalance()
    {
        return bal;
    }
}

class bank1 extends bank
{
    int bal=1000;
    int getBalance()
    {
        return bal;
    }
}

class bank2 extends bank
{
    int bal=1500;
    int getBalance()
    {
        return bal;
    }
}

class bank3 extends bank
{
    int bal=2000;
    int getBalance()
    {
        return bal;
    }
}

public class JavaEx3 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        bank b=new bank();
        
        bank1 b1=new bank1();
        bank2 b2=new bank2();
        bank3 b3=new bank3();
        
        int a=b1.getBalance();
        int c=b2.getBalance();
        int d=b3.getBalance();
        
        System.out.println("1-Bank1 \n2-Bank2 \n3-Bank3 \n4-All Bank");
        System.out.print("\nEnter the Bank you need to access:");
        int option=obj.nextInt();
        
        switch(option)
        {
            case 1:
                System.out.println("\nBank1:$"+a);
                break;
                
            case 2:
                System.out.println("\nBank2:$"+c);
                break;
                
            case 3:
                System.out.println("\nbank3:$"+d);
                break;
                
            case 4:
                System.out.println("\nBank1:$"+a+"\nBank2:$"+c+"\nBank3:$"+d);
                break;
        }
    }  
}
