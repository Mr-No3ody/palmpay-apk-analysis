package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 == 1) {
            zzl zzlVar = (zzl) zzc.zza(parcel, zzl.CREATOR);
            zzc.zzd(parcel);
            zzd(zzlVar);
        } else {
            if (i7 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
