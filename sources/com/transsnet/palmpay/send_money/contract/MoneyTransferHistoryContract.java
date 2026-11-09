package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface MoneyTransferHistoryContract {

    public interface Presenter extends IBasePresenter<View> {
        void getAmountSummary(int i7, int i10, String str, int i11, int i12);

        void loadTransactionData(int i7, int i10, String str, int i11, int i12, boolean z3);
    }

    public interface View extends IBaseView {
        void showLoadingView(boolean z3);

        void showTransactionData(boolean z3, List<TransHistoryRsp.DataBean.ListBean> list);

        void stopLoadMore();

        void updateTotalAmount(int i7, int i10, long j6, long j10, String str);
    }
}
