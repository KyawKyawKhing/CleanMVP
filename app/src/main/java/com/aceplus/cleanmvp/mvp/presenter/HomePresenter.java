package com.aceplus.cleanmvp.mvp.presenter;

import com.aceplus.cleanmvp.data.vo.Notice;

import java.util.List;

/**
 * Created by kkk on 7/9/2018.
 */

public interface HomePresenter {

    void loadData();

    void displayData(List<Notice> list);

    void displayError(String message);

}
