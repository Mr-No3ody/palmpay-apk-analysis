package com.google.android.gms.internal.measurement;

import android.app.ActivityManager;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzqh implements Supplier {
    static final /* synthetic */ zzqh zza = new zzqh();

    private /* synthetic */ zzqh() {
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z3 = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            new StringBuilder(String.valueOf(runningAppProcessInfo.importance).length() + 17);
            if (runningAppProcessInfo.importance >= 400) {
                z3 = true;
            }
        } catch (RuntimeException unused) {
        }
        return new Boolean(z3);
    }
}
