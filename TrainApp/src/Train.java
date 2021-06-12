import java.util.*;
public abstract  class Train{
    private String name="o",number="p";
    private Queue<Customer> cusWait;
    private ArrayList<Customer> cus;
    public Train(String name,String number)
    {
        cusWait=new LinkedList<>();
        cus=new ArrayList<>();
        this.setName("name");
        this.setNumber("number");
    }
    public String getName() {
        return name;
    }
    public String getNumber()
    {
        return number;
    }
    public ArrayList<Customer> getCusDetails()
    {
        return cus;
    }
    public void setName(String Name)
    {
        this.name=Name;
    }
    public void setNumber(String Number)
    {
        this.number=Number;
    }
    public void addCus(Customer cus)
    {
        this.cus.add(cus);
    }
    public void addWait(Customer cus)
    {
        cusWait.add(cus);
    }
    public Queue<Customer> getWait()
    {
        return this.cusWait;
    }
   public abstract int calculateFair(int n);

}