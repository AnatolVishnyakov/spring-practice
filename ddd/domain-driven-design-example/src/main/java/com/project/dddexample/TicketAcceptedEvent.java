package com.project.dddexample;

import com.project.dddexample.event.DomainEvent;

import java.time.ZonedDateTime;

public class TicketAcceptedEvent implements DomainEvent {
    public TicketAcceptedEvent(ZonedDateTime readyBy) {
    }
}
