package com.google.android.gms.internal.mlkit_common;

import C0.G;

/* JADX INFO: loaded from: classes2.dex */
final class zzmd extends zzmj {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzmd(String str, boolean z3, int i7, zzmc zzmcVar) {
        this.zza = str;
        this.zzb = z3;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzmj) {
            zzmj zzmjVar = (zzmj) obj;
            if (this.zza.equals(zzmjVar.zzb()) && this.zzb == zzmjVar.zzc() && this.zzc == zzmjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z3 = this.zzb;
        int i7 = this.zzc;
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z3);
        sb2.append(", firelogEventType=");
        return G.n(i7, "}", sb2);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmj
    public final boolean zzc() {
        return this.zzb;
    }
}
