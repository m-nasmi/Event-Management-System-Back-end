package com.eventmanagement.eventmanagementsystem.service;

import com.eventmanagement.eventmanagementsystem.model.Event;
import com.eventmanagement.eventmanagementsystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImplementation implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void deleteEventById(int id) {
        eventRepository.deleteById(id);
    }

    @Override
    public boolean updateEvent(int id, Event updatedEvent) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            Event event = existingEvent.get();
            event.setEvent_name(updatedEvent.getEvent_name());
            event.setEvent_type(updatedEvent.getEvent_type());
            event.setVenue(updatedEvent.getVenue());
            event.setDate(updatedEvent.getDate());
            event.setEmail(updatedEvent.getEmail());
            event.setContactNo(updatedEvent.getContactNo());
            event.setNoOfPpl(updatedEvent.getNoOfPpl());
            event.setPrice(updatedEvent.getPrice());
            event.setYour_name(updatedEvent.getYour_name());
            event.setAddress(updatedEvent.getAddress());
            eventRepository.save(event);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Event> getEventById(int id) {
        return eventRepository.findById(id);
    }
}