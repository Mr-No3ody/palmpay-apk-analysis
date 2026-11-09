package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) zzc.zza(parcel, LocationSettingsResult.CREATOR);
        zzc.zzd(parcel);
        zzb(locationSettingsResult);
        return true;
    }
}
