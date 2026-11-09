package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.send_money.bean.QueryRecordResp;

/* JADX INFO: loaded from: classes4.dex */
public interface MoneyTransferRecordContract$IView extends IBaseView {
    void showMoneyTransferRecordList(QueryRecordResp queryRecordResp);

    void showQueryError(String str);
}
