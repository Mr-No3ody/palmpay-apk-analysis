package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbe extends com.google.android.gms.internal.maps.zzb implements zzbf {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        PointOfInterest pointOfInterest = (PointOfInterest) com.google.android.gms.internal.maps.zzc.zza(parcel, PointOfInterest.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(pointOfInterest);
        parcel2.writeNoException();
        return true;
    }
}
