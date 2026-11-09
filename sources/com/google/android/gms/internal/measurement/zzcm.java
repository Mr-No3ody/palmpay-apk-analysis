package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcm extends zzcr {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zzf(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L30
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L30
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected object type. Expected, Received: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            r1.append(r3)
            throw r0
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcm.zzf(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void zzb(Bundle bundle) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.zzb = true;
                    this.zza.notify();
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String zzc(long j6) {
        return (String) zzf(zze(j6), String.class);
    }

    public final Long zzd(long j6) {
        return (Long) zzf(zze(j6), Long.class);
    }

    public final Bundle zze(long j6) {
        Bundle bundle;
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            if (!this.zzb) {
                try {
                    atomicReference.wait(j6);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }
}
