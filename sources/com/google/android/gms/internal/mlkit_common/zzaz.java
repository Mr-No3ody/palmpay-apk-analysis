package com.google.android.gms.internal.mlkit_common;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends zzar {
    static final zzar zza = new zzaz(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzaz(@CheckForNull Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static zzaz zzg(int i7, Object[] objArr, zzaq zzaqVar) {
        int iHighestOneBit;
        boolean z3;
        int i10;
        char c6;
        ?? r3;
        char c10;
        short[] sArr;
        boolean z8;
        int i11;
        ?? r16;
        boolean z10;
        ?? r10;
        Object[] objArr2;
        zzap zzapVar;
        boolean z11;
        int i12 = i7;
        Object[] objArrCopyOf = objArr;
        if (i12 == 0) {
            return (zzaz) zza;
        }
        zzap zzapVar2 = null;
        ?? r11 = 0;
        zzap zzapVar3 = null;
        zzap zzapVar4 = null;
        boolean z12 = false;
        int i13 = 1;
        if (i12 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzaf.zza(obj, obj2);
            return new zzaz(null, objArrCopyOf, 1);
        }
        zzac.zzb(i12, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        char c11 = 2;
        int iMax = Math.max(i12, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 != 1) {
            int i14 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i15 + i15;
                    int i18 = i16 + i16;
                    Object obj3 = objArrCopyOf[i17];
                    obj3.getClass();
                    Object obj4 = objArrCopyOf[i17 ^ i13];
                    obj4.getClass();
                    zzaf.zza(obj3, obj4);
                    int iZza = zzah.zza(obj3.hashCode());
                    while (true) {
                        int i19 = iZza & i14;
                        z8 = z12;
                        i11 = i13;
                        int i20 = bArr[i19] & UnsignedBytes.MAX_VALUE;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i18;
                            if (i16 < i15) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i16++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                            int i21 = ~i20;
                            Object obj5 = objArrCopyOf[i21 == true ? 1 : 0];
                            obj5.getClass();
                            zzap zzapVar5 = new zzap(obj3, obj4, obj5);
                            objArrCopyOf[i21 == true ? 1 : 0] = obj4;
                            zzapVar3 = zzapVar5;
                            break;
                        }
                        iZza = i19 + 1;
                        z12 = z8;
                        i13 = i11;
                    }
                    i15++;
                    z12 = z8;
                    i13 = i11;
                }
                z3 = z12;
                i10 = i13;
                if (i16 == i12) {
                    c6 = 2;
                    r3 = bArr;
                    r16 = z3;
                } else {
                    sArr = new Object[3];
                    sArr[z3 ? 1 : 0] = bArr;
                    sArr[i10] = Integer.valueOf(i16);
                    sArr[2] = zzapVar3;
                    r11 = sArr;
                    z11 = z3;
                }
            } else {
                z3 = false;
                i10 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i23 + i23;
                        int i25 = i22 + i22;
                        Object obj6 = objArrCopyOf[i24];
                        obj6.getClass();
                        Object obj7 = objArrCopyOf[i24 ^ 1];
                        obj7.getClass();
                        zzaf.zza(obj6, obj7);
                        int iZza2 = zzah.zza(obj6.hashCode());
                        while (true) {
                            int i26 = iZza2 & i14;
                            char c12 = (char) sArr[i26];
                            if (c12 == 65535) {
                                sArr[i26] = (short) i25;
                                if (i22 < i23) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i22++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c12])) {
                                int i27 = c12 ^ 1;
                                Object obj8 = objArrCopyOf[i27 == true ? 1 : 0];
                                obj8.getClass();
                                zzap zzapVar6 = new zzap(obj6, obj7, obj8);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj7;
                                zzapVar4 = zzapVar6;
                                break;
                            }
                            iZza2 = i26 + 1;
                        }
                    }
                    if (i22 == i12) {
                        r11 = sArr;
                        z11 = z3;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i22), zzapVar4};
                        z11 = z3;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i28 + i28;
                        int i31 = i29 + i29;
                        Object obj9 = objArrCopyOf[i30];
                        obj9.getClass();
                        Object obj10 = objArrCopyOf[i30 ^ 1];
                        obj10.getClass();
                        zzaf.zza(obj9, obj10);
                        int iZza3 = zzah.zza(obj9.hashCode());
                        while (true) {
                            int i32 = iZza3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i31;
                                if (i29 < i28) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i29++;
                                c10 = c11;
                                break;
                            }
                            c10 = c11;
                            if (obj9.equals(objArrCopyOf[i33])) {
                                int i34 = i33 ^ 1;
                                Object obj11 = objArrCopyOf[i34];
                                obj11.getClass();
                                zzap zzapVar7 = new zzap(obj9, obj10, obj11);
                                objArrCopyOf[i34] = obj10;
                                zzapVar2 = zzapVar7;
                                break;
                            }
                            iZza3 = i32 + 1;
                            c11 = c10;
                        }
                        i28++;
                        c11 = c10;
                    }
                    c6 = c11;
                    if (i29 == i12) {
                        r3 = iArr;
                        r16 = z3;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i29);
                        objArr3[c6] = zzapVar2;
                        r3 = objArr3;
                        r16 = z3;
                    }
                }
            }
            z10 = r3 instanceof Object[];
            r10 = r3;
            if (z10) {
                objArr2 = (Object[]) r3;
                zzapVar = (zzap) objArr2[c6];
                if (zzaqVar != null) {
                    throw zzapVar.zza();
                }
                zzaqVar.zzc = zzapVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i10]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj12;
                i12 = iIntValue;
            }
            return new zzaz(r10, objArrCopyOf, i12);
        }
        Object obj13 = objArrCopyOf[0];
        obj13.getClass();
        Object obj14 = objArrCopyOf[1];
        obj14.getClass();
        zzaf.zza(obj13, obj14);
        z11 = false;
        i10 = 1;
        c6 = 2;
        r3 = r11;
        r16 = z11;
        z10 = r3 instanceof Object[];
        r10 = r3;
        if (z10) {
            objArr2 = (Object[]) r3;
            zzapVar = (zzap) objArr2[c6];
            if (zzaqVar != null) {
                throw zzapVar.zza();
            }
            zzaqVar.zzc = zzapVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj15;
            i12 = iIntValue2;
        }
        return new zzaz(r10, objArrCopyOf, i12);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0038->B:21:0x004e], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0063->B:31:0x007a], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0089->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzar, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i7 = this.zzd;
        if (obj == null) {
            obj2 = null;
        } else if (i7 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length - 1;
            int iZza = zzah.zza(obj.hashCode());
            while (true) {
                int i10 = iZza & length;
                int i11 = bArr[i10] & UnsignedBytes.MAX_VALUE;
                if (i11 == 255) {
                    break;
                }
                if (obj.equals(objArr[i11])) {
                    obj2 = objArr[i11 ^ 1];
                } else {
                    iZza = i10 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length - 1;
            int iZza2 = zzah.zza(obj.hashCode());
            while (true) {
                int i12 = iZza2 & length2;
                char c6 = (char) sArr[i12];
                if (c6 == 65535) {
                    break;
                }
                if (obj.equals(objArr[c6])) {
                    obj2 = objArr[c6 ^ 1];
                } else {
                    iZza2 = i12 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length - 1;
            int iZza3 = zzah.zza(obj.hashCode());
            while (true) {
                int i13 = iZza3 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    break;
                }
                if (obj.equals(objArr[i14])) {
                    obj2 = objArr[i14 ^ 1];
                } else {
                    iZza3 = i13 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    public final zzak zza() {
        return new zzay(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    public final zzas zzd() {
        return new zzaw(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    public final zzas zze() {
        return new zzax(this, new zzay(this.zzb, 0, this.zzd));
    }
}
