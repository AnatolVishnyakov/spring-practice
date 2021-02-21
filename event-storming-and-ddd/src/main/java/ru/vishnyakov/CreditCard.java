package ru.vishnyakov;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CreditCard {
    @Id
    private Long id;

    void assignLimit(BigDecimal money) {
        if(limitAlreadyAssigned()) {
            // throw
        }
        //...
    }

    void withdraw(BigDecimal money) {
        if(limitNotAssigned()) {
            // throw
        }
        if(notEnoughMoney()) {
            // throw
        }
        if(withdrawalWithinLastHour()) {
            // throw
        }

        //...
    }

    void repay(BigDecimal money) {
    }
}
