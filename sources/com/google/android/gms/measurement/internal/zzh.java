package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzh {

    @Nullable
    private Long zzA;
    private long zzB;

    @Nullable
    private String zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private String zzG;

    @Nullable
    private byte[] zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private long zzP;

    @Nullable
    private String zzQ;
    private boolean zzR;
    private long zzS;
    private long zzT;
    private final zzic zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private String zze;

    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    @Nullable
    private String zzj;
    private long zzk;

    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;

    @Nullable
    private Boolean zzq;
    private long zzr;

    @Nullable
    private List zzs;

    @Nullable
    private String zzt;
    private boolean zzu;
    private long zzv;
    private long zzw;
    private int zzx;
    private boolean zzy;

    @Nullable
    private Long zzz;

    @WorkerThread
    public zzh(zzic zzicVar, String str) {
        Preconditions.checkNotNull(zzicVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzicVar;
        this.zzb = str;
        zzicVar.zzaX().zzg();
    }

    @WorkerThread
    public final void zzA(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzn != j6;
        this.zzn = j6;
    }

    @WorkerThread
    public final long zzB() {
        this.zza.zzaX().zzg();
        return this.zzr;
    }

    @WorkerThread
    public final void zzC(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzr != j6;
        this.zzr = j6;
    }

    @WorkerThread
    public final boolean zzD() {
        this.zza.zzaX().zzg();
        return this.zzo;
    }

    @WorkerThread
    public final void zzE(boolean z3) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzo != z3;
        this.zzo = z3;
    }

    @WorkerThread
    public final void zzF(long j6) {
        Preconditions.checkArgument(j6 >= 0);
        this.zza.zzaX().zzg();
        this.zzR |= this.zzg != j6;
        this.zzg = j6;
    }

    @WorkerThread
    public final long zzG() {
        this.zza.zzaX().zzg();
        return this.zzg;
    }

    @WorkerThread
    public final long zzH() {
        this.zza.zzaX().zzg();
        return this.zzS;
    }

    @WorkerThread
    public final void zzI(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzS != j6;
        this.zzS = j6;
    }

    @WorkerThread
    public final long zzJ() {
        this.zza.zzaX().zzg();
        return this.zzT;
    }

    @WorkerThread
    public final void zzK(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzT != j6;
        this.zzT = j6;
    }

    @WorkerThread
    public final void zzL() {
        zzic zzicVar = this.zza;
        zzicVar.zzaX().zzg();
        long j6 = this.zzg + 1;
        if (j6 > 2147483647L) {
            zzicVar.zzaW().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j6 = 0;
        }
        this.zzR = true;
        this.zzg = j6;
    }

    @WorkerThread
    public final void zzM(long j6) {
        zzic zzicVar = this.zza;
        zzicVar.zzaX().zzg();
        long j10 = this.zzg + j6;
        if (j10 > 2147483647L) {
            zzicVar.zzaW().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j10 = (-1) + j6;
        }
        long j11 = this.zzF + 1;
        if (j11 > 2147483647L) {
            zzicVar.zzaW().zze().zzb("Delivery index overflow. appId", zzgu.zzl(this.zzb));
            j11 = 0;
        }
        this.zzR = true;
        this.zzg = j10;
        this.zzF = j11;
    }

    @WorkerThread
    public final long zzN() {
        this.zza.zzaX().zzg();
        return this.zzK;
    }

    @WorkerThread
    public final void zzO(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzK != j6;
        this.zzK = j6;
    }

    @WorkerThread
    public final long zzP() {
        this.zza.zzaX().zzg();
        return this.zzL;
    }

    @WorkerThread
    public final void zzQ(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzL != j6;
        this.zzL = j6;
    }

    @WorkerThread
    public final long zzR() {
        this.zza.zzaX().zzg();
        return this.zzM;
    }

    @WorkerThread
    public final void zzS(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzM != j6;
        this.zzM = j6;
    }

    @WorkerThread
    public final long zzT() {
        this.zza.zzaX().zzg();
        return this.zzN;
    }

    @WorkerThread
    public final void zzU(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzN != j6;
        this.zzN = j6;
    }

    @WorkerThread
    public final long zzV() {
        this.zza.zzaX().zzg();
        return this.zzP;
    }

    @WorkerThread
    public final void zzW(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzP != j6;
        this.zzP = j6;
    }

    @WorkerThread
    public final long zzX() {
        this.zza.zzaX().zzg();
        return this.zzO;
    }

    @WorkerThread
    public final void zzY(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzO != j6;
        this.zzO = j6;
    }

    @Nullable
    @WorkerThread
    public final String zzZ() {
        this.zza.zzaX().zzg();
        return this.zzQ;
    }

    @WorkerThread
    public final boolean zza() {
        this.zza.zzaX().zzg();
        return this.zzR;
    }

    @WorkerThread
    public final int zzaA() {
        this.zza.zzaX().zzg();
        return this.zzD;
    }

    @WorkerThread
    public final void zzaB(int i7) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzD != i7;
        this.zzD = i7;
    }

    @WorkerThread
    public final int zzaC() {
        this.zza.zzaX().zzg();
        return this.zzE;
    }

    @WorkerThread
    public final void zzaD(int i7) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzE != i7;
        this.zzE = i7;
    }

    @WorkerThread
    public final void zzaE(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzF != j6;
        this.zzF = j6;
    }

    @WorkerThread
    public final long zzaF() {
        this.zza.zzaX().zzg();
        return this.zzF;
    }

    @WorkerThread
    public final void zzaG(String str) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzG != str;
        this.zzG = str;
    }

    @WorkerThread
    public final String zzaH() {
        this.zza.zzaX().zzg();
        return this.zzG;
    }

    @WorkerThread
    public final void zzaI(@Nullable byte[] bArr) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzH != bArr;
        this.zzH = bArr;
    }

    @Nullable
    @WorkerThread
    public final byte[] zzaJ() {
        this.zza.zzaX().zzg();
        return this.zzH;
    }

    @WorkerThread
    public final void zzaK(int i7) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzI != i7;
        this.zzI = i7;
    }

    @WorkerThread
    public final int zzaL() {
        this.zza.zzaX().zzg();
        return this.zzI;
    }

    @WorkerThread
    public final void zzaM(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzJ != j6;
        this.zzJ = j6;
    }

    @WorkerThread
    public final long zzaN() {
        this.zza.zzaX().zzg();
        return this.zzJ;
    }

    @Nullable
    @WorkerThread
    public final String zzaa() {
        this.zza.zzaX().zzg();
        String str = this.zzQ;
        zzab(null);
        return str;
    }

    @WorkerThread
    public final void zzab(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzQ, str);
        this.zzQ = str;
    }

    @WorkerThread
    public final boolean zzac() {
        this.zza.zzaX().zzg();
        return this.zzp;
    }

    @WorkerThread
    public final void zzad(boolean z3) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzp != z3;
        this.zzp = z3;
    }

    @Nullable
    @WorkerThread
    public final Boolean zzae() {
        this.zza.zzaX().zzg();
        return this.zzq;
    }

    @WorkerThread
    public final void zzaf(@Nullable Boolean bool) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzq, bool);
        this.zzq = bool;
    }

    @Nullable
    @WorkerThread
    public final List zzag() {
        this.zza.zzaX().zzg();
        return this.zzs;
    }

    @WorkerThread
    public final void zzah(@Nullable List list) {
        this.zza.zzaX().zzg();
        if (Objects.equals(this.zzs, list)) {
            return;
        }
        this.zzR = true;
        this.zzs = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final boolean zzai() {
        this.zza.zzaX().zzg();
        return this.zzu;
    }

    @WorkerThread
    public final void zzaj(boolean z3) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzu != z3;
        this.zzu = z3;
    }

    @WorkerThread
    public final long zzak() {
        this.zza.zzaX().zzg();
        return this.zzv;
    }

    @WorkerThread
    public final void zzal(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzv != j6;
        this.zzv = j6;
    }

    @WorkerThread
    public final long zzam() {
        this.zza.zzaX().zzg();
        return this.zzw;
    }

    @WorkerThread
    public final void zzan(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzw != j6;
        this.zzw = j6;
    }

    @WorkerThread
    public final int zzao() {
        this.zza.zzaX().zzg();
        return this.zzx;
    }

    @WorkerThread
    public final void zzap(int i7) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzx != i7;
        this.zzx = i7;
    }

    @WorkerThread
    public final boolean zzaq() {
        this.zza.zzaX().zzg();
        return this.zzy;
    }

    @WorkerThread
    public final void zzar(boolean z3) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzy != z3;
        this.zzy = z3;
    }

    @Nullable
    @WorkerThread
    public final Long zzas() {
        this.zza.zzaX().zzg();
        return this.zzz;
    }

    @WorkerThread
    public final void zzat(@Nullable Long l5) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzz, l5);
        this.zzz = l5;
    }

    @Nullable
    @WorkerThread
    public final Long zzau() {
        this.zza.zzaX().zzg();
        return this.zzA;
    }

    @WorkerThread
    public final void zzav(@Nullable Long l5) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzA, l5);
        this.zzA = l5;
    }

    @WorkerThread
    public final long zzaw() {
        this.zza.zzaX().zzg();
        return this.zzB;
    }

    @WorkerThread
    public final void zzax(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzB != j6;
        this.zzB = j6;
    }

    @Nullable
    @WorkerThread
    public final String zzay() {
        this.zza.zzaX().zzg();
        return this.zzC;
    }

    @WorkerThread
    public final void zzaz(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzC != str;
        this.zzC = str;
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzaX().zzg();
        this.zzR = false;
    }

    @WorkerThread
    public final String zzc() {
        this.zza.zzaX().zzg();
        return this.zzb;
    }

    @Nullable
    @WorkerThread
    public final String zzd() {
        this.zza.zzaX().zzg();
        return this.zzc;
    }

    @WorkerThread
    public final void zze(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    @Nullable
    @WorkerThread
    public final String zzf() {
        this.zza.zzaX().zzg();
        return this.zzd;
    }

    @WorkerThread
    public final void zzg(@Nullable String str) {
        this.zza.zzaX().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    @Nullable
    @WorkerThread
    public final String zzh() {
        this.zza.zzaX().zzg();
        return this.zzt;
    }

    @WorkerThread
    public final void zzi(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzt, str);
        this.zzt = str;
    }

    @Nullable
    @WorkerThread
    public final String zzj() {
        this.zza.zzaX().zzg();
        return this.zze;
    }

    @WorkerThread
    public final void zzk(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    @Nullable
    @WorkerThread
    public final String zzl() {
        this.zza.zzaX().zzg();
        return this.zzf;
    }

    @WorkerThread
    public final void zzm(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    @WorkerThread
    public final long zzn() {
        this.zza.zzaX().zzg();
        return this.zzh;
    }

    @WorkerThread
    public final void zzo(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzh != j6;
        this.zzh = j6;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzaX().zzg();
        return this.zzi;
    }

    @WorkerThread
    public final void zzq(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzi != j6;
        this.zzi = j6;
    }

    @Nullable
    @WorkerThread
    public final String zzr() {
        this.zza.zzaX().zzg();
        return this.zzj;
    }

    @WorkerThread
    public final void zzs(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    @WorkerThread
    public final long zzt() {
        this.zza.zzaX().zzg();
        return this.zzk;
    }

    @WorkerThread
    public final void zzu(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzk != j6;
        this.zzk = j6;
    }

    @Nullable
    @WorkerThread
    public final String zzv() {
        this.zza.zzaX().zzg();
        return this.zzl;
    }

    @WorkerThread
    public final void zzw(@Nullable String str) {
        this.zza.zzaX().zzg();
        this.zzR |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    @WorkerThread
    public final long zzx() {
        this.zza.zzaX().zzg();
        return this.zzm;
    }

    @WorkerThread
    public final void zzy(long j6) {
        this.zza.zzaX().zzg();
        this.zzR |= this.zzm != j6;
        this.zzm = j6;
    }

    @WorkerThread
    public final long zzz() {
        this.zza.zzaX().zzg();
        return this.zzn;
    }
}
