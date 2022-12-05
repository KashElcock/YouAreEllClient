package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;
import models.Message;

public class MessageController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public List<Message> getMessages() {
        String getResultJSON;
        try {
            getResultJSON = ServerController.getServerInstance().getURL("messages");
            return Arrays.asList(objectMapper.readValue(getResultJSON, Message[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }

}