import java.util.*;

public class Seater extends Train {
   
         private int seats,max_wait,cur_wait,seats_booked;
    private static Seater seater=null;
    private Seater(){
        super("DEEPAK_EXPRESS","007");
        seats=60;
        max_wait=10;
        cur_wait=0;
        seats_booked=0;
    }
    public static Seater getSeater()
    {
        if(seater==null)
        {
            seater=new Seater();
        }
        return seater;
    }
    public int getAvail()
    {
        return seats-seats_booked;
    }
    public int getWaitList()
    {
        if(cur_wait==max_wait)
        {
            System.out.println("No more seats are available!!! Pls check for other train");
            return 0;
        }
        else
        return cur_wait;
    }
    public int getSeats()
    {
        return seats;
    }
    public boolean addtoWait(Customer cus)
    {
        if(this.getWaitList()==0)
        return false;
        else{
            this.addWait(cus);
            this.cur_wait++;
            return true;
        }
    }
    public void bookTickets(Customer cus)
    {
        if(seats<=seats_booked+cus.getNoOfTickets())
        {
            this.addtoWait(cus);
            System.out.println("You have been added to wait list!!!");
        }
        else{
        seats_booked+=cus.getNoOfTickets();
        this.addCus(cus);
        System.out.println(cus.getNoOfTickets()+" "+seats_booked);
        }
    }
   /*public boolean checkWait()
    {
        return max_wait==cur_wait?false:true;
    }*/
    public int cancelTickets(String name)
    {
        ArrayList<Customer> customer=this.getCusDetails();
        Queue<Customer> waitlist=this.getWait();
        if(customer.size()==0)
        {
            return -1;
        }
        else{
            int tickets=0;
            int current=this.cur_wait;
            int i=0;
            while(i<customer.size())
            {
                if(customer.get(i).getName().equals(name))
                {
                    tickets=customer.get(i).getNoOfTickets();
                    customer.remove(customer.get(i));
                    this.seats_booked=this.seats_booked-tickets;
                    while(this.seats_booked+waitlist.peek().getNoOfTickets()<=this.getSeats() && !waitlist.isEmpty()){
                        this.bookTickets(waitlist.poll());
                        current--;
                    }
                    this.cur_wait=current;
                    return 1;
                }
                i++;
                    
                }
            }
            return 2;
        }
        public int calculateFair(int n)
        {
            return 100*n;

        }

    }
