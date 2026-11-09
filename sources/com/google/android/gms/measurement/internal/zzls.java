package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
public enum zzls {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    zzls(int i7) {
        this.zzg = i7;
    }

    public static zzls zzb(int i7) {
        for (zzls zzlsVar : values()) {
            if (zzlsVar.zzg == i7) {
                return zzlsVar;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
