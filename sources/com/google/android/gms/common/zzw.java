package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzw {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzw(String str, boolean z3, boolean z8, boolean z10, boolean z11, boolean z12, byte[] bArr) {
        this.zza = str;
        this.zzb = z3;
        this.zzc = z11;
    }

    public final boolean zza() {
        return this.zzc;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public final zzp zzb(Context context) {
        return new zzp(this.zza, this.zzb, false, ObjectWrapper.wrap(context), false, true, false);
    }
}
