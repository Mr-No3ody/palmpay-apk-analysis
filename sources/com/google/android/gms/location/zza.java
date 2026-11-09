package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zza {
    private long zza = Long.MIN_VALUE;

    public final zza zza(long j6) {
        Preconditions.checkArgument(j6 >= 0, "intervalMillis can't be negative.");
        this.zza = j6;
        return this;
    }

    public final zzb zzb() {
        Preconditions.checkState(this.zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
