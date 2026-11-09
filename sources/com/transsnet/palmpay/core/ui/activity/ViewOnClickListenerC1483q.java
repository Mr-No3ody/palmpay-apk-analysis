package com.transsnet.palmpay.core.ui.activity;

import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.rsp.CheckBankCardInfoRsp;
import java.util.Iterator;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1483q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CheckBankCardInfoRsp f27802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BindNewBankAccountActivity f27803b;

    public ViewOnClickListenerC1483q(BindNewBankAccountActivity bindNewBankAccountActivity, CheckBankCardInfoRsp checkBankCardInfoRsp) {
        this.f27803b = bindNewBankAccountActivity;
        this.f27802a = checkBankCardInfoRsp;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BankInfo bankInfo;
        String str = this.f27802a.data.bankCode;
        BindNewBankAccountActivity bindNewBankAccountActivity = this.f27803b;
        if (bindNewBankAccountActivity.f27475j != null && !TextUtils.isEmpty(str)) {
            Iterator it = bindNewBankAccountActivity.f27475j.iterator();
            do {
                if (!it.hasNext()) {
                    bankInfo = null;
                    break;
                }
                bankInfo = (BankInfo) it.next();
            } while (!bankInfo.bankCode.equals(str));
        } else {
            bankInfo = null;
            break;
        }
        if (bankInfo != null) {
            bindNewBankAccountActivity.f27474i = bankInfo;
            bindNewBankAccountActivity.f27477p.setBankCardInfo(bankInfo);
        }
        bindNewBankAccountActivity.n();
    }
}
