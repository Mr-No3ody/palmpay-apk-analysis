package com.google.android.gms.internal.measurement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzwp {
    private final int[] zza;
    private final zzwn zzb;
    private zzwn zzc;
    private int zzd;
    private int zze;
    private int zzf;

    private zzwp(int[] iArr) {
        this.zza = iArr;
        zzwn zzwnVar = new zzwn(-1, -1, null);
        this.zzb = zzwnVar;
        this.zzc = zzwnVar;
    }

    public static zzwp zza(int[] iArr) {
        zzwp zzwpVar = new zzwp(iArr);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            zzwpVar.zzf++;
            int[] iArr2 = zzwpVar.zza;
            int i10 = iArr2[i7];
            while (true) {
                zzwn zzwnVar = null;
                while (true) {
                    if (zzwpVar.zzf <= 0) {
                        break;
                    }
                    if (zzwpVar.zze == 0) {
                        break;
                    }
                    int i11 = ((zzwn) zzwpVar.zzc.zzd.get(Integer.valueOf(iArr2[zzwpVar.zzd]))).zza;
                    int i12 = zzwpVar.zze;
                    if (iArr2[i11 + i12] == i10) {
                        if (zzwnVar != null) {
                            zzwnVar.zzc = zzwpVar.zzc;
                        }
                        zzwpVar.zze = i12 + 1;
                        zzwpVar.zzb();
                        break;
                    }
                    zzwn zzwnVar2 = (zzwn) zzwpVar.zzc.zzd.get(Integer.valueOf(iArr2[zzwpVar.zzd]));
                    int i13 = zzwnVar2.zza;
                    zzwn zzwnVar3 = new zzwn(i13, (zzwpVar.zze + i13) - 1, null);
                    zzwpVar.zzc.zzd.put(Integer.valueOf(iArr2[zzwpVar.zzd]), zzwnVar3);
                    Map map = zzwnVar3.zzd;
                    int i14 = zzwnVar3.zzb + 1;
                    map.put(Integer.valueOf(iArr2[i14]), zzwnVar2);
                    zzwnVar2.zza = i14;
                    if (zzwnVar != null) {
                        zzwnVar.zzc = zzwnVar3;
                    }
                    map.put(Integer.valueOf(i10), new zzwn(i7, 1073741824, null));
                    zzwpVar.zzf--;
                    zzwpVar.zzc();
                    zzwnVar = zzwnVar3;
                }
                Map map2 = zzwpVar.zzc.zzd;
                Integer numValueOf = Integer.valueOf(i10);
                if (map2.containsKey(numValueOf)) {
                    if (zzwnVar != null) {
                        zzwnVar.zzc = zzwpVar.zzc;
                    }
                    zzwpVar.zzd = i7;
                    zzwpVar.zze++;
                    zzwpVar.zzb();
                    break;
                }
                zzwpVar.zzc.zzd.put(numValueOf, new zzwn(i7, 1073741824, null));
                if (zzwnVar != null) {
                    zzwnVar.zzc = zzwpVar.zzc;
                }
                zzwpVar.zzf--;
                zzwpVar.zzc();
            }
        }
        return zzwpVar;
    }

    private final void zze(zzwn zzwnVar, StringBuilder sb2) {
        for (zzwn zzwnVar2 : zzwnVar.zzd.values()) {
            sb2.append("  ");
            sb2.append(zzwnVar);
            sb2.append(" -> ");
            sb2.append(zzwnVar2);
            sb2.append(" [label=\"");
            int[] iArr = this.zza;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, zzwnVar2.zza, Math.min(iArr.length, zzwnVar2.zzb + 1))));
            sb2.append("\"]\n");
            zze(zzwnVar2, sb2);
        }
    }

    private final boolean zzf(int i7, int i10, int i11, int i12) {
        if (i7 >= 0 && i11 >= 0) {
            int[] iArr = this.zza;
            int length = iArr.length;
            int iMin = Math.min(length, i10);
            if (iMin - i7 == Math.min(length, i12) - i11) {
                for (int i13 = i7; i13 <= iMin; i13++) {
                    if (iArr[i13] != iArr[(i11 + i13) - i7]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("digraph {\n");
        zze(this.zzb, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public final void zzb() {
        if (this.zze == 0) {
            return;
        }
        Map map = this.zzc.zzd;
        int[] iArr = this.zza;
        zzwn zzwnVar = (zzwn) map.get(Integer.valueOf(iArr[this.zzd]));
        while (true) {
            int i7 = (zzwnVar.zzb - zzwnVar.zza) + 1;
            int i10 = this.zze;
            if (i7 > i10) {
                return;
            }
            int i11 = this.zzd + i7;
            this.zzd = i11;
            this.zzc = zzwnVar;
            int i12 = i10 - i7;
            this.zze = i12;
            if (i12 > 0) {
                zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[i11]));
            }
        }
    }

    public final void zzc() {
        zzwn zzwnVar = this.zzc.zzc;
        if (zzwnVar != null) {
            this.zzc = zzwnVar;
        } else {
            this.zzc = this.zzb;
            int i7 = this.zze;
            if (i7 > 0) {
                this.zze = i7 - 1;
            }
            if (this.zzf > 0) {
                this.zzd++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    public final zzwo zzd() {
        int i7;
        int i10;
        zzwm zzwmVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        zzwn zzwnVar = this.zzb;
        zzwm zzwmVar2 = new zzwm(zzwnVar, 0, -1, -1, null);
        arrayDeque.push(zzwmVar2);
        while (!arrayDeque.isEmpty()) {
            zzwm zzwmVar3 = (zzwm) arrayDeque.pop();
            for (zzwn zzwnVar2 : zzwmVar3.zzd.zzd.values()) {
                int i11 = zzwmVar3.zzb;
                int i12 = zzwmVar3.zzc;
                int i13 = zzwnVar2.zza;
                int i14 = zzwnVar2.zzb;
                if (zzf(i11, i12, i13, i14)) {
                    zzwmVar = new zzwm(zzwnVar2, zzwmVar3.zza + 1, i11, i12, null);
                } else {
                    if (zzwnVar2.zzd.isEmpty()) {
                        int i15 = zzwnVar2.zza;
                        if (zzf(i11, i12, i15, (i15 + i12) - i11)) {
                            zzwmVar = new zzwm(zzwnVar2, zzwmVar3.zza + 1, i11, i12, null);
                        }
                    }
                    zzwmVar = new zzwm(zzwnVar2, 1, zzwnVar2.zza, i14, null);
                }
                if (zzwmVar2.zza < zzwmVar.zza) {
                    zzwmVar2 = zzwmVar;
                }
                arrayDeque.push(zzwmVar);
            }
        }
        int[] iArr = this.zza;
        int iMin = Math.min(iArr.length, zzwmVar2.zzc + 1);
        int i16 = 0;
        loop2: while (true) {
            i7 = zzwmVar2.zzb;
            i10 = iMin - i7;
            zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[(i16 % i10) + i7]));
            if (zzwnVar == null) {
                break;
            }
            for (int i17 = zzwnVar.zza; i17 < zzwnVar.zzb + 1 && i17 < iArr.length; i17++) {
                if (iArr[(i16 % i10) + i7] != iArr[i17]) {
                    break loop2;
                }
                i16++;
            }
        }
        return new zzwo(i7, iMin, i16 / i10);
    }
}
