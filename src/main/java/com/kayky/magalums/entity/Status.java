package com.kayky.magalums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_status")
public class Status {

    @Id
    private Long id;

    private String status;

    public Status() {
    }

    public Status(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public enum Values {
        PENDING(1L, "Pending"),
        SUCCESS(2L, "Success"),
        ERROR(3L, "Error"),
        CANCELED(4L, "Canceled");

        private Long id;

        private String value;

        Values(Long id, String value) {
            this.id = id;
            this.value = value;
        }

        public Status toStatus() {
            return new Status(id, value);
        }
    }
}
