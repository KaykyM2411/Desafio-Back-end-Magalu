package com.kayky.magalums.repository;

import com.kayky.magalums.entity.Notification;
import com.kayky.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndNotificationDateBefore(List<Status> status, LocalDateTime notificationDate);
}
