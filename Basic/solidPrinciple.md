Solid Principle

S - Single Responsibility Principle
    eg:
        class UserService{
            void registerUser(String email){};
            void sendMail(String email,String messgae){};
        }

        this will be wrong as each class should contain single service

        class UserService{
            void registerUser(String email){};
        }
        class MailService{
            void sendMail(String email, String message){};
        }

O - Open for extenstion and Close for modification

    eg:
        In this case we need to modify whenever new type comes
        class PaymentProcess{
            void pay(String type){
                if(type.equals("creditCard")){}
                else if(type.equals("paypal")){}
            }
        }

        extend without changing the base code
        Class PaymentProcess{
            void process(Payment payment){
                payment.pay();
            }
        }

        interface Payment{
            void pay(){}
        }

        class CreditCardPayment implements Payment{
            void pay(){}
        }
        class PaypalPayment implements Payment{
            void pay(){}
        }
        // can easly extend with new payment method 

L - Liskov Substitution Principle


    


I - Interface Segregation Principle


D -  Dependency Inversion Principle 