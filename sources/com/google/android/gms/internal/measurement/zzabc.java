package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzabc extends AbstractMap {
    private static final Comparator zza = new zzaaz();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd;
    private Integer zze;
    private String zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzabc, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.zzabc] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        int i7;
        Object objZza;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.zzd = new zzabb(abstractMap, -1);
        abstractMap.zze = null;
        abstractMap.zzf = null;
        int size = zzabcVar2.size() + zzabcVar.size();
        int i10 = zzabcVar.zzc[zzabcVar.size()] + zzabcVar2.zzc[zzabcVar2.size()];
        int i11 = 1;
        int i12 = size + 1;
        Object[] objArr2 = new Object[i10];
        int[] iArr = new int[i12];
        int i13 = 0;
        iArr[0] = size;
        Map.Entry entryZzg = zzabcVar.zzg(0);
        Map.Entry entryZzg2 = zzabcVar2.zzg(0);
        int i14 = 0;
        int i15 = 0;
        int iZzd = size;
        int i16 = 0;
        while (true) {
            if (entryZzg == null && entryZzg2 == null) {
                break;
            }
            i16++;
            if (entryZzg == null) {
                i7 = i11;
            } else {
                if (entryZzg2 == null) {
                    i7 = i11;
                } else {
                    i7 = i11;
                    int iCompareTo = ((String) entryZzg.getKey()).compareTo((String) entryZzg2.getKey());
                    if (iCompareTo == 0) {
                        int i17 = i14 + 1;
                        int i18 = i15 + 1;
                        objArr2[i16] = abstractMap.zzf((String) entryZzg.getKey(), i16);
                        zzabb zzabbVar = (zzabb) entryZzg.getValue();
                        zzabb zzabbVar2 = (zzabb) entryZzg2.getValue();
                        int i19 = i13;
                        int i20 = i19;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i19 >= zzabbVar.zzc() - zzabbVar.zzb() && i20 >= zzabbVar2.zzc() - zzabbVar2.zzb()) {
                                break;
                            }
                            int iCompare = i19 == zzabbVar.zzc() - zzabbVar.zzb() ? i7 : i20 == zzabbVar2.zzc() - zzabbVar2.zzb() ? -1 : i13;
                            if (iCompare == 0) {
                                int i21 = zzabe.zza;
                                iCompare = zzabe.zzb.compare(zzabbVar.zza(i19), zzabbVar2.zza(i20));
                            }
                            if (iCompare < 0) {
                                objZza = zzabbVar.zza(i19);
                                i19++;
                            } else {
                                int i22 = i20 + 1;
                                objZza = zzabbVar2.zza(i20);
                                i19 = iCompare == 0 ? i19 + 1 : i19;
                                i20 = i22;
                            }
                            objArr2[iZzd] = objZza;
                            iZzd++;
                            i13 = 0;
                            abstractMap = this;
                        }
                        iArr[i16] = iZzd;
                        entryZzg = zzabcVar.zzg(i18);
                        entryZzg2 = zzabcVar2.zzg(i17);
                        i15 = i18;
                        i14 = i17;
                        i11 = i7;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i13 = 0;
                        abstractMap = this;
                        i11 = i7;
                    }
                }
                i15++;
                iZzd = zzd(entryZzg, i16, iZzd, objArr2, iArr);
                entryZzg = zzabcVar.zzg(i15);
                i13 = 0;
                abstractMap = this;
                i11 = i7;
            }
            Map.Entry entry = entryZzg;
            i14++;
            int iZzd2 = zzd(entryZzg2, i16, iZzd, objArr2, iArr);
            entryZzg2 = zzabcVar2.zzg(i14);
            iZzd = iZzd2;
            entryZzg = entry;
            i13 = 0;
            abstractMap = this;
            i11 = i7;
        }
        int i23 = iArr[i13];
        int i24 = i23 - i16;
        if (i24 != 0) {
            for (int i25 = i13; i25 <= i16; i25 += i11) {
                iArr[i25] = iArr[i25] - i24;
            }
            int i26 = iArr[i16];
            int i27 = i26 - i16;
            if (zze(i10, i26)) {
                objArr = new Object[i26];
                System.arraycopy(objArr2, i13, objArr, i13, i16);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i23, objArr, i16, i27);
            objArr2 = objArr;
        }
        abstractMap.zzb = objArr2;
        int i28 = iArr[i13] + i11;
        abstractMap.zzc = zze(i12, i28) ? Arrays.copyOf(iArr, i28) : iArr;
    }

    private final int zzd(Map.Entry entry, int i7, int i10, Object[] objArr, int[] iArr) {
        zzabb zzabbVar = (zzabb) entry.getValue();
        int iZzc = zzabbVar.zzc() - zzabbVar.zzb();
        System.arraycopy(zzabbVar.zzb.zzb, zzabbVar.zzb(), objArr, i10, iZzc);
        objArr[i7] = zzf((String) entry.getKey(), i7);
        int i11 = i10 + iZzc;
        iArr[i7 + 1] = i11;
        return i11;
    }

    private static boolean zze(int i7, int i10) {
        return i7 > 16 && i7 * 9 > i10 * 10;
    }

    private final Map.Entry zzf(String str, int i7) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzabb(this, i7));
    }

    private final Map.Entry zzg(int i7) {
        if (i7 < this.zzc[0]) {
            return (Map.Entry) this.zzb[i7];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    public final /* synthetic */ Object[] zzb() {
        return this.zzb;
    }

    public final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    public zzabc(List list) {
        this.zzd = new zzabb(this, -1);
        this.zze = null;
        this.zzf = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.zzc = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
