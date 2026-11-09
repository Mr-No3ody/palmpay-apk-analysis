package com.google.android.gms.internal.measurement;

import C0.G;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzacr implements Iterable, Serializable {
    public static final zzacr zza = new zzacq(zzaed.zza);
    private int zzb = 0;

    static {
        int i7 = zzacf.zza;
    }

    public static zzacr zzj(byte[] bArr, int i7, int i10) {
        try {
            return zzk(bArr, i7, i10, false);
        } catch (zzaeh e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static zzacr zzk(byte[] bArr, int i7, int i10, boolean z3) throws zzaeh {
        if (i10 == 0) {
            return zza;
        }
        zzn(i7, i7 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        return new zzacq(bArr2);
    }

    public static zzacr zzl(byte[] bArr, boolean z3) throws zzaeh {
        return bArr.length == 0 ? zza : new zzacq(bArr);
    }

    public static int zzn(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i7);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i7) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i10).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i7);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static /* synthetic */ boolean zzo(byte[] bArr, int i7, byte[] bArr2, int i10, int i11) {
        int i12 = i7 + i11;
        zzn(i7, i12, bArr.length);
        zzn(i10, i11 + i10, bArr2.length);
        while (i7 < i12) {
            if (bArr[i7] != bArr2[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iZzb = zzb();
        if (iZzb != zzacrVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i7 = this.zzb;
        int i10 = zzacrVar.zzb;
        if (i7 == 0 || i10 == 0 || i7 == i10) {
            return zzf(zzacrVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzg = this.zzb;
        if (iZzg == 0) {
            int iZzb = zzb();
            iZzg = zzg(iZzb, 0, iZzb);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zzb = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzack(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        String strZza = zzb() <= 50 ? zzafx.zza(zzm()) : zzafx.zza(zzc(0, 47).zzm()).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzb);
        sb2.append(" contents=\"");
        return G.r(sb2, strZza, "\">");
    }

    public abstract byte zza(int i7);

    public abstract int zzb();

    public abstract zzacr zzc(int i7, int i10);

    public abstract void zzd(byte[] bArr, int i7, int i10, int i11);

    public abstract void zze(zzacj zzacjVar) throws IOException;

    public abstract boolean zzf(zzacr zzacrVar);

    public abstract int zzg(int i7, int i10, int i11);

    public final byte[] zzm() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzaed.zza;
        }
        byte[] bArr = new byte[iZzb];
        zzd(bArr, 0, 0, iZzb);
        return bArr;
    }
}
