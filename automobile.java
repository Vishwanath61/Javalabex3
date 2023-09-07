/*1.A software product is needed that store & retrieves information about automobiles. The
information needed about all automobile is: maker(string), Vehicle identification
number(string), Bluebookvalue(float), year (Integer), passengers(integer). Derive a class
car from automobile. The fields are warranty-boolean, doors-int, imported-boolean,
topspeed-integer, Size-String, rear door-String. Derive a class truck which have the
following fields Topper-boolean, Wheels- String , Racks-Integer The product have to
Display all information about all vehicles.
*/

package javaex3;

import java.util.*;

class detail
{
    String maker,idnum;
    float bbv;
    int year,passenger;
}

class car extends detail
{
    boolean warranty,imported;
    int doors,topspeed;
    String size,reardoor;
    
    car(String make,String id,float value,int y,int pass,boolean war,boolean importe,int door,int speed,String siz,String rdoor)
    {
        maker=make;
        idnum=id;
        bbv=value;
        year=y;
        passenger=pass;
        warranty=war;
        imported=importe;
        doors=door;
        topspeed=speed;
        size=siz;
        reardoor=rdoor;
    }
    
    public String toString()
    {
        return "\nMaker:"+maker+"\nVehicle identification number:"+idnum+"\nBluebookvalue:"+bbv+"\nYear:"+year+"\nPassengers:"+passenger+"\nWarranty:"+warranty+"\nDoors:"+doors+"\nImported:"+imported+"\nTopspeed:"+topspeed+"\nSize:"+size+"\nRear door:"+reardoor;
    }
}

class truck extends detail
{
    boolean topper;
    String wheels;
    int racks;
    truck(String make,String id,float value,int y,int pass,boolean topp,String wheel,int rack)
    {
        maker=make;
        idnum=id;
        bbv=value;
        year=y;
        passenger=pass;
        topper=topp;
        wheels=wheel;
        racks=rack;
    }
    
    public String toString()
    {
        return "\nMaker:"+maker+"\nVehicle identification number:"+idnum+"\nBluebookvalue:"+bbv+"\nYear:"+year+"\nPassengers:"+passenger+"\nTopper:"+topper+"\nWheels:"+wheels+"\nRacks:"+racks;
    }
}

public class automobile 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        car c=new car("India","12",89.0f,2004,5,true,false,4,180,"SUV","YES");
        System.out.println(c);
        
        truck t=new truck("India","124",90.0f,2006,8,true,"Alloy",1);
        System.out.println(t);
        
        System.out.println("\n1.Car \n2.Truck ");
        System.out.print("\nEnter your options:");
        int choice=obj.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.print("\nEnter the maker:");
                String m=obj.next();
                System.out.print("Enter the Vehicle identification number:");
                String id=obj.next();
                System.out.print("Enter the Blue book value:");
                float value=obj.nextFloat();
                System.out.print("Enter Year:");
                int y=obj.nextInt();
                System.out.print("Enter Passengers:");
                int p=obj.nextInt();
                System.out.print("Warranty(true/false):");
                boolean w=obj.nextBoolean();
                System.out.print("Imported(true/false):");
                boolean imp=obj.nextBoolean();
                System.out.print("Enter doors:");
                int door=obj.nextInt();
                System.out.print("Enter Topspeed:");
                int speed=obj.nextInt();
                System.out.print("Enter size:");
                String siz=obj.next();
                System.out.print("Reardoor:");
                String rd=obj.next();
                
                car c1=new car(m,id,value,y,p,w,imp,door,speed,siz,rd);
                System.out.println(c1);
                break;
                
            case 2:
                System.out.print("\nEnter the maker:");
                String m2=obj.next();
                System.out.print("Enter the Vehicle identification number:");
                String id2=obj.next();
                System.out.print("Enter the Blue book value:");
                float value2=obj.nextFloat();
                System.out.print("Enter Year:");
                int y2=obj.nextInt();
                System.out.print("Enter Passengers:");
                int p2=obj.nextInt();
                System.out.print("Enter Topper(true/false):");
                boolean top=obj.nextBoolean();
                System.out.print("Enter Wheels:");
                String wheel=obj.next();
                System.out.print("Enter Racks:");
                int racks=obj.nextInt();
                
                truck t1=new truck(m2,id2,value2,y2,p2,top,wheel,racks);
                System.out.println(t1);
                break;
        } 
    }
}
