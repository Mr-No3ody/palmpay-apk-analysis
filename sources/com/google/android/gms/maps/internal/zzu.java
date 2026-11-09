package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(i11);
        parcel2.writeNoException();
        return true;
    }
}
