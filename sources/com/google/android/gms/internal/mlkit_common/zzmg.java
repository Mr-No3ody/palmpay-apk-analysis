package com.google.android.gms.internal.mlkit_common;

import C0.G;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: loaded from: classes2.dex */
final class zzmg extends zzms {
    private final zziy zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzje zzf;
    private final int zzg;

    public /* synthetic */ zzmg(zziy zziyVar, String str, boolean z3, boolean z8, ModelType modelType, zzje zzjeVar, int i7, zzmf zzmfVar) {
        this.zza = zziyVar;
        this.zzb = str;
        this.zzc = z3;
        this.zzd = z8;
        this.zze = modelType;
        this.zzf = zzjeVar;
        this.zzg = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzms) {
            zzms zzmsVar = (zzms) obj;
            if (this.zza.equals(zzmsVar.zzc()) && this.zzb.equals(zzmsVar.zze()) && this.zzc == zzmsVar.zzg() && this.zzd == zzmsVar.zzf() && this.zze.equals(zzmsVar.zzb()) && this.zzf.equals(zzmsVar.zzd()) && this.zzg == zzmsVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String string = this.zza.toString();
        String str = this.zzb;
        boolean z3 = this.zzc;
        boolean z8 = this.zzd;
        String string2 = this.zze.toString();
        String string3 = this.zzf.toString();
        int i7 = this.zzg;
        StringBuilder sbF = F.f("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=", str, ", shouldLogRoughDownloadTime=");
        sbF.append(z3);
        sbF.append(", shouldLogExactDownloadTime=");
        sbF.append(z8);
        sbF.append(", modelType=");
        u.x(sbF, string2, ", downloadStatus=", string3, ", failureStatusCode=");
        return G.n(i7, "}", sbF);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zziy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zzje zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzg() {
        return this.zzc;
    }
}
