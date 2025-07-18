package com.kayky.magalums.dto;

import com.kayky.magalums.entity.Channel;
import com.kayky.magalums.entity.Notification;
import com.kayky.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotification(LocalDateTime notificationData,
                                   String destination,
                                   String message,
                                   Channel.Values channel) {
    public Notification toNotification() {

        return new Notification(notificationData,
                                destination,
                                message,
                                channel.toChannel(),
                                Status.Values.PENDING.toStatus());
    }
}
