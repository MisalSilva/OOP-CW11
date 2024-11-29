package MultiThreading;

public class Vendor implements Runnable {
    private final TicketPool ticketPool;

    public Vendor(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
        while (true) {
            ticketPool.addTickets("Ticket " + System.currentTimeMillis());
            try {
                Thread.sleep(1000); // Simulates ticket release rate
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
