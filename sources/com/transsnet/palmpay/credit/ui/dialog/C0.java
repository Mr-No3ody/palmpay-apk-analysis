package com.transsnet.palmpay.credit.ui.dialog;

import com.transsnet.palmpay.credit.view.CountdownTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 implements CountdownTextView.CountdownListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcNoPermissionDialog f29939a;

    public C0(OcNoPermissionDialog ocNoPermissionDialog) {
        this.f29939a = ocNoPermissionDialog;
    }

    @Override // com.transsnet.palmpay.credit.view.CountdownTextView.CountdownListener
    public final void onCountdownFinished() {
        OcNoPermissionDialog ocNoPermissionDialog = this.f29939a;
        ocNoPermissionDialog.mSetCountdownListener.invoke();
        ocNoPermissionDialog.dismiss();
    }
}
