package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgk extends zzadp implements zzafd {
    private zzgk() {
        throw null;
    }

    public final int zza() {
        return ((zzgl) this.zza).zzf();
    }

    public final zzgj zzb(int i7) {
        return ((zzgl) this.zza).zzh(i7);
    }

    public final zzgk zzc(int i7, zzgi zzgiVar) {
        zzaY();
        ((zzgl) this.zza).zzu(i7, (zzgj) zzgiVar.zzbd());
        return this;
    }

    public final List zzd() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzi());
    }

    public final zzgk zze() {
        zzaY();
        ((zzgl) this.zza).zzv();
        return this;
    }

    public final zzgk zzf() {
        zzaY();
        ((zzgl) this.zza).zzw();
        return this;
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzl());
    }

    public final String zzh() {
        return ((zzgl) this.zza).zzm();
    }

    public final List zzi() {
        return Collections.unmodifiableList(((zzgl) this.zza).zzr());
    }

    public /* synthetic */ zzgk(byte[] bArr) {
        super(zzgl.zzw);
    }
}
