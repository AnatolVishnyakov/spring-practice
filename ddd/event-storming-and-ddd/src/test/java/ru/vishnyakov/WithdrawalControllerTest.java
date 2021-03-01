package ru.vishnyakov;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static java.math.BigDecimal.TEN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class WithdrawalControllerTest {

    private static final String ANY_CARD_NO = "no";

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void should_show_correct_number_of_withdrawals() {
        // when
        testRestTemplate.postForEntity("/withdrawals/" + ANY_CARD_NO,
                new WithdrawRequest(TEN),
                WithdrawRequest.class);

        // then
        ResponseEntity res = testRestTemplate.getForEntity(
                "/withdrawals/" + ANY_CARD_NO,
                WithdrawRequest.class);
        assertThat(res.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(res.getBody()).hasToString("1");
    }

}