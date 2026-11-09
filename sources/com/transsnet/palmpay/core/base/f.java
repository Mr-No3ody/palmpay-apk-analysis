package com.transsnet.palmpay.core.base;

import android.os.StrictMode;
import android.os.strictmode.Violation;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements StrictMode.OnThreadViolationListener {
    @Override // android.os.StrictMode.OnThreadViolationListener
    public final void onThreadViolation(Violation violation) {
        BaseApplication.lambda$openStrictMode$2(violation);
    }
}
