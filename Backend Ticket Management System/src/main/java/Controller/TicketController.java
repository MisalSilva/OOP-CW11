package Controller;

import Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String getAllTickets() {
        return ticketService.getTicketStatus();
    }

    @PostMapping("/start")
    public String startSystem() {
        ticketService.startSystem();
        return "System started!";
    }

    @PostMapping("/stop")
    public String stopSystem() {
        ticketService.stopSystem();
        return "System stopped!";
    }
}
