public class CheckoutService {
    private final Carts cart;
    private final Payment payment;
    private final NotificationService notificationService;
    private final InvoiceService invoiceService;

    public CheckoutService(Carts cart,Payment payment,NotificationService notificationService,InvoiceService invoiceService){
        this.cart = cart;
        this.payment = payment;
        this.notificationService = notificationService;
        this.invoiceService = invoiceService;
    }

    public void checkout(){
        int total = cart.calculateTotal();
        payment.pay(total);
        invoiceService.generateInvoice(cart.getProducts());
        notificationService.send("your order is complete");
    }
    
}
