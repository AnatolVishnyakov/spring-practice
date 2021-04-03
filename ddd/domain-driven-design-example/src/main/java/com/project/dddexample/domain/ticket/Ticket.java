package com.project.dddexample.domain.ticket;

import com.project.dddexample.TicketAcceptedEvent;
import com.project.dddexample.event.DomainEvent;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class Ticket {
    private ZonedDateTime acceptTime;
    private ZonedDateTime readyBy;

    public List<DomainEvent> accept(ZonedDateTime readyBy) {
        this.acceptTime = ZonedDateTime.now();
        this.readyBy = readyBy;
        return Collections.singletonList(new TicketAcceptedEvent(readyBy));
    }

    public static ResultWithAggregateEvents<Ticket, TicketDomainEvent> create(Long id, TicketDetails details) {
        return new ResultWithAggregateEvents<>(new Ticket(id, details), new TicketCreatedEvent(id, details));
    }
}
