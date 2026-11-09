package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzkl implements Closeable {
    private static final Map zza = new HashMap();
    private final String zzb;
    private int zzc;
    private double zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    private zzkl(String str) {
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
        this.zzb = str;
    }

    private final void zza() {
        this.zzc = 0;
        this.zzd = 0.0d;
        this.zze = 0L;
        this.zzg = 2147483647L;
        this.zzh = -2147483648L;
    }

    public static zzkl zze(String str) {
        zzlk.zza();
        if (!zzlk.zzb()) {
            return zzkj.zza;
        }
        Map map = zza;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new zzkl("detectorTaskWithResource#run"));
        }
        return (zzkl) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j6 = this.zze;
        if (j6 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        zzd(j6);
    }

    public zzkl zzb() {
        this.zze = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void zzc(long j6) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j10 = this.zzf;
        if (j10 != 0 && jElapsedRealtimeNanos - j10 >= 1000000) {
            zza();
        }
        this.zzf = jElapsedRealtimeNanos;
        this.zzc++;
        this.zzd += j6;
        this.zzg = Math.min(this.zzg, j6);
        this.zzh = Math.max(this.zzh, j6);
        if (this.zzc % 50 == 0) {
            Locale locale = Locale.US;
            zzlk.zza();
        }
        if (this.zzc % 500 == 0) {
            zza();
        }
    }

    public void zzd(long j6) {
        zzc((SystemClock.elapsedRealtimeNanos() / 1000) - j6);
    }
}
