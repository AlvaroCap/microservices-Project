package main.java.com.spring.project.model;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Buy {
    String userName;
    String creditCard;
    String expiredMonth;
    String expiredYear;
    String cvv;
    String issuer;
    String concept;
    String quantity;
}
