package com.google.android.odml.image;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends ImageProperties {
    private final int zza;
    private final int zzb;

    public /* synthetic */ zzc(int i7, int i10, zza zzaVar) {
        this.zza = i7;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.zza == imageProperties.getImageFormat() && this.zzb == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i7 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(i7);
        sb2.append(", storageType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
