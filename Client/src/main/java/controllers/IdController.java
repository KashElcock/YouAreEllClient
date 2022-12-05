package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IdController {
    private HashMap<String, Id> allIds;

    Id myId;
    private final ObjectMapper objectMapper = new ObjectMapper();
    public ArrayList<Id> getIds() {
        String getResultJSON;
        try {
            getResultJSON = ServerController.getServerInstance().getURL("ids");
            return new ArrayList<Id>(Arrays.asList(objectMapper.readValue(getResultJSON, Id[].class)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Id postId(Id id) {
        // create json from id
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {
        return null;
    }
}