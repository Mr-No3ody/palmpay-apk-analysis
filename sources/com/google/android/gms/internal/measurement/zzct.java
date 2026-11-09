package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzct extends zzbl implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void zze() throws RemoteException {
        zzd(2, zza());
    }
}
