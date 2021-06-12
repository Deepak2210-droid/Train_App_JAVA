import java.util.*;
public class Main {
    static Customer getCustomer()
    {
        return new Customer("deepak","asas",21,61);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        Customer cus=getCustomer();
        Seater obj=Seater.getSeater();
        cus.setPrice(obj.calculateFair(cus.getNoOfTickets()));
        obj.bookTickets(cus);
        System.out.print(obj.getAvail()+"\n"+obj.getSeats());
        sc.close();

     }
}
