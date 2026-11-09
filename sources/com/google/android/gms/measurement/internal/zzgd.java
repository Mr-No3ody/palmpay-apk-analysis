package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgd extends com.google.android.gms.internal.measurement.zzbm implements zzge {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}
