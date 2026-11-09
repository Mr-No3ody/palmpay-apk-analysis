package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmk extends RuntimeException {
    private final int zza;

    public zzmk(int i7, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 2 + str.length());
            sb2.append(i7);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i7);
        }
        super(strValueOf, th);
        this.zza = i7;
    }

    public final int zza() {
        return this.zza;
    }
}
