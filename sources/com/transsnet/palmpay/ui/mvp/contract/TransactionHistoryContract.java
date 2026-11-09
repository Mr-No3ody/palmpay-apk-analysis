package com.transsnet.palmpay.ui.mvp.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.RewardOrderDetail;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface TransactionHistoryContract {

    public interface Presenter extends IBasePresenter<View> {
        default void delBill(String str, String str2) {
        }

        void getAmountSummary(int i7, int i10, String str, int i11, int i12);

        void getBillDownloadCount();

        void getSendCashDetail(String str);

        void loadTransactionData(int i7, int i10, String str, int i11, int i12, boolean z3);
    }

    public interface View extends IBaseView {
        void delBillResult();

        void getBillDownloadCount(boolean z3, String str);

        void getSendCashDetailResult(RewardOrderDetail rewardOrderDetail);

        void needOptBillResult();

        void showLoadingView(boolean z3);

        void showTransactionData(boolean z3, List<TransHistoryRsp.DataBean.ListBean> list);

        void stopLoadMore();

        void updateTotalAmount(int i7, int i10, long j6, long j10, String str);
    }
}
