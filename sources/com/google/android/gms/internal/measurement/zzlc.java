package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.camera.video.u;
import com.google.common.base.Supplier;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class zzlc extends zzlt {
    private final Context zza;

    @Nullable
    private final Supplier zzb;

    public zzlc(Context context, @Nullable Supplier supplier) {
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        Supplier supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzlt) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zza.equals(zzltVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zzltVar.zzb()) : zzltVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        Supplier supplier = this.zzb;
        return (iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        u.x(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    @Nullable
    public final Supplier zzb() {
        return this.zzb;
    }
}
