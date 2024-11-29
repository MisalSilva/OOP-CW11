package MultiThreading;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TicketPool {

    private final List<String> tickets = Collections.synchronizedList(new LinkedList<>());
    private boolean running = true;

    public synchronized void addTickets(String ticket) {
        tickets.add(ticket);
    }

    public synchronized String removeTicket() {
        return tickets.isEmpty() ? null : tickets.remove(0);
    }

    public void startVendors() {
        // Add vendor threads here
    }

    public void startCustomers() {
        // Add customer threads here
    }

    public void stop() {
        running = false;
    }

    public String getStatus() {
        return "Tickets remaining: " + tickets.size();
    }
}
