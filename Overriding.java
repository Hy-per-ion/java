class Parent
{
    void view()
    {
        System.out.println("This is a parent class method");
    }
}
class Child extends Parent
{
    @Override
    void view()
    {
        System.out.println("This is a child class method");
    }
}
public class Overriding
{
    public static void main(String[] args)
    {
        Parent obj = new Parent();
        obj.view();
        Parent obj1 = new Child();
        obj1.view();
    }
}