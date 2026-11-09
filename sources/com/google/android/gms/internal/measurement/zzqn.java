package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqn {
    private final boolean zza;

    @NotNull
    private final List zzb;

    @NotNull
    private final zzacr zzc;

    @NotNull
    private final String zzd;

    @NotNull
    private final String zze;

    @NotNull
    private final List zzf;

    @NotNull
    private final List zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;

    @NotNull
    private final zznf zzk;

    public zzqn(boolean z3, @NotNull List enabledBackings, @NotNull zzacr secret, @NotNull String dirPath, @NotNull String gmsCoreDirPath, @NotNull List includeStaticConfigPackages, @NotNull List excludeStaticConfigPackages, boolean z8, boolean z10, boolean z11, @NotNull zznf clientFlags) {
        Intrinsics.checkNotNullParameter(enabledBackings, "enabledBackings");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(gmsCoreDirPath, "gmsCoreDirPath");
        Intrinsics.checkNotNullParameter(includeStaticConfigPackages, "includeStaticConfigPackages");
        Intrinsics.checkNotNullParameter(excludeStaticConfigPackages, "excludeStaticConfigPackages");
        Intrinsics.checkNotNullParameter(clientFlags, "clientFlags");
        this.zza = z3;
        this.zzb = enabledBackings;
        this.zzc = secret;
        this.zzd = dirPath;
        this.zze = gmsCoreDirPath;
        this.zzf = includeStaticConfigPackages;
        this.zzg = excludeStaticConfigPackages;
        this.zzh = z8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = clientFlags;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqn)) {
            return false;
        }
        zzqn zzqnVar = (zzqn) obj;
        return this.zza == zzqnVar.zza && Intrinsics.c(this.zzb, zzqnVar.zzb) && Intrinsics.c(this.zzc, zzqnVar.zzc) && Intrinsics.c(this.zzd, zzqnVar.zzd) && Intrinsics.c(this.zze, zzqnVar.zze) && Intrinsics.c(this.zzf, zzqnVar.zzf) && Intrinsics.c(this.zzg, zzqnVar.zzg) && this.zzh == zzqnVar.zzh && this.zzi == zzqnVar.zzi && this.zzj == zzqnVar.zzj && Intrinsics.c(this.zzk, zzqnVar.zzk);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, Boolean.valueOf(this.zzh), Boolean.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    @NotNull
    public final String toString() {
        boolean z3 = this.zza;
        int length = String.valueOf(z3).length();
        List list = this.zzb;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.zzc;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.zzd;
        int length4 = String.valueOf(str).length();
        String str2 = this.zze;
        int length5 = String.valueOf(str2).length();
        List list2 = this.zzf;
        int length6 = String.valueOf(list2).length();
        List list3 = this.zzg;
        int length7 = String.valueOf(list3).length();
        boolean z8 = this.zzh;
        int length8 = String.valueOf(z8).length();
        boolean z10 = this.zzi;
        int length9 = String.valueOf(z10).length();
        boolean z11 = this.zzj;
        int length10 = String.valueOf(z11).length();
        zznf zznfVar = this.zzk;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(zznfVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z3);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(zzacrVar);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z8);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z10);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z11);
        sb2.append(", clientFlags=");
        sb2.append(zznfVar);
        sb2.append(")");
        return sb2.toString();
    }

    @NotNull
    public final zzacr zza() {
        return this.zzc;
    }

    @NotNull
    public final String zzb() {
        return this.zzd;
    }

    @NotNull
    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zzi;
    }

    public final boolean zze() {
        return this.zzj;
    }

    @NotNull
    public final zznf zzf() {
        return this.zzk;
    }

    @Nullable
    public final int zzg(@NotNull zzabz androidBacking, @NotNull String staticPackageName) {
        Intrinsics.checkNotNullParameter(androidBacking, "androidBacking");
        Intrinsics.checkNotNullParameter(staticPackageName, "staticPackageName");
        if (!this.zzh) {
            return 14;
        }
        Intrinsics.checkNotNullParameter(androidBacking, "androidBacking");
        if (!this.zza || !this.zzb.contains(androidBacking)) {
            return 3;
        }
        if (this.zzc.zzb() == 0) {
            return 4;
        }
        List list = this.zzf;
        if (list.isEmpty() || list.contains(staticPackageName)) {
            return this.zzg.contains(staticPackageName) ? 6 : 0;
        }
        return 5;
    }
}
