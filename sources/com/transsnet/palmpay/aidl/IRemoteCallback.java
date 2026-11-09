package com.transsnet.palmpay.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IRemoteCallback extends IInterface {
    public static final String DESCRIPTOR = "com.transsnet.palmpay.aidl.IRemoteCallback";

    public static class Default implements IRemoteCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.transsnet.palmpay.aidl.IRemoteCallback
        public void notifyEvent(Msg msg) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemoteCallback {
        static final int TRANSACTION_notifyEvent = 1;

        public static class Proxy implements IRemoteCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRemoteCallback.DESCRIPTOR;
            }

            @Override // com.transsnet.palmpay.aidl.IRemoteCallback
            public void notifyEvent(Msg msg) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRemoteCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, msg, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRemoteCallback.DESCRIPTOR);
        }

        public static IRemoteCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRemoteCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteCallback)) ? new Proxy(iBinder) : (IRemoteCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(IRemoteCallback.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(IRemoteCallback.DESCRIPTOR);
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            notifyEvent((Msg) _Parcel.readTypedObject(parcel, Msg.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i7) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i7);
            }
        }
    }

    void notifyEvent(Msg msg) throws RemoteException;
}
