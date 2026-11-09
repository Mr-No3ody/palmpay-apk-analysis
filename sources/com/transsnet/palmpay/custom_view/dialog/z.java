package com.transsnet.palmpay.custom_view.dialog;

import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VoucherMsgDialog f31329a;

    public z(VoucherMsgDialog voucherMsgDialog) {
        this.f31329a = voucherMsgDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        int i7 = com.transsnet.palmpay.custom_view.s.msg_close_iv;
        VoucherMsgDialog voucherMsgDialog = this.f31329a;
        if (id2 == i7) {
            voucherMsgDialog.dismiss();
            return;
        }
        if (id2 == com.transsnet.palmpay.custom_view.s.msg_skip_tv) {
            voucherMsgDialog.dismiss();
            if (voucherMsgDialog.mListener != null) {
                voucherMsgDialog.mListener.onSkip();
                return;
            }
            return;
        }
        if (id2 == com.transsnet.palmpay.custom_view.s.msg_operation) {
            String strTrim = voucherMsgDialog.mMsgInputEt.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_voucher_msg_dialog_no_msg);
                return;
            }
            voucherMsgDialog.dismiss();
            if (voucherMsgDialog.mListener != null) {
                voucherMsgDialog.mListener.onConfirm(strTrim);
            }
        }
    }
}
