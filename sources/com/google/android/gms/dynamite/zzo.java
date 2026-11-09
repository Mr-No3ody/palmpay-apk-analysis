package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements DynamiteModule.VersionPolicy.IVersions {
    private final int zza;

    public zzo(int i7, int i10) {
        this.zza = i7;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(Context context, String str, boolean z3) {
        return 0;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(Context context, String str) {
        return this.zza;
    }
}
