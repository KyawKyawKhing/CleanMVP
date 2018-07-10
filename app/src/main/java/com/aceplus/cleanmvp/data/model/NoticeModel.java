package com.aceplus.cleanmvp.data.model;

import com.aceplus.cleanmvp.data.vo.NetworkResponse;
import com.aceplus.cleanmvp.mvp.presenter.HomePresenter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kkk on 7/02/2018.
 */

public class NoticeModel extends BaseModel {
    private static NoticeModel INSTANCE;

    private NoticeModel() {
        super();
    }

    public static NoticeModel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NoticeModel();
        }
        return INSTANCE;
    }

    public void loadData(final HomePresenter homePresenter) {
        mApiService.fetchDataFromNetwork()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NetworkResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(NetworkResponse noticeList) {
                        if (noticeList != null) {
                            homePresenter.displayData(noticeList.getNoticeList());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        homePresenter.displayError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
