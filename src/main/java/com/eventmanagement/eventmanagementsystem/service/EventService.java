package com.eventmanagement.eventmanagementsystem.service;

import com.eventmanagement.eventmanagementsystem.model.Event;
import java.util.List;
import java.util.Optional;

public interface EventService {
    void saveEvent(Event event);
    List<Event> getAllEvents();
    boolean updateEvent(int id, Event event);
    void deleteEventById(int id);
    Optional<Event> getEventById(int id);
}
