package edu.upb.chatupb.server.objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class ChatInfo {
    String idMessage;
    int messageOrder;
    String idReceiver;
    String idSender;
    String date;
    String time;
    String message;

    @Override
    public String toString() {
        return message;
    }
}

