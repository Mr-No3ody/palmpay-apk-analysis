package com.google.android.gms.internal.measurement;

import androidx.camera.video.u;

/* JADX INFO: loaded from: classes2.dex */
final class zzyu implements zzyd {
    private final zzyd zza;
    private final Object zzb;

    private zzyu(zzyd zzydVar, Object obj) {
        zzabr.zza(zzydVar, "log site key");
        this.zza = zzydVar;
        zzabr.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    public static zzyd zza(zzyd zzydVar, Object obj) {
        return new zzyu(zzydVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyu)) {
            return false;
        }
        zzyu zzyuVar = (zzyu) obj;
        return this.zza.equals(zzyuVar.zza) && this.zzb.equals(zzyuVar.zzb);
    }

    public final int hashCode() {
        Object obj = this.zzb;
        return obj.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        u.x(sb2, "SpecializedLogSiteKey{ delegate='", string, "', qualifier='", string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
