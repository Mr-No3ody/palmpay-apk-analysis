package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zal extends com.google.android.gms.internal.base.zab implements zam {
    public zal() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        com.google.android.gms.internal.base.zac.zad(parcel);
        zab(i11);
        return true;
    }
}
