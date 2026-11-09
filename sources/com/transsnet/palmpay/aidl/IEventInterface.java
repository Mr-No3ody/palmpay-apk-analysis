package com.transsnet.palmpay.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IEventInterface extends IInterface {
    public static final String DESCRIPTOR = "com.transsnet.palmpay.aidl.IEventInterface";

    public static class Default implements IEventInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.transsnet.palmpay.aidl.IEventInterface
        public void notify(Msg msg) throws RemoteException {
        }

        @Override // com.transsnet.palmpay.aidl.IEventInterface
        public void registerCallback(IRemoteCallback iRemoteCallback) throws RemoteException {
        }

        @Override // com.transsnet.palmpay.aidl.IEventInterface
        public void unregisterCallback(IRemoteCallback iRemoteCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEventInterface {
        static final int TRANSACTION_notify = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;

        public static class Proxy implements IEventInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEventInterface.DESCRIPTOR;
            }

            @Override // com.transsnet.palmpay.aidl.IEventInterface
            public void notify(Msg msg) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEventInterface.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, msg, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.transsnet.palmpay.aidl.IEventInterface
            public void registerCallback(IRemoteCallback iRemoteCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEventInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRemoteCallback);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.transsnet.palmpay.aidl.IEventInterface
            public void unregisterCallback(IRemoteCallback iRemoteCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEventInterface.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRemoteCallback);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IEventInterface.DESCRIPTOR);
        }

        public static IEventInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEventInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEventInterface)) ? new Proxy(iBinder) : (IEventInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(IEventInterface.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(IEventInterface.DESCRIPTOR);
                return true;
            }
            if (i7 == 1) {
                registerCallback(IRemoteCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i7 == 2) {
                unregisterCallback(IRemoteCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i7 != 3) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            notify((Msg) _Parcel.readTypedObject(parcel, Msg.CREATOR));
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

    void notify(Msg msg) throws RemoteException;

    void registerCallback(IRemoteCallback iRemoteCallback) throws RemoteException;

    void unregisterCallback(IRemoteCallback iRemoteCallback) throws RemoteException;
}
