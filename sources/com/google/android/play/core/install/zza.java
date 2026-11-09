package com.google.android.play.core.install;

import androidx.camera.video.u;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    public zza(int i7, long j6, long j10, int i10, String str) {
        this.zza = i7;
        this.zzb = j6;
        this.zzc = j10;
        this.zzd = i10;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.zze = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.zza == installState.installStatus() && this.zzb == installState.bytesDownloaded() && this.zzc == installState.totalBytesToDownload() && this.zzd == installState.installErrorCode() && this.zze.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zza ^ 1000003;
        long j6 = this.zzb;
        long j10 = this.zzc;
        return (((((((i7 * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.zzd) * 1000003) ^ this.zze.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    public final int installErrorCode() {
        return this.zzd;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    public final int installStatus() {
        return this.zza;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.zze;
    }

    public final String toString() {
        int i7 = this.zza;
        long j6 = this.zzb;
        long j10 = this.zzc;
        int i10 = this.zzd;
        String str = this.zze;
        StringBuilder sb2 = new StringBuilder("InstallState{installStatus=");
        sb2.append(i7);
        sb2.append(", bytesDownloaded=");
        sb2.append(j6);
        u.v(sb2, ", totalBytesToDownload=", j10, ", installErrorCode=");
        sb2.append(i10);
        sb2.append(", packageName=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.zzc;
    }
}
