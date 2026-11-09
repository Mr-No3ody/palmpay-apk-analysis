package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzlv implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ zzlu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzmb zze;

    public zzlv(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j6) {
        this.zza = bundle;
        this.zzb = zzluVar;
        this.zzc = zzluVar2;
        this.zzd = j6;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.zza;
        bundle.remove("screen_name");
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzmb zzmbVar = this.zze;
        zzmbVar.zzm(this.zzb, this.zzc, this.zzd, true, zzmbVar.zzu.zzk().zzH(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }
}
