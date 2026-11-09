package com.google.android.gms.internal.measurement;

import com.airbnb.lottie.model.layer.d;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaga {
    private static final zzaga zza = new zzaga(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaga(int i7, int[] iArr, Object[] objArr, boolean z3) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z3;
    }

    public static zzaga zza() {
        return zza;
    }

    public static zzaga zzb() {
        return new zzaga(0, new int[8], new Object[8], true);
    }

    public static zzaga zzc(zzaga zzagaVar, zzaga zzagaVar2) {
        int i7 = zzagaVar.zzb + zzagaVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzagaVar.zzc, i7);
        System.arraycopy(zzagaVar2.zzc, 0, iArrCopyOf, zzagaVar.zzb, zzagaVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzagaVar.zzd, i7);
        System.arraycopy(zzagaVar2.zzd, 0, objArrCopyOf, zzagaVar.zzb, zzagaVar2.zzb);
        return new zzaga(i7, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaga)) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        int i7 = this.zzb;
        if (i7 == zzagaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzagaVar.zzc;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzagaVar.zzd;
            int i11 = this.zzb;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i10 = i7 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzago zzagoVar) throws IOException {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzagoVar.zzv(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzg(zzago zzagoVar) throws IOException {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i10 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzagoVar.zzc(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzagoVar.zzj(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzagoVar.zzn(i12, (zzacr) obj);
                } else if (i11 == 3) {
                    zzagoVar.zzt(i12);
                    ((zzaga) obj).zzg(zzagoVar);
                    zzagoVar.zzu(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzaeg("Protocol message tag had invalid wire type."));
                    }
                    zzagoVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iA = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzacr zzacrVar = (zzacr) this.zzd[i10];
            int iZzE = zzada.zzE(8);
            int iZzE2 = zzada.zzE(i11) + zzada.zzE(16);
            int iZzE3 = zzada.zzE(24);
            int iZzb = zzacrVar.zzb();
            iA += iZzE + iZzE + iZzE2 + d.a(iZzb, iZzb, iZzE3);
        }
        this.zze = iA;
        return iA;
    }

    public final int zzi() {
        int iZzE;
        int iZzF;
        int iZzE2;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = i12 << 3;
                        zzacr zzacrVar = (zzacr) this.zzd[i10];
                        int iZzE3 = zzada.zzE(i14);
                        int iZzb = zzacrVar.zzb();
                        iB = d.b(iZzb, iZzb, iZzE3, iB);
                    } else if (i13 == 3) {
                        int iZzE4 = zzada.zzE(i12 << 3);
                        iZzE = iZzE4 + iZzE4;
                        iZzF = ((zzaga) this.zzd[i10]).zzi();
                    } else {
                        if (i13 != 5) {
                            throw new IllegalStateException(new zzaeg("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i10]).getClass();
                        iZzE2 = zzada.zzE(i12 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i10]).getClass();
                    iZzE2 = zzada.zzE(i12 << 3) + 8;
                }
                iB = iZzE2 + iB;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzE = zzada.zzE(i15);
                iZzF = zzada.zzF(jLongValue);
            }
            iB = iZzF + iZzE + iB;
        }
        this.zze = iB;
        return iB;
    }

    public final void zzj(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzafe.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzk(int i7, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final zzaga zzl(zzaga zzagaVar) {
        if (zzagaVar.equals(zza)) {
            return this;
        }
        zze();
        int i7 = this.zzb + zzagaVar.zzb;
        zzm(i7);
        System.arraycopy(zzagaVar.zzc, 0, this.zzc, this.zzb, zzagaVar.zzb);
        System.arraycopy(zzagaVar.zzd, 0, this.zzd, this.zzb, zzagaVar.zzb);
        this.zzb = i7;
        return this;
    }

    private zzaga() {
        this(0, new int[8], new Object[8], true);
    }
}
