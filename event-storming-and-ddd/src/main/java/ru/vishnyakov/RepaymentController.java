package ru.vishnyakov;

import org.springframework.web.bind.annotation.RestController;

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
    }

}

class RepaymentRequest {

    final BigDecimal amount;

    RepaymentRequest(BigDecimal amount) {
        this.amount = amount;
    }
}