package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public zza(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    public final void zzb(int i7, Parcel parcel) throws RemoteException {
        try {
            this.zza.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
