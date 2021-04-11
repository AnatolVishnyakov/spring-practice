package ru.vishnyakov.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MethodGetController {
    private static final Logger logger = LoggerFactory.getLogger(MethodGetController.class);
    private final RestTemplate restTemplate;

    public MethodGetController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/get/overflow/{capacity}")
    public Boolean getOverflow(@PathVariable int capacity) {
        List<Integer> values = Collections.nCopies(capacity, Integer.MAX_VALUE);
        UriComponents uri = UriComponentsBuilder.fromUriString("http://localhost:8080/get/overflow")
                .queryParam("values", values)
                .encode()
                .build();

        logger.info(uri.toUriString());
        return restTemplate.getForObject(uri.toUriString(), Boolean.class);
    }

    @GetMapping("/get/overflow")
    public boolean overflow(@RequestParam("values") List<Integer> values) {
        return true;
    }
}
