package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class zzoe extends zzof {
    private volatile String zza;

    public zzoe(String str, String str2, zzph zzphVar) {
        super("com.google.android.gms.measurement", str2, zzphVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* bridge */ /* synthetic */ Object zzc(String str) throws IOException {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zzd(Object obj) throws IOException {
        return (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ Object zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ void zzh(Object obj) {
        this.zza = (String) obj;
    }
}
