package com.google.android.gms.internal.measurement;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
final class zzbx extends zzcd {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzbx(String str, boolean z3, int i7, zzbv zzbvVar, int i10, byte[] bArr) {
        this.zzb = str;
        this.zzc = i7;
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzb.equals(zzcdVar.zza())) {
                zzcdVar.zzb();
                int i7 = this.zzc;
                int iZzd = zzcdVar.zzd();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == iZzd) {
                    zzcdVar.zzc();
                    int i10 = this.zzd;
                    int iZze = zzcdVar.zze();
                    if (i10 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i7 = this.zzc;
        if (i7 == 0) {
            throw null;
        }
        int i10 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.zzd != 0) {
            return (i10 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i7 = this.zzc;
        String str2 = BuildConfig.TRAVIS;
        if (i7 == 1) {
            str = "ALL_CHECKS";
        } else if (i7 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i7 != 3) {
            str = i7 != 4 ? BuildConfig.TRAVIS : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zzd == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + d.c(73, str3) + 52 + 1);
        u.x(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return F.d(sb2, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final zzbv zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcd
    public final int zze() {
        return this.zzd;
    }
}
