package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzak extends com.google.android.gms.internal.maps.zzb implements zzal {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzag zzagVarZzb = com.google.android.gms.internal.maps.zzaf.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzagVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
