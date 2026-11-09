package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: loaded from: classes2.dex */
final class zzme extends zzmr {
    private zziy zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private ModelType zze;
    private zzje zzf;
    private int zzg;
    private byte zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zza(zzje zzjeVar) {
        if (zzjeVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.zzf = zzjeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zzb(zziy zziyVar) {
        if (zziyVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.zza = zziyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zzc(int i7) {
        this.zzg = i7;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zzd(ModelType modelType) {
        if (modelType == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zze = modelType;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zze(boolean z3) {
        this.zzd = z3;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzmr zzf(boolean z3) {
        this.zzc = z3;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzmr zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmr
    public final zzms zzh() {
        zziy zziyVar;
        String str;
        ModelType modelType;
        zzje zzjeVar;
        if (this.zzh == 7 && (zziyVar = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zzjeVar = this.zzf) != null) {
            return new zzmg(zziyVar, str, this.zzc, this.zzd, modelType, zzjeVar, this.zzg, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" errorCode");
        }
        if (this.zzb == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb2.append(" modelType");
        }
        if (this.zzf == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
