package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzld {
    private static final ConcurrentMap zza = new ConcurrentHashMap();

    public static void zza() {
        Iterator it = zza.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
