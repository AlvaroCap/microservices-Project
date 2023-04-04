package main.java.com.spring.project.dto;

public class BuyDTO implements Serializable {
    String userName;
    String creditCard;
    String expiredMonth;
    String expiredYear;
    String cvv;
    String issuer;
    String concept;

    public BuyDTO(String userName, String creditCard, String expiredMonth, String expiredYear, String cvv,
            String issuer, String concept, String quantity) {
        this.userName = userName;
        this.creditCard = creditCard;
        this.expiredMonth = expiredMonth;
        this.expiredYear = expiredYear;
        this.cvv = cvv;
        this.issuer = issuer;
        this.concept = concept;
        this.quantity = quantity;
    }

    String quantity;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
