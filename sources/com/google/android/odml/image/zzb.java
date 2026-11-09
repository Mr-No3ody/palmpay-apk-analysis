package com.google.android.odml.image;

import C0.G;

/* JADX INFO: loaded from: classes2.dex */
final class zzb extends zzh {
    private Integer zza;
    private Integer zzb;

    @Override // com.google.android.odml.image.zzh
    public final zzh zza(int i7) {
        this.zza = Integer.valueOf(i7);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final zzh zzb(int i7) {
        this.zzb = Integer.valueOf(i7);
        return this;
    }

    @Override // com.google.android.odml.image.zzh
    public final ImageProperties zzc() {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzc(num.intValue(), this.zzb.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" imageFormat");
        }
        if (this.zzb == null) {
            sb2.append(" storageType");
        }
        String strValueOf = String.valueOf(sb2);
        throw new IllegalStateException(G.r(new StringBuilder(strValueOf.length() + 28), "Missing required properties:", strValueOf));
    }
}
