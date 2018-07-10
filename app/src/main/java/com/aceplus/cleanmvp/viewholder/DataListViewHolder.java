package com.aceplus.cleanmvp.viewholder;

import android.view.View;
import android.widget.TextView;

import com.aceplus.cleanmvp.R;
import com.aceplus.cleanmvp.data.vo.Notice;
import com.aceplus.cleanmvp.delegate.HomeDelegate;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by kkk on 7/9/2018.
 */

public class DataListViewHolder extends BaseViewHolder<Notice> {
    @BindView(R.id.txt_notice_title)
    TextView noticeTitle;

    @BindView(R.id.txt_notice_brief)
    TextView noticeBrief;

    @BindView(R.id.txt_notice_file_path)
    TextView filePath;

    private HomeDelegate homeDelegate;

    Notice notice;

    public DataListViewHolder(View itemView, HomeDelegate homeDelegate) {
        super(itemView);
        this.homeDelegate = homeDelegate;
    }

    @Override
    public void setData(Notice data) {
        notice = data;
        noticeTitle.setText(data.getTitle());
        noticeBrief.setText(data.getBrief());
        filePath.setText(data.getFileSource());
    }

    @OnClick(R.id.txt_notice_file_path)
    void onClickFilePath() {
        homeDelegate.onTapFilePath(notice.getFileSource());
    }
}
