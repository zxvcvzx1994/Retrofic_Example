package com.cvcompany.vo.chatfirebase.Module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vinh on 8/22/2017.
 */

public class MyText {
    @SerializedName("Id")
    private String id;
    @SerializedName("Text")
    private String text;

    public MyText(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
