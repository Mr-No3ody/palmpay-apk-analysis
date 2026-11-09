package com.google.android.gms.internal.measurement;

import com.airbnb.lottie.model.layer.d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzafq {
    public static final /* synthetic */ int zza = 0;
    private static final zzafz zzb;

    static {
        int i7 = zzacf.zza;
        zzb = new zzagb();
    }

    @Deprecated
    public static int zzA(int i7, zzafc zzafcVar, zzafp zzafpVar) {
        int iZzE = zzada.zzE(i7 << 3);
        return ((zzacb) zzafcVar).zzcf(zzafpVar) + iZzE + iZzE;
    }

    public static zzafz zzB() {
        return zzb;
    }

    public static boolean zzC(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzD(zzadg zzadgVar, Object obj, Object obj2) {
        if (((zzadr) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzE(zzafz zzafzVar, Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVarZzc = zzaduVar.zzc;
        zzaga zzagaVar = ((zzadu) obj2).zzc;
        if (!zzaga.zza().equals(zzagaVar)) {
            if (zzaga.zza().equals(zzagaVarZzc)) {
                zzagaVarZzc = zzaga.zzc(zzagaVarZzc, zzagaVar);
            } else {
                zzagaVarZzc.zzl(zzagaVar);
            }
        }
        zzaduVar.zzc = zzagaVarZzc;
    }

    public static Object zzF(Object obj, int i7, List list, zzadz zzadzVar, Object obj2, zzafz zzafzVar) {
        if (zzadzVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzadzVar.zza(iIntValue)) {
                    obj2 = zzG(obj, i7, iIntValue, obj2, zzafzVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (zzadzVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzG(obj, i7, iIntValue2, obj2, zzafzVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzG(Object obj, int i7, int i10, Object obj2, zzafz zzafzVar) {
        if (obj2 == null) {
            obj2 = zzafzVar.zzh(obj);
        }
        zzafzVar.zza(obj2, i7, i10);
        return obj2;
    }

    public static void zza(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzC(i7, list, z3);
    }

    public static void zzb(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzB(i7, list, z3);
    }

    public static void zzc(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzy(i7, list, z3);
    }

    public static void zzd(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzz(i7, list, z3);
    }

    public static void zze(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzL(i7, list, z3);
    }

    public static void zzf(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzA(i7, list, z3);
    }

    public static void zzg(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzJ(i7, list, z3);
    }

    public static void zzh(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzw(i7, list, z3);
    }

    public static void zzi(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzH(i7, list, z3);
    }

    public static void zzj(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzK(i7, list, z3);
    }

    public static void zzk(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzx(i7, list, z3);
    }

    public static void zzl(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzI(i7, list, z3);
    }

    public static void zzm(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzD(i7, list, z3);
    }

    public static void zzn(int i7, List list, zzago zzagoVar, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagoVar.zzE(i7, list, z3);
    }

    public static int zzo(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iZzF = 0;
            while (i7 < size) {
                iZzF += zzada.zzF(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzF;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iZzF2 = 0;
        while (i7 < size) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i7));
            i7++;
        }
        return iZzF2;
    }

    public static int zzp(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iZzF = 0;
            while (i7 < size) {
                iZzF += zzada.zzF(((Long) list.get(i7)).longValue());
                i7++;
            }
            return iZzF;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iZzF2 = 0;
        while (i7 < size) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i7));
            i7++;
        }
        return iZzF2;
    }

    public static int zzq(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iZzF = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzF += zzada.zzF((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
            return iZzF;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iZzF2 = 0;
        while (i7 < size) {
            long jZzc = zzaeqVar.zzc(i7);
            iZzF2 += zzada.zzF((jZzc >> 63) ^ (jZzc + jZzc));
            i7++;
        }
        return iZzF2;
    }

    public static int zzr(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iZzF = 0;
            while (i7 < size) {
                iZzF += zzada.zzF(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzF;
        }
        zzadv zzadvVar = (zzadv) list;
        int iZzF2 = 0;
        while (i7 < size) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i7));
            i7++;
        }
        return iZzF2;
    }

    public static int zzs(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iZzF = 0;
            while (i7 < size) {
                iZzF += zzada.zzF(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzF;
        }
        zzadv zzadvVar = (zzadv) list;
        int iZzF2 = 0;
        while (i7 < size) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i7));
            i7++;
        }
        return iZzF2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iZzE = 0;
            while (i7 < size) {
                iZzE += zzada.zzE(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return iZzE;
        }
        zzadv zzadvVar = (zzadv) list;
        int iZzE2 = 0;
        while (i7 < size) {
            iZzE2 += zzada.zzE(zzadvVar.zzf(i7));
            i7++;
        }
        return iZzE2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iZzE = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzE += zzada.zzE((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
            return iZzE;
        }
        zzadv zzadvVar = (zzadv) list;
        int iZzE2 = 0;
        while (i7 < size) {
            int iZzf = zzadvVar.zzf(i7);
            iZzE2 += zzada.zzE((iZzf >> 31) ^ (iZzf + iZzf));
            i7++;
        }
        return iZzE2;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i7, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.zzE(i7 << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i7, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.zzE(i7 << 3) + 8) * size;
    }

    public static int zzz(int i7, Object obj, zzafp zzafpVar) {
        int i10 = i7 << 3;
        if (obj instanceof zzaem) {
            int iZzE = zzada.zzE(i10);
            int iZzb = ((zzaem) obj).zzb();
            return d.a(iZzb, iZzb, iZzE);
        }
        int iZzE2 = zzada.zzE(i10);
        int iZzcf = ((zzacb) obj).zzcf(zzafpVar);
        return d.a(iZzcf, iZzcf, iZzE2);
    }
}
