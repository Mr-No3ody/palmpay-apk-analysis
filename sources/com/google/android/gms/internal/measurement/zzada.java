package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzada extends zzacj {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzagg.zza();
    Object zza;

    private zzada() {
        throw null;
    }

    public static int zzE(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzF(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public static int zzG(zzafc zzafcVar) {
        int iZzcq = zzafcVar.zzcq();
        return zzE(iZzcq) + iZzcq;
    }

    public final void zzH() {
        if (zzy() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i7, int i10) throws IOException;

    public abstract void zzc(int i7, int i10) throws IOException;

    public abstract void zzd(int i7, int i10) throws IOException;

    public abstract void zze(int i7, int i10) throws IOException;

    public abstract void zzf(int i7, long j6) throws IOException;

    public abstract void zzg(int i7, long j6) throws IOException;

    public abstract void zzh(int i7, boolean z3) throws IOException;

    public abstract void zzi(int i7, String str) throws IOException;

    public abstract void zzj(int i7, zzacr zzacrVar) throws IOException;

    public abstract void zzk(zzacr zzacrVar) throws IOException;

    public abstract void zzl(byte[] bArr, int i7, int i10) throws IOException;

    public abstract void zzm(int i7, zzafc zzafcVar) throws IOException;

    public abstract void zzn(int i7, zzacr zzacrVar) throws IOException;

    public abstract void zzo(zzafc zzafcVar) throws IOException;

    public abstract void zzp(byte b7) throws IOException;

    public abstract void zzq(int i7) throws IOException;

    public abstract void zzr(int i7) throws IOException;

    public abstract void zzs(int i7) throws IOException;

    public abstract void zzt(long j6) throws IOException;

    public abstract void zzu(long j6) throws IOException;

    public abstract void zzw(String str) throws IOException;

    public abstract void zzx() throws IOException;

    public abstract int zzy();

    public /* synthetic */ zzada(byte[] bArr) {
    }
}
