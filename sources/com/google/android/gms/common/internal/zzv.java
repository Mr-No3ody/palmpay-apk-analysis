package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements zzx {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() throws RemoteException {
        return d.d(zzB(1, zza()));
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }
}
