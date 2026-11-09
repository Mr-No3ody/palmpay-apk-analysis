package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzbd extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    public zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i7 = zzbdVar.zzg;
        zzbdVar.zzg = i7 - 1;
        return i7;
    }

    public static /* synthetic */ Object zzg(zzbd zzbdVar, int i7) {
        return zzbdVar.zzA()[i7];
    }

    public static /* synthetic */ Object zzj(zzbd zzbdVar, int i7) {
        return zzbdVar.zzB()[i7];
    }

    public static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void zzm(zzbd zzbdVar, int i7, Object obj) {
        zzbdVar.zzB()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(@CheckForNull Object obj) {
        if (zzq()) {
            return -1;
        }
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzc = zzbe.zzc(obj2, iZza & iZzu);
        if (iZzc != 0) {
            int i7 = ~iZzu;
            int i10 = iZza & i7;
            do {
                int i11 = iZzc - 1;
                int i12 = zzz()[i11];
                if ((i12 & i7) == i10 && zzx.zza(obj, zzA()[i11])) {
                    return i11;
                }
                iZzc = i12 & iZzu;
            } while (iZzc != 0);
        }
        return -1;
    }

    private final int zzw(int i7, int i10, int i11, int i12) {
        Object objZzd = zzbe.zzd(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            zzbe.zze(objZzd, i11 & i13, i12 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        for (int i14 = 0; i14 <= i7; i14++) {
            int iZzc = zzbe.zzc(obj, i14);
            while (iZzc != 0) {
                int i15 = iZzc - 1;
                int i16 = iArrZzz[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int iZzc2 = zzbe.zzc(objZzd, i18);
                zzbe.zze(objZzd, i18, iZzc);
                iArrZzz[i15] = ((~i13) & i17) | (iZzc2 & i13);
                iZzc = i16 & i7;
            }
        }
        this.zze = objZzd;
        zzy(i13);
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(@CheckForNull Object obj) {
        if (zzq()) {
            return zzd;
        }
        int iZzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int iZzb = zzbe.zzb(obj, null, iZzu, obj2, zzz(), zzA(), null);
        if (iZzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[iZzb];
        zzp(iZzb, iZzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i7) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map mapZzl = zzl();
        if (mapZzl != null) {
            this.zzf = zzcn.zza(size(), 3, 1073741823);
            mapZzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.zzg; i7++) {
            if (zzx.zza(obj, zzB()[i7])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzay zzayVar = new zzay(this);
        this.zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.get(obj);
        }
        int iZzv = zzv(obj);
        if (iZzv == -1) {
            return null;
        }
        return zzB()[iZzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzba zzbaVar = new zzba(this);
        this.zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int i7;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i10 = this.zzf;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzbe.zzd(iMax2);
            zzy(iMax2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.put(obj, obj2);
        }
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int iZza = zzbf.zza(obj);
        int iZzu = zzu();
        int i13 = iZza & iZzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int iZzc = zzbe.zzc(obj3, i13);
        if (iZzc == 0) {
            if (i12 > iZzu) {
                iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i11);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                zzbe.zze(obj4, i13, i12);
            }
            i7 = 1;
        } else {
            int i14 = ~iZzu;
            int i15 = iZza & i14;
            int i16 = 0;
            while (true) {
                int i17 = iZzc - 1;
                int i18 = iArrZzz[i17];
                i7 = 1;
                int i19 = i18 & i14;
                if (i19 == i15 && zzx.zza(obj, objArrZzA[i17])) {
                    Object obj5 = objArrZzB[i17];
                    objArrZzB[i17] = obj2;
                    return obj5;
                }
                int i20 = i18 & iZzu;
                i16++;
                if (i20 == 0) {
                    if (i16 < 9) {
                        if (i12 <= iZzu) {
                            iArrZzz[i17] = (i12 & iZzu) | i19;
                            break;
                        }
                        iZzu = zzw(iZzu, zzbe.zza(iZzu), iZza, i11);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int iZze = zze();
                    while (iZze >= 0) {
                        linkedHashMap.put(zzA()[iZze], zzB()[iZze]);
                        iZze = zzf(iZze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzc = i20;
            }
        }
        int length = zzz().length;
        if (i12 > length) {
            int i21 = i7;
            int iMin = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzz(), iMin);
                this.zzb = Arrays.copyOf(zzA(), iMin);
                this.zzc = Arrays.copyOf(zzB(), iMin);
            }
        }
        zzz()[i11] = (~iZzu) & iZza;
        zzA()[i11] = obj;
        zzB()[i11] = obj2;
        this.zzg = i12;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map mapZzl = zzl();
        if (mapZzl != null) {
            return mapZzl.remove(obj);
        }
        Object objZzx = zzx(obj);
        if (objZzx == zzd) {
            return null;
        }
        return objZzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzl = zzl();
        return mapZzl != null ? mapZzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzbc zzbcVar = new zzbc(this);
        this.zzj = zzbcVar;
        return zzbcVar;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.zzg) {
            return i10;
        }
        return -1;
    }

    @CheckForNull
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzn() {
        this.zzf += 32;
    }

    public final void zzo(int i7) {
        this.zzf = zzcn.zza(12, 1, 1073741823);
    }

    public final void zzp(int i7, int i10) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArrZzz = zzz();
        Object[] objArrZzA = zzA();
        Object[] objArrZzB = zzB();
        int size = size();
        int i11 = size - 1;
        if (i7 >= i11) {
            objArrZzA[i7] = null;
            objArrZzB[i7] = null;
            iArrZzz[i7] = 0;
            return;
        }
        Object obj2 = objArrZzA[i11];
        objArrZzA[i7] = obj2;
        objArrZzB[i7] = objArrZzB[i11];
        objArrZzA[i11] = null;
        objArrZzB[i11] = null;
        iArrZzz[i7] = iArrZzz[i11];
        iArrZzz[i11] = 0;
        int iZza = zzbf.zza(obj2) & i10;
        int iZzc = zzbe.zzc(obj, iZza);
        if (iZzc == size) {
            zzbe.zze(obj, iZza, i7 + 1);
            return;
        }
        while (true) {
            int i12 = iZzc - 1;
            int i13 = iArrZzz[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                iArrZzz[i12] = ((i7 + 1) & i10) | (i13 & (~i10));
                return;
            }
            iZzc = i14;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public zzbd(int i7) {
        zzo(12);
    }
}
