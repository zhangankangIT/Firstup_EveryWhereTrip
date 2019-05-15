package com.everywhere.trip.view.my;

import com.everywhere.trip.base.BaseMvpView;
import com.everywhere.trip.bean.LikeBean;


public interface LikeView extends BaseMvpView {
    void onSuccess(LikeBean.ResultEntity resultEntity);
    void onFail(String msg);
}
