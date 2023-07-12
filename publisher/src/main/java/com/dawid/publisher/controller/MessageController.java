package com.dawid.publisher.controller;

import com.dawid.publisher.service.NotificationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    private final NotificationService notificationService;

    public MessageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @GetMapping("/notification")
    public String sendStudentNotification(@RequestParam Long studentId){
        notificationService.sendStudentNotification(studentId);
        return "Wiadomość została wysłana do studenta o id: " + studentId;
    }
}
