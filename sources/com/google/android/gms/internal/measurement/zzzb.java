package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public enum zzzb {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);

    private final boolean zzf;

    zzzb(boolean z3, boolean z8) {
        this.zzf = z8;
    }

    public final boolean zza() {
        return this.zzf;
    }
}
