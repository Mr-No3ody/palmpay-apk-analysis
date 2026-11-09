package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.QueryMemberByKeywordResp;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBizConfigResp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface TransferToMobileContract$IView extends IBaseView {
    default void getTransferConfig(CommonBeanResult<TransferBizConfigResp> commonBeanResult) {
    }

    default void showQueryMemberByKeyword(QueryMemberByKeywordResp queryMemberByKeywordResp, String str) {
    }

    void showQueryMemberDetail(QueryMemberDetailResp queryMemberDetailResp, String str);

    void showQueryMemberDetailError(String str);

    default void showRecipientsResp(List<QueryMemberDetailResp.Data> list) {
    }
}
