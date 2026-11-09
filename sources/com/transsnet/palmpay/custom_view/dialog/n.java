package com.transsnet.palmpay.custom_view.dialog;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f31290d;

    public n(Context context) {
        this.f31287a = context;
    }

    public final LoadingDialog a() {
        LoadingDialog loadingDialog = new LoadingDialog(this.f31287a, com.transsnet.palmpay.custom_view.t.cv_layout_loading_dialog);
        loadingDialog.mAnimationId = this.f31290d;
        loadingDialog.setMessage(this.f31288b);
        loadingDialog.setIsDark(this.f31289c);
        loadingDialog.setOnCancelListener(null);
        return loadingDialog;
    }
}
