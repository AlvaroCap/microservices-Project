package com.spring.project.model;

import jakarta.persistence.Entity;
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
