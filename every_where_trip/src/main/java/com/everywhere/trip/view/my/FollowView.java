package com.everywhere.trip.view.my;

import com.everywhere.trip.base.BaseMvpView;
import com.everywhere.trip.bean.BanmiBean;
import com.everywhere.trip.bean.LikeBean;


public interface FollowView extends BaseMvpView {
    void onSuccess(BanmiBean.ResultEntity entity);
    void onFail(String msg);
}
