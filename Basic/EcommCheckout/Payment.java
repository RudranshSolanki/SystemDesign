public interface Payment {
    void pay(int amout);
}


class CreditCart implements Payment{
    public void pay(int amount){
        System.out.println("amount"+" paid using credit card");
    }
}

class Paypal implements Payment{
    public void pay(int amount){
        System.out.println(amount +" paid using Paypal");
    }
}

class PaymentProcess{
    void Process(Payment payment,int amount){
        payment.pay(amount);
    }
}
