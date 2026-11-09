package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 == 1) {
            com.google.android.gms.internal.maps.zzaj zzajVarZzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzd(zzajVarZzb);
        } else if (i7 == 2) {
            com.google.android.gms.internal.maps.zzaj zzajVarZzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(zzajVarZzb2);
        } else {
            if (i7 != 3) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaj zzajVarZzb3 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzajVarZzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
