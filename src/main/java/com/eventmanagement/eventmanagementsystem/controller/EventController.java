package com.eventmanagement.eventmanagementsystem.controller;

import com.eventmanagement.eventmanagementsystem.model.Event;
import com.eventmanagement.eventmanagementsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/event")
@CrossOrigin(origins = "http://localhost:3000")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/addEvent")
    public String add(@RequestBody Event event) {
        eventService.saveEvent(event);
        return "New Event Added Successfully";
    }

    @GetMapping("/getAll")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @DeleteMapping("deleteEvent/{id}")
    public String deleteEventById(@PathVariable int id) {
        eventService.deleteEventById(id);
        return "Event with ID " + id + " has been deleted";
    }

    @PutMapping("/editEvent/{id}")
    public String editEvent(@PathVariable int id, @RequestBody Event event) {
        boolean updated = eventService.updateEvent(id, event);
        if (updated) {
            return "Event with ID " + id + " has been updated successfully";
        } else {
            return "Event with ID " + id + " not found";
        }
    }
    @GetMapping("/getEvent/{id}")
    public ResponseEntity<Event> getEventById(@PathVariable int id) {
        Optional<Event> event = eventService.getEventById(id);
        return event.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
