package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzadb implements zzago {
    private final zzada zza;

    private zzadb(zzada zzadaVar) {
        this.zza = zzadaVar;
        zzadaVar.zza = this;
    }

    public static zzadb zza(zzada zzadaVar) {
        Object obj = zzadaVar.zza;
        return obj != null ? (zzadb) obj : new zzadb(zzadaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzA(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzg(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z3) {
            while (i10 < zzaeqVar.size()) {
                this.zza.zzg(i7, zzaeqVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzaeqVar.size(); i14++) {
            zzaeqVar.zzc(i14);
            i13 += 8;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzaeqVar.size()) {
            zzadaVar2.zzu(zzaeqVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzB(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadm)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zze(i7, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Float) list.get(i12)).getClass();
                i11 += 4;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzs(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        zzadm zzadmVar = (zzadm) list;
        if (!z3) {
            while (i10 < zzadmVar.size()) {
                this.zza.zze(i7, Float.floatToRawIntBits(zzadmVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzadmVar.size(); i14++) {
            zzadmVar.zze(i14);
            i13 += 4;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzadmVar.size()) {
            zzadaVar2.zzs(Float.floatToRawIntBits(zzadmVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzC(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadc)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzg(i7, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Double) list.get(i12)).getClass();
                i11 += 8;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        zzadc zzadcVar = (zzadc) list;
        if (!z3) {
            while (i10 < zzadcVar.size()) {
                this.zza.zzg(i7, Double.doubleToRawLongBits(zzadcVar.zze(i10)));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzadcVar.size(); i14++) {
            zzadcVar.zze(i14);
            i13 += 8;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzadcVar.size()) {
            zzadaVar2.zzu(Double.doubleToRawLongBits(zzadcVar.zze(i10)));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzD(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzc(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzF += zzada.zzF(((Integer) list.get(i11)).intValue());
            }
            zzadaVar.zzr(iZzF);
            while (i10 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                this.zza.zzc(i7, zzadvVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzadvVar.size(); i12++) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i12));
        }
        zzadaVar2.zzr(iZzF2);
        while (i10 < zzadvVar.size()) {
            zzadaVar2.zzq(zzadvVar.zzf(i10));
            i10++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzE(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaci)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzh(i7, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Boolean) list.get(i12)).getClass();
                i11++;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzp(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        zzaci zzaciVar = (zzaci) list;
        if (!z3) {
            while (i10 < zzaciVar.size()) {
                this.zza.zzh(i7, zzaciVar.zze(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzaciVar.size(); i14++) {
            zzaciVar.zze(i14);
            i13++;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzaciVar.size()) {
            zzadaVar2.zzp(zzaciVar.zze(i10) ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzF(int i7, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaen)) {
            while (i10 < list.size()) {
                this.zza.zzi(i7, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzaen zzaenVar = (zzaen) list;
        while (i10 < list.size()) {
            Object objZzc = zzaenVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzi(i7, (String) objZzc);
            } else {
                this.zza.zzj(i7, (zzacr) objZzc);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzG(int i7, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzj(i7, (zzacr) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzH(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzd(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzE += zzada.zzE(((Integer) list.get(i11)).intValue());
            }
            zzadaVar.zzr(iZzE);
            while (i10 < list.size()) {
                zzadaVar.zzr(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                this.zza.zzd(i7, zzadvVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzadvVar.size(); i12++) {
            iZzE2 += zzada.zzE(zzadvVar.zzf(i12));
        }
        zzadaVar2.zzr(iZzE2);
        while (i10 < zzadvVar.size()) {
            zzadaVar2.zzr(zzadvVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzI(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zze(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                this.zza.zze(i7, zzadvVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzadvVar.size(); i14++) {
            zzadvVar.zzf(i14);
            i13 += 4;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzadvVar.size()) {
            zzadaVar2.zzs(zzadvVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzJ(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzg(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzu(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z3) {
            while (i10 < zzaeqVar.size()) {
                this.zza.zzg(i7, zzaeqVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzaeqVar.size(); i14++) {
            zzaeqVar.zzc(i14);
            i13 += 8;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzaeqVar.size()) {
            zzadaVar2.zzu(zzaeqVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzK(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    zzada zzadaVar = this.zza;
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    zzadaVar.zzd(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            zzada zzadaVar2 = this.zza;
            zzadaVar2.zzb(i7, 2);
            int iZzE = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iZzE += zzada.zzE((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzadaVar2.zzr(iZzE);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                zzadaVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                zzada zzadaVar3 = this.zza;
                int iZzf = zzadvVar.zzf(i10);
                zzadaVar3.zzd(i7, (iZzf >> 31) ^ (iZzf + iZzf));
                i10++;
            }
            return;
        }
        zzada zzadaVar4 = this.zza;
        zzadaVar4.zzb(i7, 2);
        int iZzE2 = 0;
        for (int i12 = 0; i12 < zzadvVar.size(); i12++) {
            int iZzf2 = zzadvVar.zzf(i12);
            iZzE2 += zzada.zzE((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzadaVar4.zzr(iZzE2);
        while (i10 < zzadvVar.size()) {
            int iZzf3 = zzadvVar.zzf(i10);
            zzadaVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzL(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z3) {
                while (i10 < list.size()) {
                    zzada zzadaVar = this.zza;
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    zzadaVar.zzf(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            zzada zzadaVar2 = this.zza;
            zzadaVar2.zzb(i7, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iZzF += zzada.zzF((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzadaVar2.zzr(iZzF);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                zzadaVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z3) {
            while (i10 < zzaeqVar.size()) {
                zzada zzadaVar3 = this.zza;
                long jZzc = zzaeqVar.zzc(i10);
                zzadaVar3.zzf(i7, (jZzc >> 63) ^ (jZzc + jZzc));
                i10++;
            }
            return;
        }
        zzada zzadaVar4 = this.zza;
        zzadaVar4.zzb(i7, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzaeqVar.size(); i12++) {
            long jZzc2 = zzaeqVar.zzc(i12);
            iZzF2 += zzada.zzF((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzadaVar4.zzr(iZzF2);
        while (i10 < zzaeqVar.size()) {
            long jZzc3 = zzaeqVar.zzc(i10);
            zzadaVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzM(int i7, zzaeu zzaeuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            zzadaVar.zzr(zzaev.zzc(zzaeuVar, entry.getKey(), entry.getValue()));
            zzaev.zzb(zzadaVar, zzaeuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzb(int i7, int i10) throws IOException {
        this.zza.zze(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzc(int i7, long j6) throws IOException {
        this.zza.zzf(i7, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzd(int i7, long j6) throws IOException {
        this.zza.zzg(i7, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zze(int i7, float f10) throws IOException {
        this.zza.zze(i7, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzf(int i7, double d2) throws IOException {
        this.zza.zzg(i7, Double.doubleToRawLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzg(int i7, int i10) throws IOException {
        this.zza.zzc(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzh(int i7, long j6) throws IOException {
        this.zza.zzf(i7, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzi(int i7, int i10) throws IOException {
        this.zza.zzc(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzj(int i7, long j6) throws IOException {
        this.zza.zzg(i7, j6);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzk(int i7, int i10) throws IOException {
        this.zza.zze(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzl(int i7, boolean z3) throws IOException {
        this.zza.zzh(i7, z3);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzm(int i7, String str) throws IOException {
        this.zza.zzi(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzn(int i7, zzacr zzacrVar) throws IOException {
        this.zza.zzj(i7, zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzo(int i7, int i10) throws IOException {
        this.zza.zzd(i7, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzp(int i7, int i10) throws IOException {
        this.zza.zzd(i7, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzq(int i7, long j6) throws IOException {
        this.zza.zzf(i7, (j6 >> 63) ^ (j6 + j6));
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzr(int i7, Object obj, zzafp zzafpVar) throws IOException {
        zzada zzadaVar = this.zza;
        zzacb zzacbVar = (zzacb) obj;
        zzadaVar.zzb(i7, 2);
        zzadaVar.zzr(zzacbVar.zzcf(zzafpVar));
        zzafpVar.zzf(zzacbVar, this);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzs(int i7, Object obj, zzafp zzafpVar) throws IOException {
        zzada zzadaVar = this.zza;
        zzadaVar.zzb(i7, 3);
        zzafpVar.zzf((zzacb) obj, this);
        zzadaVar.zzb(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    @Deprecated
    public final void zzt(int i7) throws IOException {
        this.zza.zzb(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    @Deprecated
    public final void zzu(int i7) throws IOException {
        this.zza.zzb(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzv(int i7, Object obj) throws IOException {
        if (obj instanceof zzacr) {
            this.zza.zzn(i7, (zzacr) obj);
        } else {
            this.zza.zzm(i7, (zzafc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzw(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzc(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzF += zzada.zzF(((Integer) list.get(i11)).intValue());
            }
            zzadaVar.zzr(iZzF);
            while (i10 < list.size()) {
                zzadaVar.zzq(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                this.zza.zzc(i7, zzadvVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzadvVar.size(); i12++) {
            iZzF2 += zzada.zzF(zzadvVar.zzf(i12));
        }
        zzadaVar2.zzr(iZzF2);
        while (i10 < zzadvVar.size()) {
            zzadaVar2.zzq(zzadvVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzx(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzadv)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zze(i7, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            zzadaVar.zzr(i11);
            while (i10 < list.size()) {
                zzadaVar.zzs(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        zzadv zzadvVar = (zzadv) list;
        if (!z3) {
            while (i10 < zzadvVar.size()) {
                this.zza.zze(i7, zzadvVar.zzf(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < zzadvVar.size(); i14++) {
            zzadvVar.zzf(i14);
            i13 += 4;
        }
        zzadaVar2.zzr(i13);
        while (i10 < zzadvVar.size()) {
            zzadaVar2.zzs(zzadvVar.zzf(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzy(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzF += zzada.zzF(((Long) list.get(i11)).longValue());
            }
            zzadaVar.zzr(iZzF);
            while (i10 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z3) {
            while (i10 < zzaeqVar.size()) {
                this.zza.zzf(i7, zzaeqVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzaeqVar.size(); i12++) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i12));
        }
        zzadaVar2.zzr(iZzF2);
        while (i10 < zzaeqVar.size()) {
            zzadaVar2.zzt(zzaeqVar.zzc(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzago
    public final void zzz(int i7, List list, boolean z3) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzaeq)) {
            if (!z3) {
                while (i10 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            zzada zzadaVar = this.zza;
            zzadaVar.zzb(i7, 2);
            int iZzF = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iZzF += zzada.zzF(((Long) list.get(i11)).longValue());
            }
            zzadaVar.zzr(iZzF);
            while (i10 < list.size()) {
                zzadaVar.zzt(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        if (!z3) {
            while (i10 < zzaeqVar.size()) {
                this.zza.zzf(i7, zzaeqVar.zzc(i10));
                i10++;
            }
            return;
        }
        zzada zzadaVar2 = this.zza;
        zzadaVar2.zzb(i7, 2);
        int iZzF2 = 0;
        for (int i12 = 0; i12 < zzaeqVar.size(); i12++) {
            iZzF2 += zzada.zzF(zzaeqVar.zzc(i12));
        }
        zzadaVar2.zzr(iZzF2);
        while (i10 < zzaeqVar.size()) {
            zzadaVar2.zzt(zzaeqVar.zzc(i10));
            i10++;
        }
    }
}
