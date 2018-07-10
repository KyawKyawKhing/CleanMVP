package com.aceplus.cleanmvp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.aceplus.cleanmvp.R;
import com.aceplus.cleanmvp.data.vo.Notice;
import com.aceplus.cleanmvp.delegate.HomeDelegate;
import com.aceplus.cleanmvp.viewholder.DataListViewHolder;

/**
 * Created by kkk on 7/2/2018.
 */

public class NoticeListAdapter extends BaseRecyclerAdapter<DataListViewHolder, Notice> {
    private HomeDelegate homeDelegate;

    public NoticeListAdapter(Context context, HomeDelegate homeDelegate) {
        super(context);
        this.homeDelegate = homeDelegate;
    }

    @NonNull
    @Override
    public DataListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.data_list_item, parent, false);
        return new DataListViewHolder(view, homeDelegate);
    }
}
