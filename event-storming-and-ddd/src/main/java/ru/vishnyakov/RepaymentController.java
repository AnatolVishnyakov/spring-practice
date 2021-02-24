package ru.vishnyakov;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController("/repayments")
class RepaymentController {

    private final Source source;

    RepaymentController(Source source) {
        this.source = source;
    }

    @PostMapping("/{cardNr}")
    ResponseEntity repay(@PathVariable String cardNo, @RequestBody RepaymentRequest r) {
        //.. stack for commands
        // - call to CreditCard.repay(r)
        // - source.output().send(... new MoneyRepaid(...));
        return ResponseEntity.ok("");
    }
}

class RepaymentRequest {

    final BigDecimal amount;

    RepaymentRequest(BigDecimal amount) {
        this.amount = amount;
    }
}