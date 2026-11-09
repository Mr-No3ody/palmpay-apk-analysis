package com.google.android.gms.internal.measurement;

import M.n;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzle {
    private final n zza;

    public zzle(n nVar) {
        this.zza = nVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        n nVar = uri != null ? (n) this.zza.get(uri.toString()) : null;
        if (nVar == null) {
            return null;
        }
        return (String) nVar.get(str3);
    }
}
