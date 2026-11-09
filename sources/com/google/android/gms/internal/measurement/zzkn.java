package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkn extends zzbm implements zzko {
    public zzkn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.zzf(parcel);
        zzb(bArrCreateByteArray);
        return true;
    }
}
