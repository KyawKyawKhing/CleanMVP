package com.aceplus.cleanmvp.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kkk on 7/9/2018.
 */

public class NetworkResponse {
    @SerializedName("notice_list")
    private List<Notice> noticeList;

    public List<Notice> getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }
}
