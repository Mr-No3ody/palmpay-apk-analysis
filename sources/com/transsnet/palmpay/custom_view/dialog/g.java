package com.transsnet.palmpay.custom_view.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewTreeObserver.OnWindowAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f31268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dialog f31269b;

    public g(h hVar, Dialog dialog) {
        this.f31268a = hVar;
        this.f31269b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        h hVar = this.f31268a;
        DialogInterface.OnDismissListener onDismissListener = hVar.f31271a;
        if (onDismissListener != null) {
            Intrinsics.e(onDismissListener);
            onDismissListener.onDismiss(this.f31269b);
            hVar.f31271a = null;
        }
    }
}
