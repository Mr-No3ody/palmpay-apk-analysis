package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw {
    private final String zza;
    private final zzv zzb;
    private zzv zzc;

    public /* synthetic */ zzw(String str, zzt zztVar) {
        zzv zzvVar = new zzv(null);
        this.zzb = zzvVar;
        this.zzc = zzvVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzv zzvVar = this.zzb.zzc;
        String str = "";
        while (zzvVar != null) {
            Object obj = zzvVar.zzb;
            sb2.append(str);
            String str2 = zzvVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzvVar = zzvVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzw zza(String str, @CheckForNull Object obj) {
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = obj;
        zzvVar.zza = str;
        return this;
    }

    public final zzw zzb(String str, boolean z3) {
        String strValueOf = String.valueOf(z3);
        zzu zzuVar = new zzu(null);
        this.zzc.zzc = zzuVar;
        this.zzc = zzuVar;
        zzuVar.zzb = strValueOf;
        zzuVar.zza = "isManifestFile";
        return this;
    }
}
