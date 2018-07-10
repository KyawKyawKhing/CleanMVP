package com.aceplus.cleanmvp.mvp.presenter;

import com.aceplus.cleanmvp.mvp.view.BaseView;

/**
 * Created by kkk on 7/9/2018.
 */

public abstract class BasePresenter<V extends BaseView> {
    protected V mView;

    public BasePresenter(V mView) {
        this.mView = mView;
    }
}
