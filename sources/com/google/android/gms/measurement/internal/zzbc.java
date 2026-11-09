package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final zzbf zzg;

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j6, long j10, long j11, Bundle bundle) {
        zzbf zzbfVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j6;
        this.zze = j10;
        this.zzf = j11;
        if (j11 != 0 && j11 > j6) {
            zzicVar.zzaW().zze().zzb("Event created with reverse previous/current timestamps. appId", zzgu.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzicVar.zzaW().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzG = zzicVar.zzk().zzG(next, bundle2.get(next));
                    if (objZzG == null) {
                        zzicVar.zzaW().zze().zzb("Param value can't be null", zzicVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzicVar.zzk().zzO(bundle2, next, objZzG);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.zzg = zzbfVar;
    }

    public final String toString() {
        String string = this.zzg.toString();
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        u.x(sb2, "Event{appId='", str, "', name='", str2);
        return F.d(sb2, "', params=", string, "}");
    }

    public final zzbc zza(zzic zzicVar, long j6) {
        return new zzbc(zzicVar, this.zzc, this.zza, this.zzb, this.zzd, this.zze, j6, this.zzg);
    }

    private zzbc(zzic zzicVar, String str, String str2, String str3, long j6, long j10, long j11, zzbf zzbfVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbfVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j6;
        this.zze = j10;
        this.zzf = j11;
        if (j11 != 0 && j11 > j6) {
            zzicVar.zzaW().zze().zzc("Event created with reverse previous/current timestamps. appId, name", zzgu.zzl(str2), zzgu.zzl(str3));
        }
        this.zzg = zzbfVar;
    }
}
