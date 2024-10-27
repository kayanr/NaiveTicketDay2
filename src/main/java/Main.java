// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Naive Ticket running.");
        // Exercise 2.1
        //Create a TicketMachine object on the object bench.
        TicketMachine ticketMachine = new TicketMachine(20);
        //Upon viewing its methods, getBalance, getPrice, insertMoney, printTicket.
        ticketMachine.getPrice();

        //Use getPrice method to view the value of the price of the tickets that was set when this object was created.
        System.out.println(ticketMachine.getPrice());
        //se insertMoney method to simulate inserting an amount of money into the machine.
        ticketMachine.insertMoney(100);
        ticketMachine.printTicket();


    }

    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    //
    //


    //}
}