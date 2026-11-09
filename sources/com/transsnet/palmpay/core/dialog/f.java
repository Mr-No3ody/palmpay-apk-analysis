package com.transsnet.palmpay.core.dialog;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemindTimeSelectDialog f27382a;

    public f(RemindTimeSelectDialog remindTimeSelectDialog) {
        this.f27382a = remindTimeSelectDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RemindTimeSelectDialog remindTimeSelectDialog = this.f27382a;
        RemindTimeSelectDialog.Callback callBack = remindTimeSelectDialog.getCallBack();
        if (callBack != null) {
            callBack.onDataSelected(remindTimeSelectDialog.getModelSelected(), remindTimeSelectDialog.getDataSelected());
        }
        remindTimeSelectDialog.dismiss();
    }
}
