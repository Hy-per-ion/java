import java.util.*;
public class Ebill {
    public static void main(String[] args) {
        Cdata cd = new Cdata();
        cd.get();
        cd.calc();
        cd.display();
    }
}
class Cdata{
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    int bn;
    String name,type;
    double cur,total,prev,uni;
    void get()
    {
        System.out.print("Enter the Bill Number: ");
        bn = in.nextInt();
        System.out.print("Enter the type:- \nD - Domestic\nC - Commercial : ");
        type = ins.nextLine();
        System.out.print("Enter the Customer Name: ");
        name = ins.nextLine();
        System.out.print("Enter the Current Month Readings: ");
        cur = in.nextDouble();
        System.out.print("Enter the Previous Month Readings: ");
        prev = in.nextDouble();
    }
    void calc()
    {
        uni = cur - prev;
        if(type.equals("D") || type.equals("d"))
        {
            if (uni<=100){
                total = 1 * uni;
            }
            else if (uni>100 && uni<=200)
            {
                total = 2.50 * uni;
            }
            else if (uni>200 && uni<=500)
            {
                total = 4 * uni;
            }
            else
            {
                total = 6 * uni;
            }
        }
        else if (type.equals("C") || type.equals("c"))
        {
            if (uni<=100){
                total = 2 * uni;
            }
            else if (uni>100 && uni<=200)
            {
                total = 4.50 * uni;
            }
            else if (uni>200 && uni<=500)
            {
                total = 6 * uni;
            }
            else
            {
                total = 7 * uni;
            }
        }
    }
    void display()
    {
        System.out.println("Bill Number: "+bn);
        System.out.println("Customer Name: "+name);
        if(type.equals("D") || type.equals("d"))
        {
            System.out.println("Type - Domestic");
        }
        else if (type.equals("C") || type.equals("c"))
        {
            System.out.println("Type - Commercial");
        }
        System.out.println("Current month reading: "+cur);
        System.out.println("Previous month reading: "+prev);
        System.out.println("Total units: "+uni);
        System.out.println("Total Bill: "+total);

    }
}