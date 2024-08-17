package com.wecp.event_management_system.controllers;

<<<<<<< HEAD
import com.wecp.event_management_system.entities.Staff;
import com.wecp.event_management_system.entities.Task;
import com.wecp.event_management_system.services.TaskService;
import com.wecp.event_management_system.services.UserService;

=======
import com.wecp.event_management_system.entities.Task;
import com.wecp.event_management_system.services.TaskService;
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

<<<<<<< HEAD
    @Autowired
    private TaskService taskService;
    @Autowired
    private UserService userService;
    @GetMapping("/tasks/{staffId}")
    public ResponseEntity<List<Task>> getTasks(@PathVariable Long staffId) {
        List<Task> tasks = taskService.getAssignedTasks(staffId);
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Staff>> getStaff() {
        List<Staff> staffs = userService.getAllStaff();
        return new ResponseEntity<>(staffs, HttpStatus.OK);
=======

    @GetMapping("/tasks/{staffId}")
    public ResponseEntity<List<Task>> getTasks(@PathVariable Long staffId) {
       // get assigned tasks for the staff with the given staffId and return with status code 200 ok
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
    }

    @PutMapping("/tasks/{taskId}")
    public ResponseEntity<Task> updateTaskStatus(@PathVariable Long taskId, @RequestParam String status) {
<<<<<<< HEAD
        Task task = taskService.updateTaskStatus(taskId, status);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }
   
=======
       // update the status of the task with the given taskId and return the updated task with status code 200 ok
    }
>>>>>>> c0e47323986c87624993559d6fb5d6db69d8e3a0
}
