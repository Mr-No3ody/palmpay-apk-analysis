package com.google.android.gms.internal.measurement;

import M.f;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzma {

    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza = new f(0);
    private final SharedPreferences zzb;
    private SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static synchronized void zza() {
        Map map = zza;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = ((zzma) it.next()).zzb;
            throw null;
        }
        map.clear();
    }
}
