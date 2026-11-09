package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzs extends zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 == 1) {
            int i11 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            zzc.zzd(parcel);
            zzb(i11, strArrCreateStringArray);
        } else if (i7 == 2) {
            int i12 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            zzc.zzd(parcel);
            zzc(i12, strArrCreateStringArray2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
            zzc.zzd(parcel);
            zzd(i13, pendingIntent);
        }
        return true;
    }
}
