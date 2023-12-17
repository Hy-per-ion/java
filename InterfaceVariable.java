interface Customer
{
    int amt=5;
    void purchase();
}
class seller implements Customer
{
    @Override
    public void purchase()
    {
        System.out.println("final amount: "+amt);
    }
}
class InterfaceVariable
{
    public static void main(String[] args)
    {
        Customer c=new seller();
        c.purchase();
        System.out.println(Customer.amt);

    }
}