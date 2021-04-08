package br.edu.ifpb.padroes.service.payment;

public class PaymentService {
     private CREDIT_CARD creditoCard;
     private DEBIT debit; 
     private PAYPAL paypal; 

    

     public Payment (enum CREDIT_CARD , enum DEBIT , enum PAYPAL ){

            this.creditoCard = creditoCard;
            this.debit = debit;
            this.paypal = paypal; 

     }


     }
     
     public enum Getdebit(){
        return this.debit;
    }

    public enum GetPaypal(){
        return this.paypal;
    }

    public void creditoCard(){
        creditoPag.creditoCard();

    }

    public void debit(){
        debitPag.debit();

    }

    public void paypal(){
        paypalPag.paypal();

    }





}
