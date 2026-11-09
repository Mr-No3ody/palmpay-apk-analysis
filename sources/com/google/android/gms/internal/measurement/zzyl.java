package com.google.android.gms.internal.measurement;

import C0.G;
import androidx.camera.video.u;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class zzyl {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final long zze;

    public zzyl(String str, Class cls, boolean z3) {
        this(str, cls, z3, true);
    }

    public static zzyl zzc(String str, Class cls) {
        return new zzyl(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        u.x(sb2, name, "/", str, "[");
        return G.r(sb2, name2, "]");
    }

    public void zza(Iterator it, zzyk zzykVar) {
        while (it.hasNext()) {
            zzb(it.next(), zzykVar);
        }
    }

    public void zzb(Object obj, zzyk zzykVar) {
        zzykVar.zza(this.zza, obj);
    }

    public final String zzd() {
        return this.zza;
    }

    public final Object zze(Object obj) {
        return this.zzb.cast(obj);
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final void zzg(Object obj, zzyk zzykVar) {
        if (!this.zzd || zzaad.zza() <= 20) {
            zzb(obj, zzykVar);
        } else {
            zzykVar.zza(this.zza, obj);
        }
    }

    public final void zzh(Iterator it, zzyk zzykVar) {
        zzabr.zzc(this.zzc, "non repeating key");
        if (!this.zzd || zzaad.zza() <= 20) {
            zza(it, zzykVar);
        } else {
            while (it.hasNext()) {
                zzykVar.zza(this.zza, it.next());
            }
        }
    }

    public final long zzi() {
        return this.zze;
    }

    private zzyl(String str, Class cls, boolean z3, boolean z8) {
        zzabr.zzd(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z3;
        this.zzd = z8;
        int iIdentityHashCode = System.identityHashCode(this);
        long j6 = 0;
        for (int i7 = 0; i7 < 5; i7++) {
            j6 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.zze = j6;
    }
}
