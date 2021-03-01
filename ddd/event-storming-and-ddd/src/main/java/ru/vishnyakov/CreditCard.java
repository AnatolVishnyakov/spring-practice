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

    private boolean limitAlreadyAssigned() {
        return false;
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

    private boolean withdrawalWithinLastHour() {
        return false;
    }

    private boolean notEnoughMoney() {
        return false;
    }

    private boolean limitNotAssigned() {
        return false;
    }

    void repay(BigDecimal money) {
    }
}
