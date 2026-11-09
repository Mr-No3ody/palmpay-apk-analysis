package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class zzoa extends zzof {
    private volatile double zza;

    public zzoa(String str, String str2, zzph zzphVar) {
        super("com.google.android.gms.measurement", "measurement.test.double_flag", zzphVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zzc(String str) throws IOException {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    public final /* synthetic */ Object zzd(Object obj) throws IOException {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ Object zze() {
        return Double.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final /* synthetic */ void zzh(Object obj) {
        this.zza = ((Double) obj).doubleValue();
    }
}
