package com.transsnet.palmpay.custom_view.dialog;

import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f31270b = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterface.OnDismissListener f31271a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        DialogInterface.OnDismissListener onDismissListener = this.f31271a;
        if (onDismissListener != null) {
            Intrinsics.e(onDismissListener);
            onDismissListener.onDismiss(dialog);
            this.f31271a = null;
        }
    }
}
