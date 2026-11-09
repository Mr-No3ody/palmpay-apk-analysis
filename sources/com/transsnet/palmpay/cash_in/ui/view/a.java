package com.transsnet.palmpay.cash_in.ui.view;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f27088a;

    public a(ModelUssdInfo view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f27088a = new WeakReference(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView ussd_countdown;
        WeakReference weakReference = this.f27088a;
        ModelUssdInfo modelUssdInfo = weakReference != null ? (ModelUssdInfo) weakReference.get() : null;
        if (modelUssdInfo == null || (ussd_countdown = modelUssdInfo.getUssd_countdown()) == null) {
            return;
        }
        long j6 = modelUssdInfo.f27086e;
        ModelUssdInfo.f27081g.updateCountdownTime(ussd_countdown, j6);
        if (j6 > System.currentTimeMillis()) {
            ussd_countdown.postDelayed(this, 1000L);
        }
    }
}
