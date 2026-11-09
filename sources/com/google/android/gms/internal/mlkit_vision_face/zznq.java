package com.google.android.gms.internal.mlkit_vision_face;

import C0.G;

/* JADX INFO: loaded from: classes2.dex */
final class zznq extends zznt {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zznq(String str, boolean z3, int i7, zznp zznpVar) {
        this.zza = str;
        this.zzb = z3;
        this.zzc = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznt) {
            zznt zzntVar = (zznt) obj;
            if (this.zza.equals(zzntVar.zzb()) && this.zzb == zzntVar.zzc() && this.zzc == zzntVar.zza()) {
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final boolean zzc() {
        return this.zzb;
    }
}
