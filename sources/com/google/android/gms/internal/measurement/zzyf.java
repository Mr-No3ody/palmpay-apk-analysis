package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzyf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();

    public abstract Object zza();

    public final Object zzb(zzyd zzydVar, zzzj zzzjVar) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object objZza = zza();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, objZza);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iZza = zzzjVar.zza();
        zzye zzyeVar = null;
        for (int i7 = 0; i7 < iZza; i7++) {
            if (zzxx.zzf.equals(zzzjVar.zzb(i7))) {
                Object objZzc = zzzjVar.zzc(i7);
                if (objZzc instanceof zzyj) {
                    if (zzyeVar == null) {
                        zzyeVar = new zzye(this, zzydVar);
                    }
                    ((zzyj) objZzc).zza();
                }
            }
        }
        return objZza;
    }

    public final /* synthetic */ ConcurrentHashMap zzc() {
        return this.zza;
    }
}
