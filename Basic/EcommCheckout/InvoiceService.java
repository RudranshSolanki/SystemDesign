import java.util.*;
public class InvoiceService {
    void generateInvoice(List<Product> products){
        System.out.println("========= Invoice =========");

        int total = 0;
        int index = 1;
        for (Product product : products) {
            System.out.println(index++ + ". " + product.getName() + " - $" + product.getPrice());
            total += product.getPrice();
        }

        System.out.println("\nTotal: $" + total);
        System.out.println("===========================");
    }
}


