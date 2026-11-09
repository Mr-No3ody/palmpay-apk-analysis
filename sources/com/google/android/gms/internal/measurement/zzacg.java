package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzacg {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzadf zzd;
    public int zze;

    public zzacg() {
        int i7 = zzadf.zzb;
        int i10 = zzacf.zza;
        this.zzd = zzadf.zza;
    }

    public static /* synthetic */ String zza(int i7, int i10, byte b7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + b7 + String.valueOf(i7).length());
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i7);
        return sb2.toString();
    }

    public zzacg(zzadf zzadfVar) {
        zzadfVar.getClass();
        this.zzd = zzadfVar;
    }
}
