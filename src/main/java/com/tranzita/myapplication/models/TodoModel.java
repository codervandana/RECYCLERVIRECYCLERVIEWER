package com.tranzita.myapplication.models;

import com.google.gson.annotations.SerializedName;

public class TodoModel {

        @SerializedName("userId")

        private Integer userId;
        @SerializedName("id")

        private Integer id;
        @SerializedName("title")

        private String title;
        @SerializedName("completed")

        private Boolean completed;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Boolean getCompleted() {
            return completed;
        }

        public void setCompleted(Boolean completed) {
            this.completed = completed;
        }


}
