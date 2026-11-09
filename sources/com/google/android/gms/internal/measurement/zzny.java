package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class zzny extends zzof {
    private volatile boolean zza;

    public zzny(String str, String str2, zzph zzphVar) {
        super("com.google.android.gms.measurement", str2, zzphVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zzc(String str) throws IOException {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zzd(Object obj) throws IOException {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ Object zze() {
        return Boolean.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ void zzh(Object obj) {
        this.zza = ((Boolean) obj).booleanValue();
    }
}
