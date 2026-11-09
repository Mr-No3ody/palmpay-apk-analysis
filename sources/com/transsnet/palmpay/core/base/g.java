package com.transsnet.palmpay.core.base;

import android.util.Log;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Consumer {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Log.e("BaseApplication", "WorkManager init error", (Throwable) obj);
    }
}
