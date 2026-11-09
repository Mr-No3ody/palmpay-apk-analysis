package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            onPostInitComplete(i11, strongBinder, bundle);
        } else if (i7 == 2) {
            int i12 = parcel.readInt();
            Bundle bundle2 = (Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzb(i12, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.zzb(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            zzc(i13, strongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
