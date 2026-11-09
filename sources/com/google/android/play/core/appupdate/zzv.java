package com.google.android.play.core.appupdate;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends AppUpdateOptions.Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        if (this.zzc == 3) {
            return new zzx(this.zza, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z3) {
        this.zzb = z3;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int i7) {
        this.zza = i7;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }
}
