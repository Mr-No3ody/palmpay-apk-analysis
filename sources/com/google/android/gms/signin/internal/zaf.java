package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes2.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i7) throws RemoteException {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i7);
        zac(7, parcelZaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i7, boolean z3) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i7);
        parcelZaa.writeInt(z3 ? 1 : 0);
        zac(9, parcelZaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zab(parcelZaa, zaiVar);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaeVar);
        zac(12, parcelZaa);
    }
}
