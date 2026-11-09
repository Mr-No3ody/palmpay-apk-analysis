package com.google.android.gms.internal.maps;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbv extends zzbn {
    static final zzbn zza = new zzbv(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzbv(Object obj, Object[] objArr, int i7) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    public static zzbv zzg(int i7, Object[] objArr, zzbm zzbmVar) {
        boolean z3;
        int i10;
        int i11;
        short[] sArr;
        boolean z8;
        Object obj;
        boolean z10;
        ?? r16;
        int i12 = i7;
        Object[] objArrCopyOf = objArr;
        if (i12 == 0) {
            return (zzbv) zza;
        }
        zzbl zzblVar = null;
        ?? r3 = 0;
        zzbl zzblVar2 = null;
        zzbl zzblVar3 = null;
        boolean z11 = false;
        int i13 = 1;
        if (i12 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzbf.zza(obj2, obj3);
            return new zzbv(null, objArrCopyOf, 1);
        }
        zzbc.zzb(i12, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iZzf = zzbo.zzf(i12);
        if (i12 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzbf.zza(obj4, obj5);
            r16 = 0;
            i12 = 1;
            i10 = 1;
        } else {
            int i14 = iZzf - 1;
            if (iZzf <= 128) {
                byte[] bArr = new byte[iZzf];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj6 = objArrCopyOf[i18];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i18 ^ 1];
                    Objects.requireNonNull(obj7);
                    zzbf.zza(obj6, obj7);
                    int iZza = zzbg.zza(obj6.hashCode());
                    while (true) {
                        int i19 = iZza & i14;
                        z10 = z11;
                        int i20 = bArr[i19] & UnsignedBytes.MAX_VALUE;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj6;
                                objArrCopyOf[i17 ^ 1] = obj7;
                            }
                            i16++;
                            break;
                        }
                        if (obj6.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                            int i21 = ~i20;
                            Object obj8 = objArrCopyOf[i21 == true ? 1 : 0];
                            Objects.requireNonNull(obj8);
                            zzbl zzblVar4 = new zzbl(obj6, obj7, obj8);
                            objArrCopyOf[i21 == true ? 1 : 0] = obj7;
                            zzblVar2 = zzblVar4;
                            break;
                        }
                        iZza = i19 + 1;
                        z11 = z10;
                    }
                    i15++;
                    z11 = z10;
                }
                z3 = z11;
                obj = bArr;
                z8 = z3;
                if (i16 == i12) {
                    i10 = 1;
                    r3 = obj;
                    r16 = z8;
                } else {
                    sArr = new Object[3];
                    sArr[z3 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i16);
                    sArr[2] = zzblVar2;
                    r3 = sArr;
                    i10 = 1;
                    r16 = z3;
                }
            } else {
                z3 = false;
                if (iZzf <= 32768) {
                    sArr = new short[iZzf];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj9 = objArrCopyOf[i25];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i25 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbf.zza(obj9, obj10);
                        int iZza2 = zzbg.zza(obj9.hashCode());
                        while (true) {
                            int i26 = iZza2 & i14;
                            char c6 = (char) sArr[i26];
                            if (c6 == 65535) {
                                sArr[i26] = (short) i24;
                                if (i22 < i23) {
                                    objArrCopyOf[i24] = obj9;
                                    objArrCopyOf[i24 ^ 1] = obj10;
                                }
                                i22++;
                                break;
                            }
                            if (obj9.equals(objArrCopyOf[c6])) {
                                int i27 = c6 ^ 1;
                                Object obj11 = objArrCopyOf[i27 == true ? 1 : 0];
                                Objects.requireNonNull(obj11);
                                zzbl zzblVar5 = new zzbl(obj9, obj10, obj11);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj10;
                                zzblVar3 = zzblVar5;
                                break;
                            }
                            iZza2 = i26 + 1;
                        }
                    }
                    if (i22 == i12) {
                        r3 = sArr;
                        i10 = 1;
                        r16 = z3;
                    } else {
                        obj = new Object[]{sArr, Integer.valueOf(i22), zzblVar3};
                        z8 = z3;
                        i10 = 1;
                        r3 = obj;
                        r16 = z8;
                    }
                } else {
                    int[] iArr = new int[iZzf];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj12 = objArrCopyOf[i31];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i31 ^ i13];
                        Objects.requireNonNull(obj13);
                        zzbf.zza(obj12, obj13);
                        int iZza3 = zzbg.zza(obj12.hashCode());
                        while (true) {
                            int i32 = iZza3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i30;
                                if (i29 < i28) {
                                    objArrCopyOf[i30] = obj12;
                                    objArrCopyOf[i30 ^ 1] = obj13;
                                }
                                i29++;
                                i11 = i13;
                                break;
                            }
                            i11 = i13;
                            if (obj12.equals(objArrCopyOf[i33])) {
                                int i34 = i33 ^ 1;
                                Object obj14 = objArrCopyOf[i34];
                                Objects.requireNonNull(obj14);
                                zzbl zzblVar6 = new zzbl(obj12, obj13, obj14);
                                objArrCopyOf[i34] = obj13;
                                zzblVar = zzblVar6;
                                break;
                            }
                            iZza3 = i32 + 1;
                            i13 = i11;
                        }
                        i28++;
                        i13 = i11;
                    }
                    i10 = i13;
                    if (i29 == i12) {
                        r3 = iArr;
                        r16 = z3;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i10] = Integer.valueOf(i29);
                        objArr2[2] = zzblVar;
                        r3 = objArr2;
                        r16 = z3;
                    }
                }
            }
        }
        boolean z12 = r3 instanceof Object[];
        ?? r10 = r3;
        if (z12) {
            Object[] objArr3 = (Object[]) r3;
            zzbmVar.zzc = (zzbl) objArr3[2];
            Object obj15 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r10 = obj15;
            i12 = iIntValue;
        }
        return new zzbv(r10, objArrCopyOf, i12);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.maps.zzbn, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i7 = this.zzd;
            Object[] objArr = this.zzb;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzbg.zza(obj.hashCode());
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
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzbg.zza(obj.hashCode());
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
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzbg.zza(obj.hashCode());
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
            }
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

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbh zza() {
        return new zzbu(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zzd() {
        return new zzbs(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.maps.zzbn
    public final zzbo zze() {
        return new zzbt(this, new zzbu(this.zzb, 0, this.zzd));
    }
}
