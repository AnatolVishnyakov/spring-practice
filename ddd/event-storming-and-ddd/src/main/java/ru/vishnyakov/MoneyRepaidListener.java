package ru.vishnyakov;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class MoneyRepaidListener {

    @StreamListener("card-operations")
    public void handle(MoneyRepaid moneyRepaid) {
        //..close statement
    }
}

class MoneyRepaid {

    final String cardNo;
    final BigDecimal amount;

    MoneyRepaid(String cardNo, BigDecimal amount) {
        this.cardNo = cardNo;
        this.amount = amount;
    }
}
