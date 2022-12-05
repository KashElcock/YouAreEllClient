package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * POJO for an Id object
 */
public class Id {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "userid",
            "name",
            "github"
    })
        @JsonProperty("userid")
        private String userid = "";
        @JsonProperty("name")
        private String name = "";
        @JsonProperty("github")
        private String github = "";
        public Id (String name, String githubId) {
            this.name = name;
            this.github = githubId;
        }
        public Id () {}
        @JsonProperty("userid")
        public String getUserid() {
            return userid;
        }
        @JsonProperty("userid")
        public void setUserid(String userid) {
            this.userid = userid;
        }
        @JsonProperty("name")
        public String getName() {
            return name;
        }
        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }
        @JsonProperty("github")
        public String getGithub() {
            return github;
        }
        @JsonProperty("github")
        public void setGithub(String github) {
            this.github = github;
        }

        @Override
        public String toString() {
            return this.name + " (" + this.github + ") ";
        }
//    private String uid = "";
//    private String name = "";
//    private String github = "";
//
//    public Id (String name, String githubId) {}
//
//    public String getUid() {
//        return uid;
//    }
//
////    public void setUid(String uid) {
////        this.uid = uid;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGithub() {
//        return github;
//    }
//
//    public void setGithub(String github) {
//        this.github = github;
//    }
//
//    @Override
//    public String toString() {
//        return this.name + " (" + this.github + ") ";
//    }
}