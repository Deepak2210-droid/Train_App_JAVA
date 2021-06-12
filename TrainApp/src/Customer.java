public class Customer {
    private String name,address;
    private int age,no_of_tickets,price;
    Customer(String n,String a,int age,int no_of_tickets)
    {
        this.setName(n);
        this.setAddress(a);
        this.setAge(age);
        this.setNoofTickets(no_of_tickets);
    }
    public void setName(String n){
        this.name=n;
    }
    public void setAddress(String a)
    {
        this.address=a;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setNoofTickets(int n)
    {
        this.no_of_tickets=n;
    }
    public void setPrice(int p)
    {
        price=p;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge()
    {
        return age;
    }
    public int getNoOfTickets(){
        return no_of_tickets;
    }
    public int getPrice(){
        return price;
    }
}
