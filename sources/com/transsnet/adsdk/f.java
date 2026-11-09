package com.transsnet.adsdk;

import android.os.IBinder;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements IRemoteDraw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f25574a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25574a;
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IRemoteDraw.DESCRIPTOR);
            IRemoteDraw._Parcel.writeTypedObject(parcelObtain, motionEvent, 0);
            this.f25574a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public final void release() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IRemoteDraw.DESCRIPTOR);
            this.f25574a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public final void setSurface(Surface surface, int i7, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IRemoteDraw.DESCRIPTOR);
            IRemoteDraw._Parcel.writeTypedObject(parcelObtain, surface, 0);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i10);
            this.f25574a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.transsnet.adsdk.IRemoteDraw
    public final void setWebUrl(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IRemoteDraw.DESCRIPTOR);
            parcelObtain.writeString(str);
            this.f25574a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
