package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzhb extends BroadcastReceiver {
    private final zzpg zza;
    private boolean zzb;
    private boolean zzc;

    public zzhb(zzpg zzpgVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        String action = intent.getAction();
        zzpgVar.zzaW().zzk().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpgVar.zzaW().zze().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzb = zzpgVar.zzi().zzb();
        if (this.zzc != zZzb) {
            this.zzc = zZzb;
            zzpgVar.zzaX().zzj(new zzha(this, zZzb));
        }
    }

    @WorkerThread
    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaX().zzg();
        if (this.zzb) {
            return;
        }
        zzpgVar.zzaZ().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpgVar.zzi().zzb();
        zzpgVar.zzaW().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    @WorkerThread
    public final void zzb() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaX().zzg();
        zzpgVar.zzaX().zzg();
        if (this.zzb) {
            zzpgVar.zzaW().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpgVar.zzaZ().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zza.zzaW().zzb().zzb("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ zzpg zzc() {
        return this.zza;
    }
}
