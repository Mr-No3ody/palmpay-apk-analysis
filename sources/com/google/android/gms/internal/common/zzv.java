package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i7 = this.zze;
        while (true) {
            int i10 = this.zze;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i10);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i7) {
                int i11 = iZzd + 1;
                this.zze = i11;
                if (i11 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i7 < iZzc) {
                    this.zzb.charAt(i7);
                }
                if (i7 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i7 != iZzc) {
                    int i12 = this.zzf;
                    if (i12 == 1) {
                        CharSequence charSequence = this.zzb;
                        int length = charSequence.length();
                        this.zze = -1;
                        if (length > i7) {
                            charSequence.charAt(length - 1);
                        }
                        iZzc = length;
                    } else {
                        this.zzf = i12 - 1;
                    }
                    return this.zzb.subSequence(i7, iZzc).toString();
                }
                i7 = this.zze;
            }
        }
    }

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);
}
