package com.aceplus.cleanmvp.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kkk on 7/9/2018.
 */

public class Notice {

    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("brief")
    private String brief;
    @SerializedName("filesource")
    private String fileSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getFileSource() {
        return fileSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }
}
