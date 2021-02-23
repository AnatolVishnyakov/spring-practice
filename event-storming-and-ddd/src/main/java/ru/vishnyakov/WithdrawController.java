package ru.vishnyakov;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/withdrawals")
class WithdrawalController {

    @GetMapping("/{cardNo}")
    ResponseEntity withdrawalsForCard(@PathVariable String cardNo) {
        //.. stack for query
        // - direct call to DB to Withdrawals
    }

    @PostMapping("/{cardNo}")
    ResponseEntity withdraw(@PathVariable String cardNo, @RequestBody WithdrawRequest r) {
        //.. stack for commands
        // - call to CreditCard.withdraw(r.amount)
        // - insert new Withdrawal to DB
    }

}