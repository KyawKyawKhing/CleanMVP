package com.aceplus.cleanmvp.mvp.presenter;

import com.aceplus.cleanmvp.data.model.NoticeModel;
import com.aceplus.cleanmvp.data.vo.Notice;
import com.aceplus.cleanmvp.mvp.view.HomeView;

import java.util.List;

/**
 * Created by kkk on 7/9/2018.
 */

public class HomePresenterImpl extends BasePresenter<HomeView> implements HomePresenter {

    public HomePresenterImpl(HomeView mView) {
        super(mView);
    }

    @Override
    public void loadData() {
        NoticeModel.getInstance().loadData(this);
    }

    @Override
    public void displayData(List<Notice> list) {
        mView.displayDataList(list);
    }

    @Override
    public void displayError(String message) {
        mView.displayError(message);
    }
}
