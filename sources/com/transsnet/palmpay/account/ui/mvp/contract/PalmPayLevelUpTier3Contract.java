package com.transsnet.palmpay.account.ui.mvp.contract;

import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.CountryRegionList;
import com.transsnet.palmpay.account.bean.rsp.IdIdentityListRsp;
import com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface PalmPayLevelUpTier3Contract {

    public interface Presenter extends IBasePresenter<View> {
        void getIdIdentityList(boolean z3);

        void queryAddressFromBill(String str);

        void queryLatestBillOrder(String str);

        void queryRegionList(boolean z3);

        void submitApplication(ApplyForTier3Req applyForTier3Req);
    }

    public interface View extends IBaseView {
        default void handleApplicationResult(CommonBeanResult<Tier3ApplyStatusRsp> commonBeanResult) {
        }

        default void handleCountryRegionListData(boolean z3, List<CountryRegionList> list) {
        }

        default void handleIdIdentityListRsp(CommonListResultV2<IdIdentityListRsp> commonListResultV2, boolean z3) {
        }

        default void handleLatestBillOrder(LatestBillerOrderDetailRsp latestBillerOrderDetailRsp) {
        }

        default void handleQueryAddressFromBill(CommonBeanResult<QueryAddressFromBillRsp> commonBeanResult) {
        }

        void showLoadingView(boolean z3);

        default void showRetryIdentityListDialog(String str) {
        }
    }
}
