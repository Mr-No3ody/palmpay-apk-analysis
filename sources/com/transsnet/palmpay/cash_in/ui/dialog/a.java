package com.transsnet.palmpay.cash_in.ui.dialog;

import android.view.View;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectPaymentBankCardDialog f26999a;

    public a(SelectPaymentBankCardDialog selectPaymentBankCardDialog) {
        this.f26999a = selectPaymentBankCardDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        int i7 = e.cdspm_close_iv;
        SelectPaymentBankCardDialog selectPaymentBankCardDialog = this.f26999a;
        if (id2 == i7) {
            selectPaymentBankCardDialog.dismiss();
        } else {
            if (id2 != e.cdspm_add_bank_card || selectPaymentBankCardDialog.mCallBack == null) {
                return;
            }
            selectPaymentBankCardDialog.mCallBack.onAddBankcardClick();
        }
    }
}
