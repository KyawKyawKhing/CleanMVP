package com.aceplus.cleanmvp.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aceplus.cleanmvp.R;
import com.aceplus.cleanmvp.adapter.NoticeListAdapter;
import com.aceplus.cleanmvp.data.vo.Notice;
import com.aceplus.cleanmvp.delegate.HomeDelegate;
import com.aceplus.cleanmvp.mvp.presenter.HomePresenter;
import com.aceplus.cleanmvp.mvp.presenter.HomePresenterImpl;
import com.aceplus.cleanmvp.mvp.view.HomeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import saschpe.android.customtabs.CustomTabsHelper;
import saschpe.android.customtabs.WebViewFallback;

public class MainActivity extends AppCompatActivity implements HomeView, HomeDelegate {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    NoticeListAdapter mAdapter;
    HomePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mAdapter = new NoticeListAdapter(getApplicationContext(), this);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mPresenter = new HomePresenterImpl(this);
        mPresenter.loadData();
    }

    @Override
    public void displayDataList(List<Notice> data) {
        mAdapter.setNewList(data);
    }

    @Override
    public void displayError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTapFilePath(String filePath) {
        openFilePath(filePath);
    }

    private void openFilePath(String filePath) {
        CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder()
                .addDefaultShareMenuItem()
                .setToolbarColor(this.getResources().getColor(R.color.colorPrimary))
                .setShowTitle(true)
                .build();

// This is optional but recommended
        CustomTabsHelper.addKeepAliveExtra(this, customTabsIntent.intent);

// This is where the magic happens...
        CustomTabsHelper.openCustomTab(this, customTabsIntent,
                Uri.parse(filePath),
                new WebViewFallback());
    }
}
