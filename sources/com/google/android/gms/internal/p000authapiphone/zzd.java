package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        int i11 = parcel.readInt();
        zzc.zzb(parcel);
        zzb(status, i11);
        return true;
    }
}
