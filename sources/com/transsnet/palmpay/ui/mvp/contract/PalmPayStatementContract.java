package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderNoRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface PalmPayStatementContract {

    public interface Presenter extends IBasePresenter<View> {
        void loadBillData(int i7, int i10, String str, int i11, int i12, String str2);

        void queryBalanceAccount();

        void queryOrderNoByPayId(String str);
    }

    public interface View extends IBaseView {
        void handleBalanceAccountInfo(BalanceAccountInfo balanceAccountInfo);

        void onOrderNoReceived(String str, QueryOrderNoRsp queryOrderNoRsp);

        void setTotalPage(int i7);

        void showBillData(List<AccountFlowBean.DataBean.ListBean> list);

        void showLoadingView(boolean z3);

        void stopLoadMore();

        void updateTotalAmount(long j6, long j10);
    }
}
