package com.transsnet.palmpay.core.dialog;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NgSelectBankCardDialog f27381a;

    public e(NgSelectBankCardDialog ngSelectBankCardDialog) {
        this.f27381a = ngSelectBankCardDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        int i7 = p025ba.e.cdspm_close_iv;
        NgSelectBankCardDialog ngSelectBankCardDialog = this.f27381a;
        if (id2 == i7) {
            ngSelectBankCardDialog.dismiss();
        } else {
            if (id2 != p025ba.e.cdspm_add_bank_card || ngSelectBankCardDialog.mCallBack == null) {
                return;
            }
            ngSelectBankCardDialog.mCallBack.onAddBankcardClick();
        }
    }
}
