package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhz extends zzadp implements zzafd {
    private zzhz() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zzib) this.zza).zza());
    }

    public final int zzb() {
        return ((zzib) this.zza).zzb();
    }

    public final zzid zzc(int i7) {
        return ((zzib) this.zza).zzc(i7);
    }

    public final zzhz zzd(int i7, zzic zzicVar) {
        zzaY();
        ((zzib) this.zza).zzk(i7, (zzid) zzicVar.zzbd());
        return this;
    }

    public final zzhz zze(zzic zzicVar) {
        zzaY();
        ((zzib) this.zza).zzl((zzid) zzicVar.zzbd());
        return this;
    }

    public final zzhz zzf(Iterable iterable) {
        zzaY();
        ((zzib) this.zza).zzm(iterable);
        return this;
    }

    public final zzhz zzg() {
        zzaY();
        ((zzib) this.zza).zzn();
        return this;
    }

    public final String zzh() {
        return ((zzib) this.zza).zze();
    }

    public final zzhz zzi(String str) {
        zzaY();
        ((zzib) this.zza).zzo(str);
        return this;
    }

    public final zzhz zzj(String str) {
        zzaY();
        ((zzib) this.zza).zzp(str);
        return this;
    }

    public /* synthetic */ zzhz(byte[] bArr) {
        super(zzib.zzi);
    }
}
