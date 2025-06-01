import java.util.*;
public class Main{
    public static void main(String[] args) {

        // setup product & cart
        Product prod = new Product("iphone", 1200);
        Carts cart = new Carts();
        cart.addProduct(prod);

        // setup payment services
        Payment payment = new CreditCart();
        NotificationService emailService = new EmailService();
        InvoiceService invoiceService = new InvoiceService();
        CheckoutService checkoutService = new CheckoutService(cart, payment, emailService, invoiceService);
        checkoutService.checkout();

        

    }
}