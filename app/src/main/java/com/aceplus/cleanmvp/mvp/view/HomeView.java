package com.aceplus.cleanmvp.mvp.view;

import com.aceplus.cleanmvp.data.vo.Notice;

import java.util.List;

/**
 * Created by kkk on 7/9/2018.
 */

public interface HomeView extends BaseView {

    void displayDataList(List<Notice> data);

    void displayError(String message);
}
