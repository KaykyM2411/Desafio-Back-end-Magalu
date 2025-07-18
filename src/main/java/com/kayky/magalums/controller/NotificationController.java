package com.kayky.magalums.controller;

import com.kayky.magalums.dto.ScheduleNotification;
import com.kayky.magalums.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    public ResponseEntity<Void> schedulerNotification(@ResponseBody ScheduleNotification dto){
        notificationService.schedulerNotification(dto);

        return ResponseEntity.accepted().build();
    }
}


