package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z3 = parcel.readInt() != 0;
        zzc.zzb(parcel);
        zzb(status, z3);
        return true;
    }
}
