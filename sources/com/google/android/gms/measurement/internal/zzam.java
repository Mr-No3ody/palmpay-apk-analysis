package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
enum zzam {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    zzam(char c6) {
        this.zzk = c6;
    }

    public static zzam zza(char c6) {
        for (zzam zzamVar : values()) {
            if (zzamVar.zzk == c6) {
                return zzamVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char zzb() {
        return this.zzk;
    }
}
