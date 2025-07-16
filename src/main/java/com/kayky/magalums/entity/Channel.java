package com.kayky.magalums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_channels")
public class Channel {

    @Id
    private Long channelId;

    private String channelName;

    public Channel() {
    }

    public Channel(Long channelId, String channelName) {
        this.channelId = channelId;
        this.channelName = channelName;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public enum Values{

        EMAIL(1L, "email"),
        SMS(2L, "sms"),
        PUSH(3L, "push"),
        WHATSAPP(4L, "whatsapp"),;

        private final Long id;

        private final String value;

        Values(Long id, String value){
            this.id = id;
            this.value = value;
        }

        public Channel toChannel(){
            return new Channel(id, value);
        }
    }
}
