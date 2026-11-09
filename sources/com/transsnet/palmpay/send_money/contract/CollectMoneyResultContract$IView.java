package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherResp;

/* JADX INFO: loaded from: classes4.dex */
public interface CollectMoneyResultContract$IView extends IBaseView {
    void showApplyVoucherError(String str);

    void showApplyVoucherResult(ApplyVoucherResp applyVoucherResp);
}
