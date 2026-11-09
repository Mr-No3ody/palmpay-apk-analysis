package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements zzn {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcel, CameraPosition.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
