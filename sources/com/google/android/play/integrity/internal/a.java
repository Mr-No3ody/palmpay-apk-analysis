package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f22741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22742b;

    public a(IBinder iBinder, String str) {
        this.f22741a = iBinder;
        this.f22742b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22742b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22741a;
    }

    public final void b(int i7, Parcel parcel) throws RemoteException {
        try {
            this.f22741a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
