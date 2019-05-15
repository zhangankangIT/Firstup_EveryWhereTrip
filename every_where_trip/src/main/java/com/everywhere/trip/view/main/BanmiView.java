package com.everywhere.trip.view.main;

import com.everywhere.trip.base.BaseMvpView;
import com.everywhere.trip.bean.BanmiBean;


public interface BanmiView extends BaseMvpView{
    void onSuccess(BanmiBean.ResultEntity entity);
    void onFail(String msg);

    void toastShort(String msg);
}
