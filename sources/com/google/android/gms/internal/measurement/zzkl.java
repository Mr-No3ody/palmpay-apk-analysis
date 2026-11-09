package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.ShowFirstParty;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzkl {
    public static boolean zza(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
