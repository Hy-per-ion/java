import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Progpackage
{
    public static void main(String[] args)
    {

        try
        {
            File r=new File("C:\\coding\\java main\\java-exam\\src\\temp.txt");
            Scanner sc=new Scanner(r);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}