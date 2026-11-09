package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzs extends com.google.android.gms.internal.maps.zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
