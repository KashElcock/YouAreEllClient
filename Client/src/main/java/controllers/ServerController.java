package controllers;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";

    private static ServerController svr = new ServerController();

    private ServerController() {}

    public static ServerController getServerInstance() {return svr;}

    public String getURL(String urlExtension) {
        HttpResponse<JsonNode> jsonResponse = Unirest.get(rootURL + "/" + urlExtension).asJson();
        if (jsonResponse.isSuccess()) return jsonResponse.getBody().toString();
        return null;
    }
}



//    public JsonString idGet() {
//        // url -> /ids/
//        // send the server a get with url
//        // return json from server
//    }
//    public JsonString idPost(Id) {
//        // url -> /ids/
//        // create json from Id
//        // request
//        // reply
//        // return json
//    }
//    public JsonString idPut(Id) {
//        // url -> /ids/
//    }
// ServerController.shared.doGet()