package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzze {
    public static /* synthetic */ boolean zza(int i7, zzyc zzycVar, StringBuilder sb2) {
        if (i7 - 1 != 0 || zzycVar == zzyc.zza) {
            return false;
        }
        sb2.append(zzycVar.zza());
        sb2.append('.');
        sb2.append(zzycVar.zzb());
        sb2.append(':');
        sb2.append(zzycVar.zzc());
        return true;
    }
}
