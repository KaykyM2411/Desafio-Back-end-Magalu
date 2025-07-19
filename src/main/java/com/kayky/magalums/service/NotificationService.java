package com.kayky.magalums.service;

import com.kayky.magalums.dto.ScheduleNotification;
import com.kayky.magalums.entity.Notification;
import com.kayky.magalums.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public void schedulerNotification(ScheduleNotification dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

}
