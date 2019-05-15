package com.everywhere.trip.view.main;

import com.everywhere.trip.base.BaseMvpView;
import com.everywhere.trip.bean.BundlesBean;

public interface SubjectView extends BaseMvpView {
    void onSuccess(BundlesBean.ResultEntity entity);
    void onFail(String msg);
}
