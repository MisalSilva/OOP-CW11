package MultiThreading;

public class Customer implements Runnable {
    private final TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        while (true) {
            String ticket = ticketPool.removeTicket();
            if (ticket != null) {
                System.out.println("Ticket purchased: " + ticket);
            }
            try {
                Thread.sleep(1000); // Simulates retrieval rate
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}