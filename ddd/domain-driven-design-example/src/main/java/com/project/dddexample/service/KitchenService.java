package com.project.dddexample.service;

import com.project.dddexample.domain.ticket.Ticket;
import com.project.dddexample.event.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.ZonedDateTime;
import java.util.List;

public class KitchenService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private DomainEventPublisher domainEventPublisher;

    public void accept(long ticketId, ZonedDateTime readyBy) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new TicketNotFoundException(ticketId));
        List<DomainEvent> events = ticket.accept(readyBy);
        domainEventPublisher.publish(Ticket.class, orderId, events);
    }
}
