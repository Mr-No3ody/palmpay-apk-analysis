package com.adjust.sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class O implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f19334a;

    public O(IBinder iBinder) {
        this.f19334a = iBinder;
    }

    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f19334a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19334a;
    }

    public final Boolean b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.f19334a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return Boolean.valueOf(!(parcelObtain2.readInt() != 0));
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
