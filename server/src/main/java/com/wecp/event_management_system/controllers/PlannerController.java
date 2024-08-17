package com.wecp.event_management_system.controllers;


import com.wecp.event_management_system.entities.Event;
import com.wecp.event_management_system.entities.Task;
import com.wecp.event_management_system.services.EventService;
import com.wecp.event_management_system.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planner")
public class PlannerController {

<<<<<<< HEAD
    @Autowired
    private EventService eventService;

    @Autowired
    private TaskService taskService;

    @PostMapping("/event")
    public ResponseEntity<Event> createEvent(@RequestParam Long plannerId, @RequestBody Event event) {
        Event createdEvent = eventService.createEvent(plannerId, event);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
=======
    @PostMapping("/event")
    public ResponseEntity<Event> createEvent(@RequestParam Long plannerId, @RequestBody Event event) {
       // create event and return the created event with status code 201 created
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @PutMapping("/event/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
<<<<<<< HEAD
        Event updatedEvent = eventService.updateEvent(id, eventDetails);
        return new ResponseEntity<>(updatedEvent, HttpStatus.OK);
=======
        // update event and return the updated event with status code 200 ok
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getEventsByPlanner(@RequestParam Long plannerId) {
<<<<<<< HEAD
        List<Event> events = eventService.getEventsByPlanner(plannerId);
        return new ResponseEntity<>(events, HttpStatus.OK);
=======
        // retrieve all events of a planner with status code 200 ok
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @PostMapping("/task")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
<<<<<<< HEAD
        Task createdTask = taskService.createTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
=======
        // create task and return the created task with status code 201 created
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks() {
<<<<<<< HEAD
        List<Task> tasks = taskService.getAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
=======
       // retrieve all tasks with status code 200 ok
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @PostMapping("/tasks/{taskId}/assign/{staffId}")
    public ResponseEntity<Task> assignTaskToStaff(@PathVariable Long taskId, @PathVariable Long staffId) {
<<<<<<< HEAD
        Task assignedTask = taskService.assignTask(taskId, staffId);
        return new ResponseEntity<>(assignedTask, HttpStatus.OK);
=======
        // assign task to staff and return the assigned task with status code 200 ok
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }


}
