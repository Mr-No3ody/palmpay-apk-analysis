package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzafr extends zzafv {
    public zzafr() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzafv
    public final void zza() {
        if (!zzb()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                Map.Entry entryZzd = zzd(i7);
                if (((zzadj) ((zzafs) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzadj) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
