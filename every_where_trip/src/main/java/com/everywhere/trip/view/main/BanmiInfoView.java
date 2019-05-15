package com.everywhere.trip.view.main;

import com.everywhere.trip.base.BaseMvpView;
import com.everywhere.trip.bean.BanmiInfo;

public interface BanmiInfoView extends BaseMvpView{
    void onSuccess(BanmiInfo banmiInfo);
    void onFail(String msg);
}
