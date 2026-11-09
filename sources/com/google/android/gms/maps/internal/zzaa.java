package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 == 1) {
            zzb();
        } else {
            if (i7 != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaa zzaaVarZzb = com.google.android.gms.internal.maps.zzz.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzaaVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
