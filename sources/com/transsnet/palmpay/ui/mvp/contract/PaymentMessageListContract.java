package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface PaymentMessageListContract {

    public interface Presenter extends IBasePresenter<View> {
        void loadMessageList(int i7, boolean z3);

        void loadMessageList(Integer num, int i7, boolean z3);
    }

    public interface View extends IBaseView {
        void setTotalPage(int i7);

        void showLoading(boolean z3);

        void showMessageList(List<GetMsgRsp.DataBean.ListBean> list);

        void stopLoadMore();
    }
}
