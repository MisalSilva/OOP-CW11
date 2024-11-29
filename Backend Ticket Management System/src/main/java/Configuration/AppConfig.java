package Configuration;
import Model.ConfigParameters;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;

@Configuration
public class AppConfig {
    public ConfigParameters getConfigFormCLI(){
        Scanner scanner = new Scanner(System.in);
        ConfigParameters config = new ConfigParameters();

        System.out.println("Enter Total Tickets: ");
        config.setTotalTickets(scanner.nextInt());

        System.out.println("Enter Ticket Release Rate: ");
        config.setTicketReleaseRate(scanner.nextInt());

        System.out.println("Enter Customer Retrieval Rate: ");
        config.setCustomerRetrievalRate(scanner.nextInt());

        System.out.println("Enter Max Ticket Capacity: ");
        config.setMaxTicketCapacity(scanner.nextInt());

        System.out.println("Configuration set successfully!");
        return config;
    }
}
