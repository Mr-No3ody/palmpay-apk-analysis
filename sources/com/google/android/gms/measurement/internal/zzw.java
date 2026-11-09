package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.airbnb.lottie.model.layer.d;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.internal.measurement.zzaif;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw extends BroadcastReceiver {
    private final zzic zza;

    public zzw(zzic zzicVar) {
        this.zza = zzicVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        byte b7;
        if (intent == null) {
            d.t(this.zza, "App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            d.t(this.zza, "App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            b7 = 0;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            if (b7 != 1) {
                d.t(this.zza, "App receiver called with unknown action");
                return;
            }
            zzic zzicVar = this.zza;
            zzicVar.zzaW().zzk().zza("[sgtm] App Receiver notified batches are available");
            zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza();
                }
            });
            return;
        }
        final zzic zzicVar2 = this.zza;
        zzaif.zza();
        if (zzicVar2.zzc().zzp(null, zzfy.zzaP)) {
            zzicVar2.zzaW().zzk().zza("App receiver notified triggers are available");
            zzicVar2.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzic zzicVar3 = zzicVar2;
                    if (!zzicVar3.zzk().zzU()) {
                        d.t(zzicVar3, "registerTrigger called but app not eligible");
                        return;
                    }
                    zzicVar3.zzj().zzv();
                    final zzlj zzljVarZzj = zzicVar3.zzj();
                    Objects.requireNonNull(zzljVarZzj);
                    ShadowThread.setThreadName(new ShadowThread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzljVarZzj.zzw();
                        }
                    }, "\u200bcom.google.android.gms.measurement.internal.zzu"), "\u200bcom.google.android.gms.measurement.internal.zzu").start();
                }
            });
        }
    }

    public final /* synthetic */ void zza() {
        this.zza.zzx().zzh(((Long) zzfy.zzC.zzb(null)).longValue());
    }
}
