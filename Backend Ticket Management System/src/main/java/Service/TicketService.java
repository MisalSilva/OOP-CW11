package Service;

import org.springframework.stereotype.Service;
import MultiThreading.TicketPool;

@Service
public class TicketService {

    private final TicketPool ticketPool;

    public TicketService(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    public void startSystem() {
        ticketPool.startVendors();
        ticketPool.startCustomers();
    }

    public void stopSystem() {
        ticketPool.stop();
    }

    public String getTicketStatus() {
        return ticketPool.getStatus();
    }
}