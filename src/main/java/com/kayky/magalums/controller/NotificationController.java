package com.kayky.magalums.controller;

import com.kayky.magalums.dto.ScheduleNotification;
import com.kayky.magalums.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> schedulerNotification(@RequestBody ScheduleNotification dto){
        notificationService.schedulerNotification(dto);

        return ResponseEntity.accepted().build();
    }
}


