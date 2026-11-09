package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
final class zzrj {
    static final zzrl zza;

    static {
        zzrl zzrhVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(zzrl.class, zzrl.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                zzrhVar = (zzrl) it.next();
                Preconditions.checkState(!it.hasNext(), "Expected at most one FlagsService");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                zzrhVar = new zzrh();
            }
            zza = zzrhVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
